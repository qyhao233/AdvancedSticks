package xxrexraptorxx.advancedsticks.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import xxrexraptorxx.advancedsticks.main.AdvancedSticks;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemDiamondStickIronSword extends ItemSword {

	public ItemDiamondStickIronSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(AdvancedSticks.mainTab);
		
	}

	
	@Override
	public void addInformation(ItemStack stack, World playerIn, List<String> addList, ITooltipFlag advanced) {
    
		addList.add(ChatFormatting.BLUE + "> Diamond Stick");
	}
	

	
	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) {
	 return stack.getItem() == Items.IRON_INGOT;
	} 
}
