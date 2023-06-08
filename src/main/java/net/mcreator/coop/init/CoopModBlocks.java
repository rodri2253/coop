
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.coop.block.PruebaBlock;
import net.mcreator.coop.CoopMod;

public class CoopModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CoopMod.MODID);
	public static final RegistryObject<Block> PRUEBA = REGISTRY.register("prueba", () -> new PruebaBlock());
}
