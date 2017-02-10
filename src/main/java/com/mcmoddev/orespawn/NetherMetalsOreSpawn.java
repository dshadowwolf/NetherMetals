package com.mcmoddev.orespawn;

import com.google.common.base.Function;

import com.mcmoddev.nethermetals.blocks.ModBlocks;
import mmd.orespawn.api.OreSpawnAPI;
import mmd.orespawn.api.SpawnLogic;
import net.minecraftforge.fml.common.Loader;

public class NetherMetalsOreSpawn implements Function<OreSpawnAPI, SpawnLogic> {

	@Override
	public SpawnLogic apply(OreSpawnAPI api) {

		SpawnLogic logic = api.createSpawnLogic();
		
		//Vanilla
		logic.getDimension(-1)
		.addOre(ModBlocks.coal_ore.getDefaultState(), 8, 8,  12, 0,  96)
		.addOre(ModBlocks.diamond_ore.getDefaultState(), 8, 8,  12, 0,  96)
		.addOre(ModBlocks.emerald_ore.getDefaultState(), 8, 8,  12, 0,  96)
		.addOre(ModBlocks.gold_ore.getDefaultState(), 8, 8,  12, 0,  96)
		.addOre(ModBlocks.iron_ore.getDefaultState(), 8, 8,  12, 0,  96)
		.addOre(ModBlocks.lapis_ore.getDefaultState(), 8, 8,  12, 0,  96)
		.addOre(ModBlocks.redstone_ore.getDefaultState(), 8, 8,  12, 0,  96);

		//Base Metals
		if (Loader.isModLoaded("basemetals")) {
		logic.getDimension(-1)
		.addOre(ModBlocks.antimony_ore .getDefaultState(), 8, 4, 10, 0,  32)
		.addOre(ModBlocks.bismuth_ore.getDefaultState(), 8, 4,  10, 0,  32)
		.addOre(ModBlocks.copper_ore.getDefaultState(), 8, 12,  20, 0,  96)
		.addOre(ModBlocks.lead_ore.getDefaultState(), 8, 12,  20, 0,  96)
		.addOre(ModBlocks.mercury_ore.getDefaultState(), 8, 4,  10, 0,  32)
		.addOre(ModBlocks.nickel_ore.getDefaultState(), 8, 4,  10, 0,  96)
		.addOre(ModBlocks.platinum_ore.getDefaultState(), 8, 4,  10, 0,  32)
		.addOre(ModBlocks.silver_ore.getDefaultState(), 8, 8,  10, 0,  32)
		.addOre(ModBlocks.tin_ore.getDefaultState(), 8, 12,  20, 0,  96)
		.addOre(ModBlocks.zinc_ore.getDefaultState(), 8, 8,  12, 0,  96);
		
		
		//Modern Metals
		if (Loader.isModLoaded("modernmetals")) {
		logic.getDimension(-1)
		.addOre(ModBlocks.aluminum_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.cadmium_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.chromium_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.iridium_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.magnesium_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.manganese_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.osmium_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.plutonium_ore.getDefaultState(), 8, 4,  10, 0,  96)
		.addOre(ModBlocks.rutile_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.tantalum_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.titanium_ore.getDefaultState(), 8, 4,  10, 0,  96)
		.addOre(ModBlocks.tungsten_ore.getDefaultState(), 8, 8,  10, 0,  96)
		.addOre(ModBlocks.uranium_ore.getDefaultState(), 8, 4,  10, 0,  96)
		.addOre(ModBlocks.zirconium_ore.getDefaultState(), 8, 8,  10, 0,  96);
		

	}
		return logic;
		
	
	
	}
		return logic;
}
	
}
