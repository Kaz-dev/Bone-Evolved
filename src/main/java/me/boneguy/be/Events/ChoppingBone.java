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

import java.util.ArrayList;
import java.util.List;

public class ChoppingBone implements Listener {

    List<Block> blocks = new ArrayList<>();
    BlockFace blockface =  null;

    @EventHandler
    public void onClick(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
            blockface = event.getBlockFace();
        }
    }

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        Block block = event.getBlock();

        // Whole tree chopdown
        if(event.getPlayer().getInventory().getItemInMainHand().hasItemMeta() != false && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore() != false) {
            if(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains("Try hit tree")) {
                if (blockface.equals(BlockFace.NORTH) || blockface.equals(BlockFace.SOUTH) || blockface.equals(BlockFace.EAST) || blockface.equals(BlockFace.WEST)) {
                    Block block1 = block.getRelative(BlockFace.UP);
                    while (!block1.getType().name().contains("LEAVES")) {
                        Block next = block1.getRelative(BlockFace.UP);
                        if (next.getType().name().contains("LEAVES")) {
                            break;
                        } else {
                            blocks.add(next);
                        }
                    }
                    blocks.add(block1);

                    // Material drops
                    for (Block b : blocks) {
                        if (b.getType().name().contains("LOG") || b.getType().name().contains("STRIPPED")) {
                            b.setType(Material.AIR);
                            block.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(b.getType()));
                        } else if (b.getType().equals(Material.DARK_OAK_LOG)) {
                            b.setType(Material.AIR);
                            block.getWorld().dropItemNaturally(b.getLocation(), new ItemStack(Material.DARK_OAK_LOG));
                        }
                    }
                    blocks.clear();
                }
            }
        }
    }
}
