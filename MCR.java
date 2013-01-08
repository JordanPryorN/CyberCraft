pacage JordanP.MinecraftRevamped.com;

//imports
import net.minecraft.block.Block;

//Mod info
@Mod(modid = "JordanP_MCR", name = "Minecraft Revamped", version = "In-Dev 0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MCR
{

@Instance("JordanP_MCR", "Minecraft Revamped")
public static MCR instance;

//Block Static(S)
public static Block oreCopper;

@PreInit
public void load(FMLPreInitializationEvent e)
{

//block inputs
oreCopper = new BlockCopperOre(230).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("oreCopper").setCreativeTab(CreativeTabs.tabBlock);

//game registers (blocks only)
GameRegistry.registerBlock(oreCopper);

//language registry (blocks and items)
LanguageRegistry.addName(oreCopper, "Copper Ore");

 }
 @cpw.mods.fml.common.Mod.PreInit
 public void PreInit(FMLPreInitializationEvent event){
 System.out.println("Minecraft Revamped Loaded Successfully!");
  }
}
