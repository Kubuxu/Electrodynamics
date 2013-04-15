// Date: 4/15/2013 6:17:44 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package fluidmech.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelConstructionPump extends ModelBase
{
	// fields
	ModelRenderer Side3;
	ModelRenderer Motor2;
	ModelRenderer Motor;
	ModelRenderer side;
	ModelRenderer base;
	ModelRenderer side2;
	ModelRenderer side4;

	public ModelConstructionPump()
	{
		textureWidth = 128;
		textureHeight = 128;

		Side3 = new ModelRenderer(this, 46, 37);
		Side3.addBox(-5F, 0F, -3F, 10, 11, 5);
		Side3.setRotationPoint(0F, 10F, -4F);
		Side3.setTextureSize(64, 32);
		Side3.mirror = true;
		setRotation(Side3, 0F, 0F, 0F);
		Motor2 = new ModelRenderer(this, 10, 23);
		Motor2.addBox(-4F, -4F, 0F, 8, 8, 4);
		Motor2.setRotationPoint(0F, 15F, -2F);
		Motor2.setTextureSize(64, 32);
		Motor2.mirror = true;
		setRotation(Motor2, 0F, 0F, 0F);
		Motor = new ModelRenderer(this, 10, 23);
		Motor.addBox(-4F, -4F, 0F, 8, 8, 4);
		Motor.setRotationPoint(0F, 15F, -2F);
		Motor.setTextureSize(64, 32);
		Motor.mirror = true;
		setRotation(Motor, 0F, 0F, 0.7853982F);
		side = new ModelRenderer(this, 15, 37);
		side.addBox(-5F, 0F, -3F, 10, 11, 5);
		side.setRotationPoint(0F, 10F, 5F);
		side.setTextureSize(64, 32);
		side.mirror = true;
		setRotation(side, 0F, 0F, 0F);
		base = new ModelRenderer(this, 16, 54);
		base.addBox(-7F, 0F, -8F, 14, 3, 16);
		base.setRotationPoint(0F, 21F, 0F);
		base.setTextureSize(64, 32);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		side2 = new ModelRenderer(this, 0, 37);
		side2.addBox(-3F, 0F, 2F, 6, 10, 1);
		side2.setRotationPoint(0F, 11F, 5F);
		side2.setTextureSize(64, 32);
		side2.mirror = true;
		setRotation(side2, 0F, 0F, 0F);
		side4 = new ModelRenderer(this, 77, 37);
		side4.addBox(-3F, 0F, -3F, 6, 10, 1);
		side4.setRotationPoint(0F, 11F, -5F);
		side4.setTextureSize(64, 32);
		side4.mirror = true;
		setRotation(side4, 0F, 0F, 0F);
	}

	public void render(float f5)
	{
		Side3.render(f5);		
		side.render(f5);
		base.render(f5);
		side2.render(f5);
		side4.render(f5);
	}
	
	public void renderMotor(float f5)
	{
		Motor2.render(f5);
		Motor.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
