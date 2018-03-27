package ca.CheechCraft;

import org.bukkit.plugin.java.JavaPlugin;

import ca.CheechCraft.Listeners.Craft;
import ca.CheechCraft.Listeners.Effects;
import ca.CheechCraft.Listeners.Pickup;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	public static String prefix = (ChatColor.GREEN + "" +  ChatColor.BOLD + "[CheechSmoke]");

	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Pickup(), this);
		getServer().getPluginManager().registerEvents(new Craft(), this);
		getServer().getPluginManager().registerEvents(new Effects(), this);

		getLogger().info("------------------------");
		getLogger().info("------------------------");
		getLogger().info("------------------------");
		getLogger().info("CheechDrugs has loaded!");
		getLogger().info("------Version 1.0-------");
		getLogger().info("------------------------");
		getLogger().info("------------------------");

	}

	public void onDisable() {
		getLogger().info("--------------------------");
		getLogger().info("--------------------------");
		getLogger().info("--------------------------");
		getLogger().info("CheechDrugs has Disabled!");
		getLogger().info("-------Version 1.0--------");
		getLogger().info("--------------------------");
		getLogger().info("--------------------------");

	}
	
	
	
	
	

}
