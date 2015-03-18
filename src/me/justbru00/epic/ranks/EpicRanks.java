package me.justbru00.epic.ranks;

import java.util.logging.Logger;

import me.justbru00.epic.ranks.utils.GUIs;
import me.justbru00.epic.ranks.utils.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class EpicRanks extends JavaPlugin {
	Logger logger = Logger.getLogger("Minecraft");
	ConsoleCommandSender clogger = this.getServer().getConsoleSender();
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String commandLabel, String[] args) {
		

		if (commandLabel.equalsIgnoreCase("ranks")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (args.length > 0) {
					player.sendMessage(ChatColor.GREEN + "Opening ranks GUI.");
                   
                   GUIs.showRanks(player);
				}
			} else {
				clogger.sendMessage(ChatColor.DARK_RED + "That command can't be used in CONSOLE.");
			}
		}

		return false;
	}

	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		clogger.sendMessage(ChatColor.RED + pdfFile.getName() + " Has Been Disabled.");
	}

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		clogger.sendMessage(ChatColor.AQUA + "======================================");
		clogger.sendMessage(ChatColor.GREEN + pdfFile.getName() + " Version: " + pdfFile.getVersion() + " Has Been Enabled.");
		clogger.sendMessage(ChatColor.AQUA + "======================================");
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}

}
