package me.boneguy.be.Events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ChoppingBone implements Listener {

    public void onPlayerBreakBlock(BlockBreakEvent event) {
        Block blockBroken = event.getBlock();

        if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains("Try hit trees")) {
            if (blockBroken.getType() == Material.ACACIA_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.ACACIA_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.STRIPPED_ACACIA_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.STRIPPED_ACACIA_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }
            
            if (blockBroken.getType() == Material.BIRCH_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.BIRCH_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.STRIPPED_BIRCH_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.STRIPPED_BIRCH_LOG, 4);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.OAK_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.OAK_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.STRIPPED_OAK_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.STRIPPED_OAK_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.DARK_OAK_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.DARK_OAK_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }
            
            if (blockBroken.getType() == Material.STRIPPED_DARK_OAK_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.STRIPPED_DARK_OAK_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.JUNGLE_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.JUNGLE_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.STRIPPED_JUNGLE_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.STRIPPED_JUNGLE_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.SPRUCE_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.SPRUCE_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.STRIPPED_SPRUCE_LOG) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.STRIPPED_SPRUCE_LOG, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.CRIMSON_STEM) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.CRIMSON_STEM, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.STRIPPED_CRIMSON_STEM) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.STRIPPED_CRIMSON_STEM, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.WARPED_STEM) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.WARPED_STEM, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }

            if (blockBroken.getType() == Material.STRIPPED_WARPED_STEM) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack drop = new ItemStack(Material.STRIPPED_WARPED_STEM, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), drop);
            }
        }
    }
}
