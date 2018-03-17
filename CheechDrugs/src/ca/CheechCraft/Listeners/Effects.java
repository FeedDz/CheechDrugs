package ca.CheechCraft.Listeners;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.Material;
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

		// Check to make sure we are calling upon the smoke ability add feature of bang
		// in future
		if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (event.getPlayer().isSneaking()) {

				// Cooldown int
				int cooldownTime = 20;

				// -----------------------
				// -----------------------
				// -----------------------
				// Check for wheat smoked!
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() == Material.WHEAT) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {
						
						
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								           - (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							String message = ChatColor.WHITE + "You can not smoke anymore for " + ChatColor.GREEN
									         + secondsLeft + ChatColor.WHITE + " seconds. You must wait your turn in rotation!";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown
						
						
						
					} else {
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						p.sendMessage(ChatColor.GREEN + "You smoked Khalifa Kush");
						int amount = p.getItemInHand().getAmount();
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of Wheat Smoked

			}

		} else {

		}
	}

}
