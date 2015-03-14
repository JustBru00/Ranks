package me.justbru00.epic.ranks.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Listeners implements Listener{
	
	GUIs guis = new GUIs();
	
	@EventHandler
	public void InventoryClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();

		if (e.getInventory().getTitle().contains(guis.getGUIName())) {
			e.setCancelled(true);

			if (e.getCurrentItem() == null) {
				return;
			}
			if (e.getSlot() == 0) {
				p.chat("/warp a");
			}
			if (e.getSlot() == 1) {
				p.chat("/warp b");
			}
			if (e.getSlot() == 2) {
				p.chat("/warp c");
			}
			if (e.getSlot() == 3) {
				p.chat("/warp d");
			}
			if (e.getSlot() == 4) {
				p.chat("/warp e");
			}
			if (e.getSlot() == 5) {
				p.chat("/warp f");
			}
			if (e.getSlot() == 6) {
				p.chat("/warp g");
			}
			if (e.getSlot() == 7) {
				p.chat("/warp h");
			}
			if (e.getSlot() == 8) {
				p.chat("/warp i");
			}
			if (e.getSlot() == 9) {
				p.chat("/warp j");
			}
			else if (e.getCurrentItem().getType() == Material.BARRIER) {
				p.sendMessage(ChatColor.RED + "Closed GUI.");
				p.closeInventory();
			}
			
		}

	}
	

}
