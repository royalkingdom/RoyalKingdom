package net.royalkingdom.main;

import net.royalkingdom.commands.OpCMD;
import net.royalkingdom.util.MessagesConfig;
import org.bukkit.plugin.java.JavaPlugin;

public class RoyalKingdom extends JavaPlugin {

    private MessagesConfig mc;

    @Override
    public void onEnable() {
        registerConfig();
        registerCommands();
        registerEvents();
    }


    private void registerConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
        registerCommands();
        mc = new MessagesConfig();
        mc.setMessage();
    }

    private void registerCommands(){
        getCommand("op").setExecutor(new OpCMD());
    }

    private void registerEvents(){

    }
}
