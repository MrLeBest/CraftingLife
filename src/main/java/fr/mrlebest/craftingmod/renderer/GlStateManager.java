package fr.mrlebest.craftingmod.renderer;

import java.nio.FloatBuffer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.OpenGlHelper;

@SideOnly(Side.CLIENT)
public class GlStateManager
{
    private static GlStateManager.BooleanState lightingState = new GlStateManager.BooleanState(2896);
    private static GlStateManager.BooleanState blendState = new GlStateManager.BooleanState(3042);
    private static GlStateManager.BooleanState depthState = new GlStateManager.BooleanState(2929);
    private static GlStateManager.BooleanState colorLogicState = new GlStateManager.BooleanState(3058);
    private static GlStateManager.BooleanState rescaleNormalState = new GlStateManager.BooleanState(32826);

    public static void enableLighting()
    {
        lightingState.setEnabled();
    }

    public static void disableLighting()
    {
        lightingState.setDisabled();
    }

    public static void disableBlend()
    {
        blendState.setDisabled();
    }

    public static void enableBlend()
    {
        blendState.setEnabled();
    }

    public static void disableDepth()
    {
        depthState.setDisabled();
    }

    public static void enableDepth()
    {
        depthState.setEnabled();
    }
    
    public static void enableColorLogic()
    {
        colorLogicState.setEnabled();
    }

    public static void disableColorLogic()
    {
        colorLogicState.setDisabled();
    }

    public static void colorLogicOp(int opcode)
    {
        GL11.glLogicOp(opcode);
    }
    
    public static void enableTexture2D()
    {
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }

    public static void disableTexture2D()
    {
    	GL11.glDisable(GL11.GL_TEXTURE_2D);
    }
    
    public static void pushAttrib()
    {
        GL11.glPushAttrib(8256);
    }

    public static void popAttrib()
    {
        GL11.glPopAttrib();
    }

    public static void blendFunc(int srcFactor, int dstFactor)
    {
        GL11.glBlendFunc(srcFactor, dstFactor);
    }

    public static void tryBlendFuncSeparate(int srcFactor, int dstFactor, int srcFactorAlpha, int dstFactorAlpha)
    {
        OpenGlHelper.glBlendFunc(srcFactor, dstFactor, srcFactorAlpha, dstFactorAlpha);
    }

    public static void enableRescaleNormal()
    {
        rescaleNormalState.setEnabled();
    }

    public static void disableRescaleNormal()
    {
        rescaleNormalState.setDisabled();
    }

    public static void viewport(int x, int y, int width, int height)
    {
        GL11.glViewport(x, y, width, height);
    }

    public static void clear(int mask)
    {
        GL11.glClear(mask);
    }

    public static void matrixMode(int mode)
    {
        GL11.glMatrixMode(mode);
    }

    public static void loadIdentity()
    {
        GL11.glLoadIdentity();
    }

    public static void pushMatrix()
    {
        GL11.glPushMatrix();
    }

    public static void popMatrix()
    {
        GL11.glPopMatrix();
    }

    public static void getFloat(int pname, FloatBuffer params)
    {
        GL11.glGetFloat(pname, params);
    }

    public static void ortho(double left, double right, double bottom, double top, double zNear, double zFar)
    {
        GL11.glOrtho(left, right, bottom, top, zNear, zFar);
    }

    public static void rotate(float angle, float x, float y, float z)
    {
        GL11.glRotatef(angle, x, y, z);
    }

    public static void scale(float x, float y, float z)
    {
        GL11.glScalef(x, y, z);
    }

    public static void scale(double x, double y, double z)
    {
        GL11.glScaled(x, y, z);
    }

    public static void translate(float x, float y, float z)
    {
        GL11.glTranslatef(x, y, z);
    }

    public static void translate(double x, double y, double z)
    {
        GL11.glTranslated(x, y, z);
    }

    public static void color(float colorRed, float colorGreen, float colorBlue, float colorAlpha)
    {
        GL11.glColor4f(colorRed, colorGreen, colorBlue, colorAlpha);
    }

    public static void color(float colorRed, float colorGreen, float colorBlue)
    {
        color(colorRed, colorGreen, colorBlue, 1.0F);
    }
    
    @SideOnly(Side.CLIENT)
    static class BooleanState
        {
            private final int capability;
            private boolean currentState = false;

            public BooleanState(int capabilityIn)
            {
                this.capability = capabilityIn;
            }

            public void setDisabled()
            {
                this.setState(false);
            }

            public void setEnabled()
            {
                this.setState(true);
            }

            public void setState(boolean state)
            {
                if (state != this.currentState)
                {
                    this.currentState = state;

                    if (state)
                    {
                        GL11.glEnable(this.capability);
                    }
                    else
                    {
                        GL11.glDisable(this.capability);
                    }
                }
            }
        }


}