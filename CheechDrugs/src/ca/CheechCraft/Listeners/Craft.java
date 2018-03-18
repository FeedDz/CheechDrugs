package ca.CheechCraft.Listeners;

import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Craft implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onCraft(CraftItemEvent event) {
		Player p = (Player) event.getWhoClicked();

		ItemStack item = new ItemStack(Material.AIR);

		// ------------------------------
		// ------------------------------
		// ------------------------------
		// Check if item crafted is bread
		// ------------------------------
		// ------------------------------
		if (event.getRecipe().getResult().getType() == Material.BREAD) {

			// Do Math to get the amount to be added
			int craftedWheat = Arrays.stream(event.getInventory().getContents())
					.filter(stack -> stack.getType() == Material.WHEAT).mapToInt(stack -> stack.getAmount()).sum();
			int craftAmount = 3;
			int give = craftedWheat / craftAmount;

			// Set Meta of item
			item.setType(Material.BREAD);
			ItemMeta im = item.getItemMeta();
			String wheat = ChatColor.GREEN + "" + ChatColor.BOLD + "Khalifa Kush Edibles";
			im.setDisplayName(wheat);
			item.setItemMeta(im);
			item.setAmount(give);

			// Add the item to players inventory manually
			p.getInventory().addItem(item);

			// Cancel all events and clear crafting table fix bug that deletes extra items!
			event.getInventory().clear();
			event.setCancelled(true);

			// Send the player the message
			p.sendMessage("You Crafted " + give + ChatColor.GREEN + " " + wheat);

		}

		// ------------------------------
		// ------------------------------
		// ------------------------------
		// Check if item crafted is pumpkin seeds
		// ------------------------------
		// ------------------------------
		if (event.getRecipe().getResult().getType() == Material.PUMPKIN_SEEDS) {

			// Do Math to get the amount to be added
			int craftedPumpkin = Arrays.stream(event.getInventory().getContents())
					.filter(stack -> stack.getType() == Material.PUMPKIN).mapToInt(stack -> stack.getAmount()).sum();
			int craftAmount = 4;
			int give = (craftAmount * craftedPumpkin);

			// Set Meta of item
			item.setType(Material.PUMPKIN_SEEDS);
			ItemMeta im = item.getItemMeta();
			String pumpkinseeds = (ChatColor.WHITE + "" + ChatColor.BOLD + "White Rhino");
			im.setDisplayName(pumpkinseeds);
			item.setItemMeta(im);
			item.setAmount(give);

			// Add the item to players inventory manually
			p.getInventory().addItem(item);

			// Cancel all events and clear crafting table fix bug that deletes extra items!
			event.getInventory().clear();
			event.setCancelled(true);

			// Send the player the message
			p.sendMessage("You Crafted " + give + ChatColor.WHITE + ChatColor.BOLD + " " + pumpkinseeds);

		}

		// ------------------------------
		// ------------------------------
		// ------------------------------
		// Check if item crafted is Sugar
		// ------------------------------
		// ------------------------------
		if (event.getRecipe().getResult().getType() == Material.SUGAR) {

			// Do Math to get the amount to be added
			int craftedSugar = Arrays.stream(event.getInventory().getContents())
					.filter(stack -> stack.getType() == Material.SUGAR_CANE).mapToInt(stack -> stack.getAmount()).sum();

			// Set Meta of item
			item.setType(Material.SUGAR);
			ItemMeta im = item.getItemMeta();
			String sugar = ChatColor.WHITE + "" + ChatColor.BOLD + "White Widow";
			im.setDisplayName(sugar);
			item.setItemMeta(im);
			item.setAmount(craftedSugar);

			// Add the item to players inventory manually
			p.getInventory().addItem(item);

			// Cancel all events and clear crafting table fix bug that deletes extra items!
			event.getInventory().clear();
			event.setCancelled(true);

			// Send the player the message
			p.sendMessage("You Crafted " + craftedSugar + ChatColor.WHITE + ChatColor.BOLD + " " + sugar);

		}
		// ------------------------------
		// ------------------------------
		// ------------------------------
		// Check if item crafted is SugarCane
		// ------------------------------
		// ------------------------------
		if (event.getRecipe().getResult().getType() == Material.PAPER) {

			// Do Math to get the amount to be added
			int craftedPaper = Arrays.stream(event.getInventory().getContents())
					.filter(stack -> stack.getType() == Material.SUGAR_CANE).mapToInt(stack -> stack.getAmount()).sum();

			// Set Meta of item
			item.setType(Material.PAPER);
			ItemMeta im = item.getItemMeta();
			String paper = ChatColor.BLUE + "" + ChatColor.BOLD + "LSD";
			im.setDisplayName(paper);
			item.setItemMeta(im);
			item.setAmount(craftedPaper);

			// Add the item to players inventory manually
			p.getInventory().addItem(item);

			// Cancel all events and clear crafting table fix bug that deletes extra items!
			event.getInventory().clear();
			event.setCancelled(true);

			// Send the player the message
			p.sendMessage("You Crafted " + craftedPaper + ChatColor.WHITE + ChatColor.BOLD + " " + paper);
		}
		// ------------------------------
		// ------------------------------
		// ------------------------------
		// Check if item crafted is melon seeds
		// ------------------------------
		// ------------------------------
		if (event.getRecipe().getResult().getType() == Material.MELON_SEEDS) {

			// Do Math to get the amount to be added
			int craftedMelon = Arrays.stream(event.getInventory().getContents())
					.filter(stack -> stack.getType() == Material.MELON).mapToInt(stack -> stack.getAmount()).sum();

			// Set Meta of item
			item.setType(Material.MELON_SEEDS);
			ItemMeta im = item.getItemMeta();
			String melonseeds = (ChatColor.GREEN + "" + ChatColor.BOLD + "Green Crack");
			im.setDisplayName(melonseeds);
			item.setItemMeta(im);
			item.setAmount(craftedMelon);

			// Add the item to players inventory manually
			p.getInventory().addItem(item);

			// Cancel all events and clear crafting table fix bug that deletes extra items!
			event.getInventory().clear();
			event.setCancelled(true);

			// Send the player the message
			p.sendMessage("You Crafted " + craftedMelon + ChatColor.WHITE + ChatColor.BOLD + " " + melonseeds);

		}

	}

}
