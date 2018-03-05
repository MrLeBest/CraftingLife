package fr.mrlebest.craftingmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCaisse extends ModelBase
{

    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape21;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape81;
    ModelRenderer Shape9;
  
  public ModelCaisse()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 64, 41);
      Shape1.mirror = true;
      Shape1.addBox(-8F, 0F, -8F, 16, 1, 16);
      Shape1.setRotationPoint(0F, 23F, 0F);
      Shape1.setTextureSize(128, 128);
      setRotation(Shape1, 0F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 70, 108);
      Shape2.mirror = true;
      Shape2.addBox(0F, 0F, 0F, 14, 4, 14);
      Shape2.setRotationPoint(-7F, 19F, -7F);
      Shape2.setTextureSize(128, 128);
      setRotation(Shape2, 0F, 0F, 0F);
      
      Shape3 = new ModelRenderer(this, 90, 78);
      Shape3.mirror = true;
      Shape3.addBox(0F, 0F, 0F, 3, 8, 3);
      Shape3.setRotationPoint(-1F, 16F, -4F);
      Shape3.setTextureSize(128, 128);
      setRotation(Shape3, 0F, 0F, -0.6073746F);
      
      Shape21 = new ModelRenderer(this, 50, 90);
      Shape21.mirror = true;
      Shape21.addBox(0F, 0F, 0F, 10, 1, 10);
      Shape21.setRotationPoint(-4F, 17F, -8F);
      Shape21.setTextureSize(128, 128);
      setRotation(Shape21, 0F, 0F, -0.5934119F);
      
      Shape4 = new ModelRenderer(this, 50, 50);
      Shape4.mirror = true;
      Shape4.addBox(0F, 0F, 0F, 5, 2, 2);
      Shape4.setRotationPoint(-1F, 17F, 3F);
      Shape4.setTextureSize(128, 128);
      setRotation(Shape4, 0F, 0F, 0F);
      
      Shape5 = new ModelRenderer(this, 70, 12);
      Shape5.mirror = true;
      Shape5.addBox(0F, 0F, 0F, 1, 5, 1);
      Shape5.setRotationPoint(2F, 14F, 5F);
      Shape5.setTextureSize(128, 128);
      setRotation(Shape5, 0F, 0F, 0F);
      
      Shape6 = new ModelRenderer(this, 96, 35);
      Shape6.mirror = true;
      Shape6.addBox(0F, 0F, 0F, 0, 1, 1);
      Shape6.setRotationPoint(-1F, 17.53333F, 3.5F);
      Shape6.setTextureSize(128, 128);
      setRotation(Shape6, -0.0371786F, 0F, 0.2777036F);
      
      Shape7 = new ModelRenderer(this, 80, 32);
      Shape7.mirror = true;
      Shape7.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape7.setRotationPoint(3F, 14F, 4.466667F);
      Shape7.setTextureSize(128, 128);
      setRotation(Shape7, 0F, 0F, 0F);
      
      Shape8 = new ModelRenderer(this, 12, 12);
      Shape8.mirror = true;
      Shape8.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape8.setRotationPoint(-7.066667F, 20F, 5F);
      Shape8.setTextureSize(128, 128);
      setRotation(Shape8, 0F, 0F, 0F);
      
      Shape81 = new ModelRenderer(this, 20, 30);
      Shape81.mirror = true;
      Shape81.addBox(0F, 0F, 0F, 1, 3, 10);
      Shape81.setRotationPoint(-7.466667F, 20F, -6.333333F);
      Shape81.setTextureSize(128, 128);
      setRotation(Shape81, 0F, 0F, 0F);
      
      Shape9 = new ModelRenderer(this, 12, 50);
      Shape9.mirror = true;
      Shape9.addBox(0F, 0F, 0F, 0, 1, 1);
      Shape9.setRotationPoint(-7.666667F, 20F, 5.6F);
      Shape9.setTextureSize(128, 128);
      setRotation(Shape9, 0F, 1.607128F, 0F);
  }
  
  public void renderAll()
  {
    Shape1.render(0.0625F);
    Shape2.render(0.0625F);
    Shape3.render(0.0625F);
    Shape21.render(0.0625F);
    Shape4.render(0.0625F);
    Shape5.render(0.0625F);
    Shape6.render(0.0625F);
    Shape7.render(0.0625F);
    Shape8.render(0.0625F);
    Shape81.render(0.0625F);
    Shape9.render(0.0625F);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
}
