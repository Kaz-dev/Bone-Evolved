package me.boneguy.be.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().setResourcePack(
                "https://drive.google.com/uc?export=download&id=1U3WW47M8WzfSPc66iRY_WemAUzv8cmGX");
    }

}
