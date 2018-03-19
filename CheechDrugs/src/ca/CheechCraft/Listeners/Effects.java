package ca.CheechCraft.Listeners;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
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

import ca.CheechCraft.Main;

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
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {

						//
						// PlayParticle effect
						//
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);

						// Play sound
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						// Send player message
						String wheat = ChatColor.BOLD + "Khalifa Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.GREEN + wheat);
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
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {

						//
						// PlayParticle effect
						//
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						// Play sound
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						// Send player message
						String sugar = ChatColor.BOLD + "White Widow";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.WHITE + sugar);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of sugar Smoked

				// -----------------------
				// -----------------------
				// -----------------------
				// Check for cactusgreen smoked!
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() == Material.INK_SACK && p.getItemInHand().getDurability() == 2) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						//
						// PlayParticle effect
						//
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						// Play sound
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						// Send player message
						String cactusgreen = ChatColor.BOLD + "OG Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.GREEN + cactusgreen);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of cactusgreen Smoked
				
				// -----------------------
				// -----------------------
				// -----------------------
				// Check for pumpkinseeds smoked!
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() ==  Material.PUMPKIN_SEEDS) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						//
						// PlayParticle effect
						//
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						// Play sound
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						// Send player message
						String whiterhino = ChatColor.BOLD + "White Rhino";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.WHITE + whiterhino);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of pumpkinseeds Smoked
				
				// -----------------------
				// -----------------------
				// -----------------------
				// Check for melon seed smoked!
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() ==  Material.INK_SACK
						&& event.getItem().getDurability() == 3) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						//
						// PlayParticle effect
						//
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						// Play sound
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						// Send player message
						String chocolatekush = ChatColor.BOLD + "Cocolate Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.GREEN + chocolatekush);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of melon seeds Smoked
				
				
				// -----------------------
				// -----------------------
				// -----------------------
				// Check for netherwarts smoked!
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getTypeId() ==  372) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						//
						// PlayParticle effect
						//
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						// Play sound
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						// Send player message
						String purplekush = ChatColor.BOLD + "Purple Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.DARK_PURPLE + purplekush);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of netherwarts Smoked
				
				// -----------------------
				// -----------------------
				// -----------------------
				// Check for melonseeds smoked!
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() ==  Material.MELON_SEEDS) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						//
						// PlayParticle effect
						//
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						// Play sound
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						// Send player message
						String chocolatekush = ChatColor.BOLD + "Chocolate Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.GOLD + chocolatekush);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of melonseeds Smoked
				
				// -----------------------
				// -----------------------
				// -----------------------
				// Check for lsd taken
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() ==  Material.PAPER) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not take anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						// Play sound
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
						// Send player message
						String lsd = ChatColor.BOLD + "LSD";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have taken " + ChatColor.DARK_BLUE + lsd);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of lsd taken
				
				// -----------------------
				// -----------------------
				// -----------------------
				// Check for bshrooms taken
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() ==  Material.BROWN_MUSHROOM) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not take anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						// Play sound
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
						// Send player message
						String bshrooms = ChatColor.BOLD + "Psilocybe Cubensis";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have eaten " + ChatColor.GOLD + bshrooms);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of bshrooms taken
				
				// -----------------------
				// -----------------------
				// -----------------------
				// Check for rshrooms taken
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() ==  Material.RED_MUSHROOM) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not eat anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						// Play sound
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
						// Send player message
						String rshrooms = ChatColor.BOLD + "Psilocybe Baeocystis";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have eaten " + ChatColor.GOLD + rshrooms);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of rshrooms taken
				
				// -----------------------
				// -----------------------
				// -----------------------
				// Check for bread taken
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() ==  Material.BREAD) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not eat anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						// Play sound
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1));
						// Send player message
						String bread = ChatColor.BOLD + "OG Kush Edibles";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have taken " + ChatColor.GREEN + bread);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of bread taken
				
				// -----------------------
				// -----------------------
				// -----------------------
				// Check for cookie taken
				// -----------------------
				// -----------------------
				if (p.getItemInHand().getType() ==  Material.COCOA) {

					// Check if player is in cooldown HashMap
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						// Get the time the player has remaining on the cooldown
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						// If player is still in on cooldown
						if (secondsLeft > 0) {
							// Create message
							String message = Main.prefix + ChatColor.WHITE + " You can not eat anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							// send message
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
						// If player is not on cooldown

					} else {
						// Play sound
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						// Place player in cooldown map
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						// add effects
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1));
						// Send player message
						String cookie = ChatColor.BOLD + "Chocolate Kush Cookie";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have taken " + ChatColor.GOLD + cookie);
						// Set the int amount -1 and set the amount in hand
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				} // End of rshrooms taken

			}

		} else {

		}
	}

}
