// Date: 11/26/2013 7:03:28 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package dark.core.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSteamGen extends ModelMachine
{
    //fields
    ModelRenderer body;
    ModelRenderer top;
    ModelRenderer bot;
    ModelRenderer tank;
    ModelRenderer tank2;
    ModelRenderer tank3;
    ModelRenderer tank4;
    ModelRenderer tank5;
    ModelRenderer tank6;
    ModelRenderer face;
    ModelRenderer grill;
    ModelRenderer grill2;
    ModelRenderer grill3;
    ModelRenderer grill4;
    ModelRenderer grill5;
    ModelRenderer grill6;
    ModelRenderer grill7;
    ModelRenderer grill8;
    ModelRenderer grill9;
    ModelRenderer grill10;
    ModelRenderer grill11;
    ModelRenderer grill12;
    ModelRenderer grill13;
    ModelRenderer grill14;
    ModelRenderer grill15;
    ModelRenderer grill16;
    ModelRenderer grill17;
    ModelRenderer pipe;
    ModelRenderer pipe2;
    ModelRenderer pipe3;
    ModelRenderer pipe4;
    ModelRenderer gauge;
    ModelRenderer gaugeNeedle;

    public ModelSteamGen()
    {
        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this, 0, 25);
        body.addBox(-7.5F, 0F, -7.5F, 15, 9, 12);
        body.setRotationPoint(0F, 10F, 3F);
        body.setTextureSize(128, 128);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        top = new ModelRenderer(this, 0, 0);
        top.addBox(-8F, 0F, -8F, 16, 2, 15);
        top.setRotationPoint(0F, 8F, 1F);
        top.setTextureSize(128, 128);
        top.mirror = true;
        setRotation(top, 0F, 0F, 0F);
        bot = new ModelRenderer(this, 0, 97);
        bot.addBox(-8F, 0F, -6F, 16, 5, 12);
        bot.setRotationPoint(0F, 19F, 2F);
        bot.setTextureSize(128, 128);
        bot.mirror = true;
        setRotation(bot, 0F, 0F, 0F);
        tank = new ModelRenderer(this, 58, 81);
        tank.addBox(-2F, 1F, -8.5F, 5, 5, 1);
        tank.setRotationPoint(-3F, 11F, 3F);
        tank.setTextureSize(128, 128);
        tank.mirror = true;
        setRotation(tank, 0F, 0F, 0F);
        tank2 = new ModelRenderer(this, 72, 83);
        tank2.addBox(0F, -1F, -8F, 1, 3, 1);
        tank2.setRotationPoint(0F, 14F, 3F);
        tank2.setTextureSize(128, 128);
        tank2.mirror = true;
        setRotation(tank2, 0F, 0F, 0F);
        tank3 = new ModelRenderer(this, 60, 78);
        tank3.addBox(-1F, 1F, -8F, 3, 1, 1);
        tank3.setRotationPoint(-3F, 10F, 3F);
        tank3.setTextureSize(128, 128);
        tank3.mirror = true;
        setRotation(tank3, 0F, 0F, 0F);
        tank4 = new ModelRenderer(this, 60, 88);
        tank4.addBox(-1F, 1F, -8F, 3, 1, 1);
        tank4.setRotationPoint(-3F, 16F, 3F);
        tank4.setTextureSize(128, 128);
        tank4.mirror = true;
        setRotation(tank4, 0F, 0F, 0F);
        tank5 = new ModelRenderer(this, 52, 83);
        tank5.addBox(0F, -1F, -8F, 1, 3, 1);
        tank5.setRotationPoint(-6F, 14F, 3F);
        tank5.setTextureSize(128, 128);
        tank5.mirror = true;
        setRotation(tank5, 0F, 0F, 0F);
        tank6 = new ModelRenderer(this, 37, 81);
        tank6.addBox(-1F, 2F, -8.8F, 3, 3, 1);
        tank6.setRotationPoint(-3F, 11F, 3F);
        tank6.setTextureSize(128, 128);
        tank6.mirror = true;
        setRotation(tank6, 0F, 0F, 0F);
        face = new ModelRenderer(this, 20, 116);
        face.addBox(-8F, 0F, -6F, 16, 6, 2);
        face.setRotationPoint(0F, 18F, 0F);
        face.setTextureSize(128, 128);
        face.mirror = true;
        setRotation(face, 0F, 0F, 0F);
        grill = new ModelRenderer(this, 44, 56);
        grill.addBox(0F, 0F, 0F, 1, 5, 1);
        grill.setRotationPoint(-7.6F, 18.5F, -7F);
        grill.setTextureSize(128, 128);
        grill.mirror = true;
        setRotation(grill, 0F, 0F, 0F);
        grill2 = new ModelRenderer(this, 38, 56);
        grill2.addBox(0F, 0F, 0F, 1, 5, 1);
        grill2.setRotationPoint(6.4F, 18.5F, -7F);
        grill2.setTextureSize(128, 128);
        grill2.mirror = true;
        setRotation(grill2, 0F, 0F, 0F);
        grill3 = new ModelRenderer(this, 0, 49);
        grill3.addBox(0F, 0F, 0F, 13, 1, 1);
        grill3.setRotationPoint(-6.6F, 18.5F, -7F);
        grill3.setTextureSize(128, 128);
        grill3.mirror = true;
        setRotation(grill3, 0F, 0F, 0F);
        grill4 = new ModelRenderer(this, 0, 52);
        grill4.addBox(0F, 0F, 0F, 13, 1, 1);
        grill4.setRotationPoint(-6.6F, 22.5F, -7F);
        grill4.setTextureSize(128, 128);
        grill4.mirror = true;
        setRotation(grill4, 0F, 0F, 0F);
        grill5 = new ModelRenderer(this, 0, 56);
        grill5.addBox(0F, 0F, 0F, 1, 3, 1);
        grill5.setRotationPoint(-6.6F, 19.5F, -6F);
        grill5.setTextureSize(128, 128);
        grill5.mirror = true;
        setRotation(grill5, 0F, 0.7853982F, 0F);
        grill6 = new ModelRenderer(this, 0, 56);
        grill6.addBox(0F, 0F, 0F, 1, 3, 1);
        grill6.setRotationPoint(5F, 19.5F, -6F);
        grill6.setTextureSize(128, 128);
        grill6.mirror = true;
        setRotation(grill6, 0F, 0.7853982F, 0F);
        grill7 = new ModelRenderer(this, 0, 56);
        grill7.addBox(0F, 0F, 0F, 1, 3, 1);
        grill7.setRotationPoint(4F, 19.5F, -6F);
        grill7.setTextureSize(128, 128);
        grill7.mirror = true;
        setRotation(grill7, 0F, 0.7853982F, 0F);
        grill8 = new ModelRenderer(this, 0, 56);
        grill8.addBox(0F, 0F, 0F, 1, 3, 1);
        grill8.setRotationPoint(3F, 19.5F, -6F);
        grill8.setTextureSize(128, 128);
        grill8.mirror = true;
        setRotation(grill8, 0F, 0.7853982F, 0F);
        grill9 = new ModelRenderer(this, 0, 56);
        grill9.addBox(0F, 0F, 0F, 1, 3, 1);
        grill9.setRotationPoint(2F, 19.5F, -6F);
        grill9.setTextureSize(128, 128);
        grill9.mirror = true;
        setRotation(grill9, 0F, 0.7853982F, 0F);
        grill10 = new ModelRenderer(this, 0, 56);
        grill10.addBox(0F, 0F, 0F, 1, 3, 1);
        grill10.setRotationPoint(-5.6F, 19.5F, -6F);
        grill10.setTextureSize(128, 128);
        grill10.mirror = true;
        setRotation(grill10, 0F, 0.7853982F, 0F);
        grill11 = new ModelRenderer(this, 0, 56);
        grill11.addBox(0F, 0F, 0F, 1, 3, 1);
        grill11.setRotationPoint(-4.6F, 19.5F, -6F);
        grill11.setTextureSize(128, 128);
        grill11.mirror = true;
        setRotation(grill11, 0F, 0.7853982F, 0F);
        grill12 = new ModelRenderer(this, 0, 56);
        grill12.addBox(0F, 0F, 0F, 1, 3, 1);
        grill12.setRotationPoint(-3.6F, 19.5F, -6F);
        grill12.setTextureSize(128, 128);
        grill12.mirror = true;
        setRotation(grill12, 0F, 0.7853982F, 0F);
        grill13 = new ModelRenderer(this, 0, 56);
        grill13.addBox(0F, 0F, 0F, 1, 3, 1);
        grill13.setRotationPoint(-2.6F, 19.5F, -6F);
        grill13.setTextureSize(128, 128);
        grill13.mirror = true;
        setRotation(grill13, 0F, 0.7853982F, 0F);
        grill14 = new ModelRenderer(this, 0, 56);
        grill14.addBox(0F, 0F, 0F, 1, 3, 1);
        grill14.setRotationPoint(-1.6F, 19.5F, -6F);
        grill14.setTextureSize(128, 128);
        grill14.mirror = true;
        setRotation(grill14, 0F, 0.7853982F, 0F);
        grill15 = new ModelRenderer(this, 0, 56);
        grill15.addBox(0F, 0F, 0F, 1, 3, 1);
        grill15.setRotationPoint(1F, 19.5F, -6F);
        grill15.setTextureSize(128, 128);
        grill15.mirror = true;
        setRotation(grill15, 0F, 0.7853982F, 0F);
        grill16 = new ModelRenderer(this, 0, 56);
        grill16.addBox(0F, 0F, 0F, 1, 3, 1);
        grill16.setRotationPoint(0F, 19.5F, -6F);
        grill16.setTextureSize(128, 128);
        grill16.mirror = true;
        setRotation(grill16, 0F, 0.7853982F, 0F);
        grill17 = new ModelRenderer(this, 0, 56);
        grill17.addBox(0F, 0F, 0F, 1, 3, 1);
        grill17.setRotationPoint(-0.8F, 19.5F, -6F);
        grill17.setTextureSize(128, 128);
        grill17.mirror = true;
        setRotation(grill17, 0F, 0.7853982F, 0F);
        pipe = new ModelRenderer(this, 0, 76);
        pipe.addBox(0F, -1F, -8.35F, 8, 1, 1);
        pipe.setRotationPoint(0F, 14F, 3F);
        pipe.setTextureSize(128, 128);
        pipe.mirror = true;
        setRotation(pipe, 0F, 0F, 0F);
        pipe2 = new ModelRenderer(this, 0, 81);
        pipe2.addBox(0F, -1F, -8.35F, 1, 1, 8);
        pipe2.setRotationPoint(7F, 14F, 4F);
        pipe2.setTextureSize(128, 128);
        pipe2.mirror = true;
        setRotation(pipe2, 0F, 0F, 0F);
        pipe3 = new ModelRenderer(this, 21, 81);
        pipe3.addBox(0F, -1F, -8.35F, 1, 3, 1);
        pipe3.setRotationPoint(7F, 11F, 11F);
        pipe3.setTextureSize(128, 128);
        pipe3.mirror = true;
        setRotation(pipe3, 0F, 0F, 0F);
        pipe4 = new ModelRenderer(this, 15, 59);
        pipe4.addBox(0F, 0F, 0F, 1, 10, 1);
        pipe4.setRotationPoint(4.4F, 9.5F, -4.8F);
        pipe4.setTextureSize(128, 128);
        pipe4.mirror = true;
        setRotation(pipe4, 0F, 0F, 0F);
        gauge = new ModelRenderer(this, 61, 56);
        gauge.addBox(0F, 0F, 0F, 3, 3, 1);
        gauge.setRotationPoint(1.4F, 14.5F, -5F);
        gauge.setTextureSize(128, 128);
        gauge.mirror = true;
        setRotation(gauge, 0F, 0F, 0F);
        gaugeNeedle = new ModelRenderer(this, 56, 56);
        gaugeNeedle.addBox(0F, -2F, 0F, 1, 3, 0);
        gaugeNeedle.setRotationPoint(2.4F, 16.5F, -5.1F);
        gaugeNeedle.setTextureSize(128, 128);
        gaugeNeedle.mirror = true;
        setRotation(gaugeNeedle, 0F, 0F, 0F);
    }

    @Override
    public void render(float f5)
    {
        body.render(f5);
        top.render(f5);
        bot.render(f5);
        tank.render(f5);
        tank2.render(f5);
        tank3.render(f5);
        tank4.render(f5);
        tank5.render(f5);
        tank6.render(f5);
        face.render(f5);
        grill.render(f5);
        grill2.render(f5);
        grill3.render(f5);
        grill4.render(f5);
        grill5.render(f5);
        grill6.render(f5);
        grill7.render(f5);
        grill8.render(f5);
        grill9.render(f5);
        grill10.render(f5);
        grill11.render(f5);
        grill12.render(f5);
        grill13.render(f5);
        grill14.render(f5);
        grill15.render(f5);
        grill16.render(f5);
        grill17.render(f5);
        pipe.render(f5);
        pipe2.render(f5);
        pipe3.render(f5);
        pipe4.render(f5);
        gauge.render(f5);
        gaugeNeedle.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
