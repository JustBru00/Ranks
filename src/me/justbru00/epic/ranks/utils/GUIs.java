package me.justbru00.epic.ranks.utils;



import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIs {
	
	public String color(String uncolored) {		
		String colored = ChatColor.translateAlternateColorCodes('&', uncolored);
		return colored;
	}
	
	private ItemStack createItem(String displayName, Material m, String lore) {
		ItemStack is = new ItemStack(m);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(color(displayName));
		ArrayList<String> reallore = new ArrayList<String>();
		reallore.add(color(lore));
		im.setLore(reallore);
		is.setItemMeta(im);
		return is;
	}
    private String ranksname = ChatColor.AQUA + "Ranks";
	
	public void showRanks(Player player) {
		Inventory inv = Bukkit.createInventory(null, 54, ranksname);
		inv.setItem(0, createItem("&6Rank &aA", Material.GRASS, "&6Cost: &b$10,000"));
		inv.setItem(1, createItem("&6Rank &aB", Material.RED_SANDSTONE, "&6Cost: &b$20,000"));
		inv.setItem(2, createItem("&6Rank &aC", Material.SNOW_BLOCK, "&6Cost: &b$30,000"));
		inv.setItem(3, createItem("&6Rank &aD", Material.GRASS, "&6Cost: &b$40,000"));
		inv.setItem(4, createItem("&6Rank &aE", Material.GRASS, "&6Cost: &b$50,000"));
		inv.setItem(5, createItem("&6Rank &aF", Material.GRASS, "&6Cost: &b$60,000"));
		inv.setItem(6, createItem("&6Rank &aG", Material.GRASS, "&6Cost: &b$70,000"));
		inv.setItem(7, createItem("&6Rank &aH", Material.GRASS, "&6Cost: &b$80,000"));
		inv.setItem(8, createItem("&6Rank &aI", Material.GRASS, "&6Cost: &b$90,000"));
		inv.setItem(9, createItem("&6Rank &aJ", Material.GRASS, "&6Cost: &b$100,000"));
		
		
		player.openInventory(inv);
	}
	
	public String getGUIName() {
		return ranksname;
	}
}
