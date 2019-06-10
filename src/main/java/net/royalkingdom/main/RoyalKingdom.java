package net.royalkingdom.main;

import org.bukkit.plugin.java.JavaPlugin;

public class RoyalKingdom extends JavaPlugin {

    @Override
    public void onEnable() {
        registerConfig();
        registerCommands();
        registerEvents();
    }


    private void registerConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();


    }

    private void registerCommands(){

    }

    private void registerEvents(){

    }
}
