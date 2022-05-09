package me.boneguy.be.commands;

import me.boneguy.be.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("giveminebone")) {
            player.getInventory().addItem(ItemManager.minebone);
        }
        if (cmd.getName().equalsIgnoreCase("givebigbone")) {
            player.getInventory().addItem(ItemManager.bigbone);
        }
        if (cmd.getName().equalsIgnoreCase("givechopbone")) {
            player.getInventory().addItem(ItemManager.chopbone);
        }
        if (cmd.getName().equalsIgnoreCase("givedigbone")) {
            player.getInventory().addItem(ItemManager.digbone);
        }
        if (cmd.getName().equalsIgnoreCase("giveplantbone")) {
            player.getInventory().addItem(ItemManager.plantbone);
        }
        if (cmd.getName().equalsIgnoreCase("givethrowtbone")) {
            player.getInventory().addItem(ItemManager.throwbone);
        }
        if (cmd.getName().equalsIgnoreCase("giveswissbone")) {
            player.getInventory().addItem(ItemManager.utilbone);
        }

        return true;
    }
}
