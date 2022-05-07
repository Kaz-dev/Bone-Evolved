package me.boneguy.be;

import me.boneguy.be.Events.ChoppingBone;
import me.boneguy.be.Events.JoinEvent;
import me.boneguy.be.Events.MiningBone;
import  me.boneguy.be.commands.Commands;
import me.boneguy.be.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemManager.init();
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getServer().getPluginManager().registerEvents(new MiningBone(), this);
        getServer().getPluginManager().registerEvents(new ChoppingBone(), this);
        getCommand("giveminebone").setExecutor(new Commands());
        getCommand("givebigbone").setExecutor(new Commands());
        getCommand("givechopbone").setExecutor(new Commands());
        getCommand("givedigbone").setExecutor(new Commands());
        getCommand("giveplantbone").setExecutor(new Commands());
        getCommand("giveswissbone").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
