package net.royalkingdom.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class ConfigWerte {

    private File file = new File("plugins//RoyaKingdom//Messages.yml");
    private FileConfiguration Mcfg = YamlConfiguration.loadConfiguration(file);

    //Settings
    public final String Prefix = Mcfg.getString("Settings.Prefix");
    //Op
    public final String OpMessage = Mcfg.getString("Op.Message");


    public static void playerMessage(Player player, String message){
        player.sendMessage(ChatColor.translateAlternateColorCodes('&',message));
    }

    public static void consoleMessage(String message){
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',message));
    }

    public static void broadcastMessage(String message){
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&',message));
    }
}
