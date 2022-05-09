package me.boneguy.be.Events;

import me.boneguy.be.Main;
import me.boneguy.be.items.ItemManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

public class ThrowingBone implements Listener {

    Main plugin;

    public ThrowingBone(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            Player plyr = event.getPlayer();
            if (plyr.getInventory().getItemInMainHand().getItemMeta() != null && plyr.getInventory().getItemInMainHand().getItemMeta().getLore() != null
            && plyr.getInventory().getItemInMainHand().getItemMeta().getLore().contains("Try throw bone")) {

                ArmorStand as = (ArmorStand) plyr.getWorld().spawnEntity(plyr.getLocation().add(0,0.5,0), EntityType.ARMOR_STAND);

                as.setArms(true);
                as.setGravity(false);
                as.setVisible(false);
                as.setSmall(true);
                as.setMarker(true);
                as.setItemInHand(new ItemStack(Material.BONE));
                as.setRightArmPose(new EulerAngle(Math.toRadians(90), Math.toRadians(0), Math.toRadians(0)));

                plyr.getInventory().getItemInMainHand().setAmount(plyr.getInventory().getItemInMainHand().getAmount() - 1);

                Location dest = plyr.getLocation().add(plyr.getLocation().getDirection().multiply(10));
                Vector vec = dest.subtract(plyr.getLocation()).toVector();

                new BukkitRunnable() {
                    int distance = 30;
                    int i = 0;

                    public void run() {

                        EulerAngle rot = as.getRightArmPose();
                        EulerAngle rotnew = rot.add(20, 0 ,0);
                        as.setRightArmPose(rotnew);

                        as.teleport(as.getLocation().add(vec.normalize()));

                        if (as.getTargetBlockExact(1) != null && !as.getTargetBlockExact(1).isPassable()) {
                            if (!as.isDead()) {
                                as.remove();
                                if (plyr.getInventory().firstEmpty() != -1) {
                                    plyr.getInventory().addItem(ItemManager.throwbone);
                                } else {
                                    plyr.getWorld().dropItemNaturally(plyr.getLocation(), ItemManager.throwbone);
                                }
                                cancel();
                            }
                        }

                        for (Entity entity : as.getLocation().getChunk().getEntities()) {
                            if (!as.isDead()) {
                                if (as.getLocation().distanceSquared(entity.getLocation()) <= 1) {
                                    if (entity != plyr && entity != as) {
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity livingentity = (LivingEntity) entity;
                                            livingentity.damage(Integer.parseInt("5"), plyr);
                                            as.remove();
                                            if (plyr.getInventory().firstEmpty() != -1) {
                                                plyr.getInventory().addItem(ItemManager.throwbone);
                                            } else {
                                                plyr.getWorld().dropItemNaturally(plyr.getLocation(), ItemManager.throwbone);
                                            }
                                            cancel();
                                        }
                                    }
                                }
                            }
                        }

                        if (i > distance) {
                            if (!as.isDead()) {
                                as.remove();
                                if (plyr.getInventory().firstEmpty() != -1) {
                                    plyr.getInventory().addItem(ItemManager.throwbone);
                                } else {
                                    plyr.getWorld().dropItemNaturally(plyr.getLocation(), ItemManager.throwbone);
                                }
                                cancel();
                            }
                        }

                        i++;
                    }
                }.runTaskTimer(plugin, 0L, 1L);

                event.setCancelled(true);
            }
        }
    }
}
