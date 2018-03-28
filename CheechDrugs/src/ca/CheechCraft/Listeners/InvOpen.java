package ca.CheechCraft.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InvOpen implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.HIGHEST)
	public void click(InventoryOpenEvent e) {
        
		Player player = (Player) e.getPlayer();

        for (int x = 0; x < player.getInventory().getSize(); x++) {
        	
        		ItemStack stack;
        	
        		if (player.getInventory().getItem(x) == null)
        			continue;
        		else
        			stack = player.getInventory().getItem(x);
        	
            if (stack.getType() == Material.WHEAT) {
            		ItemMeta itemMeta = stack.getItemMeta();
            		
                String wheat = ChatColor.BOLD + "Khalifa Kush";
                itemMeta.setDisplayName(ChatColor.GREEN + wheat);
                
                stack.setItemMeta(itemMeta);
            }
            
    			if (stack.getType() == Material.CACTUS) {
            		ItemMeta itemMeta = stack.getItemMeta();
            		
            		String cactus = ChatColor.BOLD + "Untrimmed OG Kush";
            		itemMeta.setDisplayName(ChatColor.GREEN + cactus);
            		
            		stack.setItemMeta(itemMeta);
    			}

    			if (stack.getType() == Material.INK_SACK
    				&& stack.getDurability() == 2) {
            		ItemMeta itemMeta = stack.getItemMeta();
            		
    				String cactusgreen = ChatColor.BOLD + "OG Kush";
    				itemMeta.setDisplayName(ChatColor.GREEN + cactusgreen);
    				
    				stack.setItemMeta(itemMeta);

    			}

    			if (stack.getType() == Material.PUMPKIN) {
            		ItemMeta itemMeta = stack.getItemMeta();
            		
    				String pumpkin = ChatColor.BOLD + "Untrimmed White Rhino";
    				itemMeta.setDisplayName(ChatColor.WHITE + pumpkin);
    				
    				stack.setItemMeta(itemMeta);

    			}

    			if (stack.getType() == Material.PUMPKIN_SEEDS) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String pumpkinseeds = ChatColor.BOLD + "White Rhino";
    				itemMeta.setDisplayName(ChatColor.WHITE + pumpkinseeds);
    				
    				stack.setItemMeta(itemMeta);

    			}

    			if (stack.getType().getId() == 372) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String cactus = ChatColor.BOLD + "Purple Kush";
    				itemMeta.setDisplayName(ChatColor.DARK_PURPLE + cactus);
    				
    				stack.setItemMeta(itemMeta);

    			}

    			if (stack.getType() == Material.INK_SACK
    				&& stack.getDurability() == 3) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String cocoa = ChatColor.BOLD + "Chocolate Kush";
    				itemMeta.setDisplayName(ChatColor.GOLD + cocoa);
    				
    				stack.setItemMeta(itemMeta);

    			}
    			if (stack.getType() == Material.SUGAR) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String sugar = ChatColor.BOLD + "White Widow";
    				itemMeta.setDisplayName(ChatColor.WHITE + sugar);
    				
    				stack.setItemMeta(itemMeta);
    			}

    			if (stack.getType() == Material.MELON_SEEDS) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String melonseed = ChatColor.BOLD + "Green Crack";
    				itemMeta.setDisplayName(ChatColor.GREEN + melonseed);
    				
    				stack.setItemMeta(itemMeta);

    			}

    			if (stack.getType() == Material.SUGAR_CANE) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String uww = ChatColor.BOLD + "Untrimmed White Widow";
    				itemMeta.setDisplayName(ChatColor.WHITE + uww);
    				
    				stack.setItemMeta(itemMeta);

    			}

    			if (stack.getType() == Material.PAPER) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String lsd = ChatColor.BOLD + "LSD";
    				itemMeta.setDisplayName(ChatColor.BLUE + lsd);
    				
    				stack.setItemMeta(itemMeta);

    			}

    			if (stack.getType() == Material.BROWN_MUSHROOM) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String bm = ChatColor.BOLD + "Psilocybe Cubensis";
    				itemMeta.setDisplayName(ChatColor.GOLD + bm);
    				
    				stack.setItemMeta(itemMeta);

    			}

    			if (stack.getType() == Material.RED_MUSHROOM) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String bm = ChatColor.BOLD + "Psilocybe Baeocystis";
    				itemMeta.setDisplayName(ChatColor.GOLD + bm);
    				
    				stack.setItemMeta(itemMeta);

    			}
    			if (stack.getType() == Material.COOKIE) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String bm = ChatColor.BOLD + "Chocolate Kush Cookies";
    				itemMeta.setDisplayName(ChatColor.GOLD + bm);
    				
    				stack.setItemMeta(itemMeta);

    			}
    			if (stack.getType() == Material.BREAD) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String bm = ChatColor.BOLD + "OG Kush Edible";
    				itemMeta.setDisplayName(ChatColor.GREEN + bm);
    				
    				stack.setItemMeta(itemMeta);

    			}
    			if (stack.getType() == Material.MELON_BLOCK) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String melonBlock = ChatColor.BOLD + "Untrimmed Green Crack";
    				itemMeta.setDisplayName(ChatColor.GREEN + melonBlock);
    				
    				stack.setItemMeta(itemMeta);

    			}
    			if (stack.getType() == Material.MELON) {
    				ItemMeta itemMeta = stack.getItemMeta();
    				
    				String melonBlock = ChatColor.BOLD + "Processed Green Crack";
    				itemMeta.setDisplayName(ChatColor.GREEN + melonBlock);
    				
    				stack.setItemMeta(itemMeta);

    			}
        }
	}
}
