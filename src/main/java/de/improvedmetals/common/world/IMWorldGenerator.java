package de.improvedmetals.common.world;

import java.util.Random;

import de.improvedmetals.IMBlocks;
import de.improvedmetals.common.config.ConfigValues;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class IMWorldGenerator implements IWorldGenerator{

	public IMWorldGenerator() {}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		switch (world.provider.getDimension()) {
		case 0:
			if(ConfigValues.oreGenCopper){
				addOreSpawn(IMBlocks.COPPER_ORE.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16 , chunkZ * 16, ConfigValues.oreGenCopperMinVeinSize, ConfigValues.oreGenCopperMaxVeinSize, 20, ConfigValues.oreGenCopperMinY, ConfigValues.oreGenCopperMaxY);
			}	
			if(ConfigValues.oreGenTin){
				addOreSpawn(IMBlocks.TIN_ORE.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16 , chunkZ * 16, ConfigValues.oreGenTinMinVeinSize, ConfigValues.oreGenTinMaxVeinSize, 20, ConfigValues.oreGenTinMinY, ConfigValues.oreGenTinMaxY);
			}	
			if(ConfigValues.oreGenSilver){
				addOreSpawn(IMBlocks.SILVER_ORE.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16 , chunkZ * 16, ConfigValues.oreGenSilverMinVeinSize, ConfigValues.oreGenSilverMaxVeinSize, 20, ConfigValues.oreGenSilverMinY, ConfigValues.oreGenSilverMaxY);
			}	
			if(ConfigValues.oreGenLead){
				addOreSpawn(IMBlocks.LEAD_ORE.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16 , chunkZ * 16, ConfigValues.oreGenLeadMinVeinSize, ConfigValues.oreGenLeadMaxVeinSize, 20, ConfigValues.oreGenLeadMinY, ConfigValues.oreGenLeadMaxY);
			}
			if(ConfigValues.oreGenPrismarine){
				addOreSpawn(IMBlocks.PRISMARINE_ORE.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16 , chunkZ * 16, ConfigValues.oreGenPrismarineMinVeinSize, ConfigValues.oreGenPrismarineMaxVeinSize, 20, ConfigValues.oreGenPrismarineMinY, ConfigValues.oreGenPrismarineMaxY);
			}	
			if(ConfigValues.oreGenExperience){
				addOreSpawn(IMBlocks.EXPERIENCE_ORE.getDefaultState(), Blocks.STONE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, ConfigValues.oreGenExperienceMinVeinSize, ConfigValues.oreGenExperienceMaxVeinSize, 20, ConfigValues.oreGenExperienceMinY, ConfigValues.oreGenExperienceMaxY);
			}
		break;
		
		case 1:
			//
		break;
		
		case -1:
			//
		break;
		}		
	}

	public void addOreSpawn(IBlockState block, IBlockState baseBlock, World world, Random random, int chunkXPos, int chunkZPos, int minVainSize, int maxVainSize, int chancesToSpawn, int minY, int maxY) {
		for (int i = 0; i < chancesToSpawn; i++) {
			int posX = chunkXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = chunkZPos + random.nextInt(16);

			new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)), BlockMatcher.forBlock(baseBlock.getBlock())).generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
	
	
}