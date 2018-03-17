package ca.CheechCraft.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

@SuppressWarnings("deprecation")
public class Pickup implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	public void pickup(PlayerPickupItemEvent e) {

		ItemStack i = e.getItem().getItemStack();
		ItemMeta itemMeta = i.getItemMeta();

		if (e.getItem().getItemStack().getType() == Material.WHEAT) {
			String wheat = ChatColor.BOLD + "Khalifa Kush";
			itemMeta.setDisplayName(ChatColor.GREEN + wheat);
			i.setItemMeta(itemMeta);
		}

		if (e.getItem().getItemStack().getType() == Material.CACTUS) {
			String cactus = ChatColor.BOLD + "Untrimmed OG Kush";
			itemMeta.setDisplayName(ChatColor.GREEN + cactus);
			i.setItemMeta(itemMeta);
		}

		if (e.getItem().getItemStack().getType() == Material.INK_SACK
				&& e.getItem().getItemStack().getDurability() == 2) {
			itemMeta.setDisplayName(ChatColor.DARK_GREEN + "OG Kush");
			i.setItemMeta(itemMeta);
			String cactusgreen = ChatColor.BOLD + "OG Kush";
			itemMeta.setDisplayName(ChatColor.GREEN + cactusgreen);
			i.setItemMeta(itemMeta);

		}

		if (e.getItem().getItemStack().getType() == Material.PUMPKIN) {
			String pumpkin = ChatColor.BOLD + "Untrimmed White Rhino";
			itemMeta.setDisplayName(ChatColor.WHITE + pumpkin);
			i.setItemMeta(itemMeta);

		}

		if (e.getItem().getItemStack().getType() == Material.PUMPKIN_SEEDS) {
			String pumpkinseeds = ChatColor.BOLD + "White Rhino";
			itemMeta.setDisplayName(ChatColor.WHITE + pumpkinseeds);
			i.setItemMeta(itemMeta);

		}

		if (e.getItem().getItemStack().getTypeId() == 372) {
			String cactus = ChatColor.BOLD + "Purple Kush";
			itemMeta.setDisplayName(ChatColor.DARK_PURPLE + cactus);
			i.setItemMeta(itemMeta);

		}

		if (e.getItem().getItemStack().getType() == Material.INK_SACK
				&& e.getItem().getItemStack().getDurability() == 3) {
			String cocoa = ChatColor.BOLD + "Chocolate Kush";
			itemMeta.setDisplayName(ChatColor.GOLD + cocoa);
			i.setItemMeta(itemMeta);

		}
		if (e.getItem().getItemStack().getType() == Material.SUGAR) {
			String sugar = ChatColor.BOLD + "White Widow";
			itemMeta.setDisplayName(ChatColor.WHITE + sugar);
			i.setItemMeta(itemMeta);

		}

		if (e.getItem().getItemStack().getType() == Material.MELON_SEEDS) {
			String melonseed = ChatColor.BOLD + "Green Crack";
			itemMeta.setDisplayName(ChatColor.GREEN + melonseed);
			i.setItemMeta(itemMeta);

		}

		if (e.getItem().getItemStack().getType() == Material.SUGAR_CANE) {
			String uww = ChatColor.BOLD + "Untrimmed White Widow";
			itemMeta.setDisplayName(ChatColor.WHITE + uww);
			i.setItemMeta(itemMeta);

		}

		if (e.getItem().getItemStack().getType() == Material.PAPER) {
			String lsd = ChatColor.BOLD + "LSD";
			itemMeta.setDisplayName(ChatColor.BLUE + lsd);
			i.setItemMeta(itemMeta);

		}

		if (e.getItem().getItemStack().getType() == Material.BROWN_MUSHROOM) {
			String bm = ChatColor.BOLD + "Psilocybe Cubensis";
			itemMeta.setDisplayName(ChatColor.GOLD + bm);
			i.setItemMeta(itemMeta);

		}

		if (e.getItem().getItemStack().getType() == Material.RED_MUSHROOM) {
			String bm = ChatColor.BOLD + "Psilocybe Baeocystis";
			itemMeta.setDisplayName(ChatColor.GOLD + bm);
			i.setItemMeta(itemMeta);

		}
		if (e.getItem().getItemStack().getType() == Material.COOKIE) {
			String bm = ChatColor.BOLD + "Chocolate Kush Cookies";
			itemMeta.setDisplayName(ChatColor.GOLD + bm);
			i.setItemMeta(itemMeta);

		}
		if (e.getItem().getItemStack().getType() == Material.BREAD) {
			String bm = ChatColor.BOLD + "OG Kush Edible";
			itemMeta.setDisplayName(ChatColor.GREEN + bm);
			i.setItemMeta(itemMeta);

		}
		if (e.getItem().getItemStack().getType() == Material.MELON_BLOCK) {
			String melonBlock = ChatColor.BOLD + "Untrimmed Green Crack";
			itemMeta.setDisplayName(ChatColor.GREEN + melonBlock);
			i.setItemMeta(itemMeta);

		}
		if (e.getItem().getItemStack().getType() == Material.MELON) {
			String melonBlock = ChatColor.BOLD + "Processed Green Crack";
			itemMeta.setDisplayName(ChatColor.GREEN + melonBlock);
			i.setItemMeta(itemMeta);

		}

	}

}
