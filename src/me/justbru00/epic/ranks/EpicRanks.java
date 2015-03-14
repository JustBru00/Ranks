package me.justbru00.epic.ranks;

import java.util.logging.Logger;

import me.justbru00.epic.ranks.utils.GUIs;
import me.justbru00.epic.ranks.utils.Listeners;
import net.minecraft.server.v1_8_R2.GuiStatsComponent;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class EpicRanks extends JavaPlugin {
	Logger logger = Logger.getLogger("Minecraft");
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String commandLabel, String[] args) {
		

		if (commandLabel.equalsIgnoreCase("ranks")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				if (args.length > 0) {
					player.sendMessage(ChatColor.GREEN + "Opening ranks GUI.");
                   GUIs guis = new GUIs();
                   guis.showRanks(player);
				}
			} else {
				logger.warning("That command can't be used in CONSOLE.");
			}
		}

		return false;
	}

	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled.");
	}

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version: "
				+ pdfFile.getVersion() + " Has Been Enabled.");
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}

}
