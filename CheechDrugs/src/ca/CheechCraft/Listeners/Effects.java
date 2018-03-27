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
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import ca.CheechCraft.Main;

public class Effects implements Listener {

	public HashMap<String, Long> cooldowns = new HashMap<String, Long>();

	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.HIGHEST)
	public void click(PlayerInteractEvent event) {
		Player p = event.getPlayer();
		
		ItemStack itemHand = p.getInventory().getItemInHand();

		int amount = p.getItemInHand().getAmount();
		if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
			if (event.getPlayer().isSneaking()) {

				int cooldownTime = 10;
				if (itemHand.getType() == Material.WHEAT) {

					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);

						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						String wheat = ChatColor.BOLD + "Khalifa Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.GREEN + wheat);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				if (itemHand.getType() == Material.SUGAR) {

					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);
						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						String sugar = ChatColor.BOLD + "White Widow";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.WHITE + sugar);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				if (itemHand.getType() ==  Material.INK_SACK
						&& itemHand.getDurability() == 2) {
					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						String cactusgreen = ChatColor.BOLD + "OG Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.GREEN + cactusgreen);
						amount--;
						p.getItemInHand().setAmount(amount);
						return;
					}

				}
				if (itemHand.getType() ==  Material.PUMPKIN_SEEDS) {
					if (cooldowns.containsKey(event.getPlayer().getName())) {
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);
						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						String whiterhino = ChatColor.BOLD + "White Rhino";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.WHITE + whiterhino);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				if (itemHand.getType() ==  Material.INK_SACK
						&& itemHand.getDurability() == 3) {

					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						String chocolatekush = ChatColor.BOLD + "Cocolate Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.GREEN + chocolatekush);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				if (p.getItemInHand().getTypeId() ==  372) {

					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						String purplekush = ChatColor.BOLD + "Purple Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.DARK_PURPLE + purplekush);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				
				if (p.getItemInHand().getType() ==  Material.MELON_SEEDS) {

					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not smoke anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.getLocation().getWorld().playEffect(p.getLocation(), Effect.STEP_SOUND, Material.SNOW_BLOCK);
						p.playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 10, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 3));
						String chocolatekush = ChatColor.BOLD + "Chocolate Kush";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You smoked " + ChatColor.GOLD + chocolatekush);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				if (p.getItemInHand().getType() ==  Material.PAPER) {
					if (cooldowns.containsKey(event.getPlayer().getName())) {
						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);
						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not take anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
						String lsd = ChatColor.BOLD + "LSD";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have taken " + ChatColor.DARK_BLUE + lsd);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				if (p.getItemInHand().getType() ==  Material.BROWN_MUSHROOM) {

					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not take anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
						String bshrooms = ChatColor.BOLD + "Psilocybe Cubensis";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have eaten " + ChatColor.GOLD + bshrooms);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				if (p.getItemInHand().getType() ==  Material.RED_MUSHROOM) {

					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not eat anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 3));
						String rshrooms = ChatColor.BOLD + "Psilocybe Baeocystis";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have eaten " + ChatColor.GOLD + rshrooms);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				if (p.getItemInHand().getType() ==  Material.BREAD) {

					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not eat anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}

					} else {
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1));
						String bread = ChatColor.BOLD + "OG Kush Edibles";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have taken " + ChatColor.GREEN + bread);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}
				if (p.getItemInHand().getType() ==  Material.COOKIE) {

					if (cooldowns.containsKey(event.getPlayer().getName())) {

						long secondsLeft = ((cooldowns.get(event.getPlayer().getName()) / 1000) + cooldownTime)
								- (System.currentTimeMillis() / 1000);

						if (secondsLeft > 0) {
							String message = Main.prefix + ChatColor.WHITE + " You can not eat anymore for "
									+ secondsLeft + ChatColor.WHITE + " seconds";
							event.getPlayer().sendMessage(message);
						} else {
							cooldowns.remove(event.getPlayer().getName());
						}
					} else {
						p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 10, 1);
						cooldowns.put(event.getPlayer().getName(), System.currentTimeMillis());
						p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 400, 1));
						p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1));
						String cookie = ChatColor.BOLD + "Chocolate Kush Cookie";
						p.sendMessage(Main.prefix + ChatColor.WHITE + " You have taken " + ChatColor.GOLD + cookie);
						amount--;
						p.getItemInHand().setAmount(amount);
					}

				}

			}
			else {
				return;

		} 
		}
	}

}
