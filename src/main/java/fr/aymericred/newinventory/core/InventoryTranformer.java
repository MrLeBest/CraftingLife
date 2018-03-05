package fr.aymericred.newinventory.core;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

import net.minecraft.launchwrapper.IClassTransformer;

public class InventoryTranformer implements IClassTransformer
{
	public static boolean runtimeDeobfuscationEnabled;
	@Override
	public byte[] transform(String name, String transformedName, byte[] basicClass) 
	{
		if(transformedName.equals("net.minecraft.inventory.Container")) //TODO OBFUCASTED NAME
		{
			InventoryCorePlugin.LOG.info("Patching " + name + " ! (V.1.0)");
			
			ClassNode classNode = new ClassNode();
			ClassReader classReader = new ClassReader(basicClass);
			classReader.accept(classNode, ClassReader.EXPAND_FRAMES);
			
			MethodNode mnode = null; //Find the method
			for(MethodNode node : classNode.methods)
			{
				if(node.name.equals("addCraftingToCrafters") || (node.name.equals("a") && node.desc.equals("(Laac;)V")))
				{
					mnode = node;
					break;
				}
			}
			if(mnode == null)
			{
				InventoryCorePlugin.LOG.warn("The function 'addCraftingToCrafters' wasn't found, aborting !");
				return basicClass;
			}
			InsnList instr = mnode.instructions;
		    
			//instr.insert(new InsnNode(Opcodes.ARETURN)); //Insert a return to block vanilla code
			instr.insert(new MethodInsnNode(Opcodes.INVOKESTATIC, "fr/aymericred/newinventory/core/ContainerChestAdv", "onAddCraftingToCrafters", "(Lnet/minecraft/inventory/Container;)V", false)); //Call the custom method
			instr.insert(new VarInsnNode(Opcodes.ALOAD, 0));
			
			mnode = null; //Find the method
			for(MethodNode node : classNode.methods)
			{
				if(node.name.equals("putStacksInSlots") || (node.name.equals("a") && node.desc.equals("([Ladd;)V")))
				{
					mnode = node;
					break;
				}
			}
			if(mnode == null)
			{
				InventoryCorePlugin.LOG.warn("The function 'putStacksInSlots' wasn't found, aborting !");
				return basicClass;
			}
			instr = mnode.instructions;
		    
			//instr.insert(new InsnNode(Opcodes.ARETURN)); //Insert a return to block vanilla code
			instr.insert(new MethodInsnNode(Opcodes.INVOKESTATIC, "fr/aymericred/newinventory/core/ContainerChestAdv", "onAddCraftingToCrafters", "(Lnet/minecraft/inventory/Container;)V", false)); //Call the custom method
			instr.insert(new VarInsnNode(Opcodes.ALOAD, 0));
			
			ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
			classNode.accept(cw); //Patch
			InventoryCorePlugin.LOG.info("Container patched");
			return cw.toByteArray();
		}
		else if(transformedName.equals("net.minecraft.inventory.ContainerChest")) //TODO OBFUCASTED NAME
		{
			InventoryCorePlugin.LOG.info("Patching " + name + " ! (V.1.0)");
			
			ClassNode classNode = new ClassNode();
			ClassReader classReader = new ClassReader(basicClass);
			classReader.accept(classNode, ClassReader.EXPAND_FRAMES);

			MethodNode mnode = null; //Find the method
			for(MethodNode node : classNode.methods)
			{
				if(node.name.equals("<init>"))
				{
					mnode = node;
					break;
				}
			}
			if(mnode == null)
			{
				InventoryCorePlugin.LOG.warn("The constructor wasn't found, aborting !");
				return basicClass;
			}
			InsnList instr = mnode.instructions;
			instr.insert(new InsnNode(Opcodes.RETURN)); //Insert a return to block vanilla code
			instr.insert(new MethodInsnNode(Opcodes.INVOKESTATIC, "fr/aymericred/newinventory/core/ContainerChestAdv", "constructor", "(Lnet/minecraft/inventory/IInventory;Lnet/minecraft/inventory/IInventory;)V", false)); //Call the custom method
			instr.insert(new VarInsnNode(Opcodes.ALOAD, 2));
			instr.insert(new VarInsnNode(Opcodes.ALOAD, 1));
			instr.insert(new MethodInsnNode(Opcodes.INVOKESPECIAL, "net/minecraft/inventory/Container", "<init>", "()V", false)); //Call the super()
			instr.insert(new VarInsnNode(Opcodes.ALOAD, 0));

			
			mnode = null; //Find the method
			for(MethodNode node : classNode.methods)
			{
				if(node.name.equals("transferStackInSlot") || (node.name.equals("b") && node.desc.equals("(Lyz;I)Ladd;")))
				{
					mnode = node;
					break;
				}
			}
			if(mnode == null)
			{
				InventoryCorePlugin.LOG.warn("The function 'transferStackInSlot' wasn't found, aborting !");
				return basicClass;
			}
			instr = mnode.instructions;
		    
			instr.insert(new InsnNode(Opcodes.ARETURN)); //Insert a return to block vanilla code
			instr.insert(new MethodInsnNode(Opcodes.INVOKESTATIC, "fr/aymericred/newinventory/core/ContainerChestAdv", "transferStackInSlot", "(Lnet/minecraft/inventory/ContainerChest;Lnet/minecraft/entity/player/EntityPlayer;I)Lnet/minecraft/item/ItemStack;", false)); //Call the custom method
			instr.insert(new VarInsnNode(Opcodes.ILOAD, 2));
			instr.insert(new VarInsnNode(Opcodes.ALOAD, 1));
			instr.insert(new VarInsnNode(Opcodes.ALOAD, 0));
			
			ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
			classNode.accept(cw); //Patch
			InventoryCorePlugin.LOG.info("ContainerChest patched");
			return cw.toByteArray();
		}
		/**else if(runtimeDeobfuscationEnabled ? name.equals("bjb") : name.equals("net.minecraft.client.network.NetHandlerPlayClient"))
		{
			ClientCorePlugin.LOG.info("Patching " + name + " ! (V.1.1)");
			
			ClassNode classNode = new ClassNode();
			ClassReader classReader = new ClassReader(basicClass);
			classReader.accept(classNode, ClassReader.EXPAND_FRAMES);

			MethodNode mnode = null; //Find the method
			for(MethodNode node : classNode.methods)
			{
				if(node.name.equals("handlePlayerPosLook"))
				{
					mnode = node;
					break;
				}
			}
			if(mnode == null)
			{
				ClientCorePlugin.LOG.warn("The function 'handlePlayerPosLook' wasn't found, aborting !");
				return basicClass;
			}
			InsnList instr = mnode.instructions;
			instr.insert(new InsnNode(Opcodes.RETURN)); //Insert a return to block vanilla code
			instr.insert(new MethodInsnNode(Opcodes.INVOKESTATIC, "fr/aymericred/loadingscreen/client/PlayerPosHandler", "handlePlayerPosLook",
					"(Lnet/minecraft/network/NetworkManager;Lnet/minecraft/network/play/server/S08PacketPlayerPosLook;)V", false)); //Call the custom method
			instr.insert(new VarInsnNode(Opcodes.ALOAD, 1));
			instr.insert(new FieldInsnNode(Opcodes.GETFIELD, "net/minecraft/client/network/NetHandlerPlayClient", "netManager", "Lnet/minecraft/network/NetworkManager;"));
			instr.insert(new VarInsnNode(Opcodes.ALOAD, 0));
			
			ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
			classNode.accept(cw); //Patch
			ClientCorePlugin.LOG.info("NetHandlerPlayClient patched");
			ClientEventHandler.transToRemove = this;//To make this deactivated, bypassing any ConcurrentModification of the transformers lists
			return cw.toByteArray();
		}*/
		return basicClass;
	}
}
