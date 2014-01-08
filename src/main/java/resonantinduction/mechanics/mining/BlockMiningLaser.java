package resonantinduction.mechanics.mining;

import java.util.Set;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import resonantinduction.client.render.BlockRenderHelper;
import resonantinduction.transport.ResonantInductionTransport;

import com.builtbroken.common.Pair;
import com.builtbroken.minecraft.prefab.BlockMachine;

/**
 * Mining laser Prototype mainly used for crafting but can be used in the same way as Excavator.
 * Creates four lasers from the side it is pointing in to mine away blocks
 * 
 * @author DarkGuardsman
 */
public class BlockMiningLaser extends BlockMachine
{
	public BlockMiningLaser()
	{
		super(ResonantInductionTransport.CONFIGURATION, "LaserMiner", Material.iron);
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return new TileMiningLaser();
	}

	@Override
	public void getTileEntities(int blockID, Set<Pair<String, Class<? extends TileEntity>>> list)
	{
		list.add(new Pair<String, Class<? extends TileEntity>>("TileMiningLaser", TileMiningLaser.class));
	}

	@Override
	public boolean onUseWrench(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ)
	{
		if (!world.isRemote)
		{
			TileEntity ent = world.getBlockTileEntity(x, y, z);
			if (ent instanceof TileMiningLaser)
			{
				((TileMiningLaser) ent).rotateYaw(-10);
			}
		}
		return false;
	}

	@Override
	public boolean onSneakUseWrench(World world, int x, int y, int z, EntityPlayer entityPlayer, int side, float hitX, float hitY, float hitZ)
	{
		if (!world.isRemote)
		{
			TileEntity ent = world.getBlockTileEntity(x, y, z);
			if (ent instanceof TileMiningLaser)
			{
				((TileMiningLaser) ent).rotateYaw(10);
			}
		}
		return false;
	}

	@Override
	public int getRenderType()
	{
		return BlockRenderHelper.instance.getRenderId();
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

}
