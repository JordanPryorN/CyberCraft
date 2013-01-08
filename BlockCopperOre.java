package JordanP.MinecraftRevamped.common;

//Imports
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.Material;
package JordanP.MinecraftRevamped.common;

public class BlockCopperOre extends Block
{
        public BlockCopperOre(int blockID)
    {
                super(blockID, Material.rock);
                blockIndexInTexture = 0;
        }
            public int idDropped(int i, Random random, int j)
            {
            return MCR.ingotCopper.shiftedIndex;
            }
            public int quantityDropped(Random random)
            {
            return 1;
            }
        @Override
        public String getTextureFile()
        {
                return "/JordanP/MCR/Terrain/terrain.png";
        }
}
