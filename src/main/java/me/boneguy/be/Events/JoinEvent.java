package me.boneguy.be.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().setResourcePack(
                "https://drive.google.com/uc?export=download&id=1ZcR4oT2qO5lBlBzq1u74OpS5eaoUkRJ7");
    }

}
