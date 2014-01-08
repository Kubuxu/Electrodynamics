// Date: 9/13/2013 10:47:00 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package resonantinduction.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelCrusher extends ModelBase
{
	// fields
	ModelRenderer base;
	ModelRenderer front;
	ModelRenderer back;
	ModelRenderer leftSide;
	ModelRenderer leftSide2;
	ModelRenderer rightSide;
	ModelRenderer rightSide2;
	ModelRenderer leftCrusher;
	ModelRenderer rightCrusher;
	ModelRenderer leftPiston;
	ModelRenderer rightPiston;
	ModelRenderer buttonA;
	ModelRenderer buttonB;
	ModelRenderer top;

	public ModelCrusher()
	{
		textureWidth = 128;
		textureHeight = 128;

		base = new ModelRenderer(this, 0, 110);
		base.addBox(-8F, 0F, -8F, 16, 2, 16);
		base.setRotationPoint(0F, 22F, 0F);
		base.setTextureSize(128, 128);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		front = new ModelRenderer(this, 0, 30);
		front.addBox(0F, 0F, 0F, 14, 5, 2);
		front.setRotationPoint(-7F, 17F, -7F);
		front.setTextureSize(128, 128);
		front.mirror = true;
		setRotation(front, 0F, 0F, 0F);
		back = new ModelRenderer(this, 0, 50);
		back.addBox(0F, 0F, 0F, 14, 5, 2);
		back.setRotationPoint(-7F, 17F, 5F);
		back.setTextureSize(128, 128);
		back.mirror = true;
		setRotation(back, 0F, 0F, 0F);
		leftSide = new ModelRenderer(this, 104, 0);
		leftSide.addBox(0F, 0F, 0F, 2, 12, 8);
		leftSide.setRotationPoint(-7F, 10F, -4F);
		leftSide.setTextureSize(128, 128);
		leftSide.mirror = true;
		setRotation(leftSide, 0F, 0F, 0F);
		leftSide2 = new ModelRenderer(this, 104, 23);
		leftSide2.addBox(0F, 0F, 0F, 1, 11, 7);
		leftSide2.setRotationPoint(-8F, 11.33333F, -3.5F);
		leftSide2.setTextureSize(128, 128);
		leftSide2.mirror = true;
		setRotation(leftSide2, 0F, 0F, 0F);
		rightSide = new ModelRenderer(this, 80, 0);
		rightSide.addBox(0F, 0F, 0F, 2, 12, 8);
		rightSide.setRotationPoint(5F, 10F, -4F);
		rightSide.setTextureSize(128, 128);
		rightSide.mirror = true;
		setRotation(rightSide, 0F, 0F, 0F);
		rightSide2 = new ModelRenderer(this, 80, 23);
		rightSide2.addBox(0F, 0F, 0F, 1, 11, 7);
		rightSide2.setRotationPoint(7F, 11.33333F, -3.5F);
		rightSide2.setTextureSize(128, 128);
		rightSide2.mirror = true;
		setRotation(rightSide2, 0F, 0F, 0F);
		leftCrusher = new ModelRenderer(this, 104, 45);
		leftCrusher.addBox(-1F, 0F, 0F, 2, 10, 10);
		leftCrusher.setRotationPoint(-3F, 11F, -5F);
		leftCrusher.setTextureSize(128, 128);
		leftCrusher.mirror = true;
		setRotation(leftCrusher, 0F, 0F, 0F);
		rightCrusher = new ModelRenderer(this, 77, 45);
		rightCrusher.addBox(1F, 0F, 0F, 2, 10, 10);
		rightCrusher.setRotationPoint(1F, 11F, -5F);
		rightCrusher.setTextureSize(128, 128);
		rightCrusher.mirror = true;
		setRotation(rightCrusher, 0F, 0F, 0F);
		leftPiston = new ModelRenderer(this, 104, 68);
		leftPiston.addBox(0F, 0F, 0F, 4, 4, 4);
		leftPiston.setRotationPoint(-6F, 14F, -2F);
		leftPiston.setTextureSize(128, 128);
		leftPiston.mirror = true;
		setRotation(leftPiston, 0F, 0F, 0F);
		rightPiston = new ModelRenderer(this, 80, 68);
		rightPiston.addBox(-2F, 0F, 0F, 4, 4, 4);
		rightPiston.setRotationPoint(4F, 14F, -2F);
		rightPiston.setTextureSize(128, 128);
		rightPiston.mirror = true;
		setRotation(rightPiston, 0F, 0F, 0F);
		buttonA = new ModelRenderer(this, 0, 20);
		buttonA.addBox(0F, 0F, 0F, 3, 2, 1);
		buttonA.setRotationPoint(5F, 14F, 4F);
		buttonA.setTextureSize(128, 128);
		buttonA.mirror = true;
		setRotation(buttonA, 0F, 0F, 0F);
		buttonB = new ModelRenderer(this, 0, 25);
		buttonB.addBox(0F, 0F, 0F, 3, 2, 1);
		buttonB.setRotationPoint(-8F, 14F, -5F);
		buttonB.setTextureSize(128, 128);
		buttonB.mirror = true;
		setRotation(buttonB, 0F, 0F, 0F);
		top = new ModelRenderer(this, 0, 68);
		top.addBox(0F, 0F, 0F, 12, 2, 6);
		top.setRotationPoint(-6F, 9F, -3F);
		top.setTextureSize(128, 128);
		top.mirror = true;
		setRotation(top, 0F, 0F, 0F);
	}

	public void renderBody(float f5)
	{
		base.render(f5);
		front.render(f5);
		back.render(f5);
		leftSide.render(f5);
		leftSide2.render(f5);
		rightSide.render(f5);
		rightSide2.render(f5);
		buttonA.render(f5);
		buttonB.render(f5);
		top.render(f5);
		leftPiston.render(f5);
		rightPiston.render(f5);
	}

	public void renderPiston(float f5, int pos)
	{
		leftCrusher.setRotationPoint(-3F, 11F, -5F);
		rightCrusher.setRotationPoint(1F, 11F, -5F);

		if (pos > 8)
		{
			pos = 8;
		}
		if (pos < 0)
		{
			pos = 0;
		}
		float delta = pos / 4;

		if (delta < 0)
		{
			delta = 0;
		}
		if (delta > 2)
		{
			delta = 2;
		}
		leftCrusher.setRotationPoint(-3F + delta, 11F, -5F);
		rightCrusher.setRotationPoint(1F - delta, 11F, -5F);
		leftCrusher.render(f5);
		rightCrusher.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
