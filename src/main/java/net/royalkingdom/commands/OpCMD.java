package net.royalkingdom.commands;

import net.royalkingdom.util.ConfigWerte;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OpCMD implements CommandExecutor {

    private ConfigWerte cw;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        cw = new ConfigWerte();
        CommandSender c = (CommandSender) sender;
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("op")) {
                ConfigWerte.playerMessage(player, cw.Prefix + cw.OpMessage);
            }
        }else
            ConfigWerte.consoleMessage(cw.Prefix + cw.OpMessage);
        return false;
    }
}
