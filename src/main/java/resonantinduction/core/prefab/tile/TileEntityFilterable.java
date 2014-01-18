package resonantinduction.core.prefab.tile;

import java.util.Set;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.ForgeDirection;
import resonantinduction.api.IFilterable;
import resonantinduction.archaic.imprint.ItemBlockImprint;
import calclavia.lib.prefab.tile.IRotatable;
import calclavia.lib.prefab.tile.TileExternalInventory;

public abstract class TileEntityFilterable extends TileExternalInventory implements IRotatable, IFilterable
{
	private ItemStack filterItem;
	private boolean inverted;
	public static final int FILTER_SLOT = 0;
	public static final int BATERY_DRAIN_SLOT = 1;

	public TileEntityFilterable()
	{
		this.maxSlots = 2;
	}

	protected boolean isFunctioning()
	{
		return true;
	}

	/**
	 * Looks through the things in the filter and finds out which item is being filtered.
	 * 
	 * @return Is this filterable block filtering this specific ItemStack?
	 */
	public boolean isFiltering(ItemStack itemStack)
	{
		if (this.getFilter() != null && itemStack != null)
		{
			Set<ItemStack> checkStacks = ItemBlockImprint.getFilters(getFilter());

			if (checkStacks != null)
			{
				for (ItemStack stack : checkStacks)
				{
					if (stack.isItemEqual(itemStack))
					{
						return !inverted;
					}
				}
			}
		}

		return inverted;
	}

	@Override
	public void setFilter(ItemStack filter)
	{
		this.filterItem = filter;
		this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	@Override
	public ItemStack getFilter()
	{
		return this.filterItem;
	}

	public void setInverted(boolean inverted)
	{
		this.inverted = inverted;
		this.worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	public boolean isInverted()
	{
		return this.inverted;
	}

	public void toggleInversion()
	{
		setInverted(!isInverted());
	}

	@Override
	public ForgeDirection getDirection()
	{
		return ForgeDirection.getOrientation(getBlockType() != null ? getBlockMetadata() : 0);
	}

	@Override
	public void setDirection(ForgeDirection facingDirection)
	{
		this.worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, facingDirection.ordinal(), 3);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setBoolean("inverted", inverted);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		if (nbt.hasKey("filter"))
		{
			this.getInventory().setInventorySlotContents(0, ItemStack.loadItemStackFromNBT(nbt.getCompoundTag("filter")));
		}
		inverted = nbt.getBoolean("inverted");
	}

}
