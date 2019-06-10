package net.royalkingdom.util;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class MessagesConfig {

    private File file = new File("plugins//RoyaKingdom//Messages.yml");
    private FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

    public void setMessage(){
        if(cfg.contains("Settings")){
            cfg.set("Settings.Prefix", "RoyalKingdom > ");
        }
        save();
    }

    private void save(){
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
