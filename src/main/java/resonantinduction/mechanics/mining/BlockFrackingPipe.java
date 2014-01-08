package resonantinduction.mechanics.mining;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import resonantinduction.client.render.BlockRenderHelper;
import resonantinduction.transport.ResonantInductionTransport;

import com.builtbroken.common.Pair;
import com.builtbroken.minecraft.prefab.BlockMachine;

/** @author Archadia */
public class BlockFrackingPipe extends BlockMachine
{

	public BlockFrackingPipe()
	{
		super(ResonantInductionTransport.CONFIGURATION, "Fracking_Pipe", Material.wood);
	}

	@Override
	public void getClientTileEntityRenderers(List<Pair<Class<? extends TileEntity>, TileEntitySpecialRenderer>> list)
	{

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

	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return new TileFrackingPipe();
	}
}
