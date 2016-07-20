package irynwoed.hermeticraft.world;

import irynwoed.hermeticraft.blocks.HermeticraftBlocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class HermeticraftWorldGen implements IWorldGenerator{
	public static HermeticraftWorldGen instance = new HermeticraftWorldGen();

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateWorld(random, chunkX, chunkZ, world, true);
		
	}
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, boolean bool){
		 addOreSpawn(HermeticraftBlocks.oreVimAero, (byte) 0, Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
	                GenConfig.minVeinSize, GenConfig.maxVeinSize, GenConfig.chancesToSpawn, GenConfig.minY, GenConfig.maxY);

		 addOreSpawn(HermeticraftBlocks.oreVimAquam, (byte) 0, Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
	                GenConfig.minVeinSize, GenConfig.maxVeinSize, GenConfig.chancesToSpawn, GenConfig.minY, GenConfig.maxY);

		 addOreSpawn(HermeticraftBlocks.oreVimIgnem, (byte) 0, Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
	                GenConfig.minVeinSize, GenConfig.maxVeinSize, GenConfig.chancesToSpawn, GenConfig.minY, GenConfig.maxY);

		 addOreSpawn(HermeticraftBlocks.oreVimTerram, (byte) 0, Blocks.STONE, world, random, chunkX * 16, chunkZ * 16,
	                GenConfig.minVeinSize, GenConfig.maxVeinSize, GenConfig.chancesToSpawn, GenConfig.minY, GenConfig.maxY);

	}
	@SuppressWarnings("deprecation")
	public void addOreSpawn(Block block, byte blockMeta, Block targetBlock, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        WorldGenMinable minable = new WorldGenMinable(block.getStateFromMeta(blockMeta), (minVeinSize - random.nextInt(maxVeinSize - minVeinSize)), BlockMatcher.forBlock(targetBlock));
        for (int i = 0 ; i < chancesToSpawn ; i++) {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            minable.generate(world, random, new BlockPos(posX, posY, posZ));
        }
        public static void init() {
           HermeticraftWorldGen generator = HermeticraftWorldGen.instance;
           GameRegistry.registerWorldGenerator(generator, 1);
           MinecraftForge.EVENT_BUS.register(generator);
    }
}

}
