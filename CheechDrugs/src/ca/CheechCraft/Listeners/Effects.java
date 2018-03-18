package ca.CheechCraft.Listeners;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Effects implements Listener {

	public HashMap<String, Long> cooldowns = new HashMap<String, Long>();

	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.HIGHEST)
	public void click(PlayerInteractEvent event) {
		Player p = event.getPlayer();

		int amount = p.getItemInHand().getAmount();

		// Check to make sure we are calling upon the smoke ability add feature of bang
		// in future
		if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (event.getPlayer().isSneaking()) {

				// Cooldown int
				int cooldownTime = 10;

				// -----------------------
				// -----------------------
				// -----------------------
				// Check for wheat smoked!
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() == Material.WHEAT) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = ChatColor.WHITE + "You can not smoke anymore for " + ChatColor.GREEN
									+ secondsLeft + ChatColor.WHITE + " seconds. You must wait your turn in rotation!";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						// Play sound
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						// Send player message
						p.sendMessage(ChatColor.GREEN + "You smoked Khalifa Kush");
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of Wheat Smoked
				

				// -----------------------
				// -----------------------
				// -----------------------
				// Check for sugar smoked!
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() == Material.SUGAR) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = ChatColor.WHITE + "You can not smoke anymore for " + ChatColor.GREEN
									+ secondsLeft + ChatColor.WHITE + " seconds. You must wait your turn in rotation!";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						// Play sound
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						// Send player message
						String sugar = ChatColor.BOLD + "White Widow";
						p.sendMessage(ChatColor.WHITE + "You smoked " + sugar);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of sugar Smoked

			}

		} else {

		}
	}

}
