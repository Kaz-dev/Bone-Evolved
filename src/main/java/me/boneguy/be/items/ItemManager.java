package me.boneguy.be.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack minebone;
    public static ItemStack bigbone;
    public static ItemStack chopbone;
    public static ItemStack digbone;
    public static ItemStack plantbone;
    public static ItemStack utilbone;

    public static void init() {
        createMineBone();
        createBigMineBone();
        createChopBone();
        createDigBone();
        createPlantBone();
        createSwissBone();
    }

    private static void createMineBone() {
        ItemStack item = new ItemStack(Material.GOLDEN_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bone for rocks");
        List<String> lore = new ArrayList<>();
        lore.add("Try hit rock");
        meta.setLore(lore);
        meta.setCustomModelData(1000);
        meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);

        minebone = item;

        // recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("minebone_recipe"), item);
        sr.shape("   ", "B  ", "   ");
        sr.setIngredient('B', Material.BONE);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createBigMineBone() {
        ItemStack item = new ItemStack(Material.GOLDEN_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bone for many rocks");
        List<String> lore = new ArrayList<>();
        lore.add("Try hit more rock");
        meta.setLore(lore);
        meta.setCustomModelData(1001);
        meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);

        bigbone = item;

        // recipe
        FurnaceRecipe smelt = new FurnaceRecipe(NamespacedKey.minecraft("bigbone_recipe"), item, Material.BONE_BLOCK, 0.0f, 10 * 20);
        Bukkit.getServer().addRecipe(smelt);
    }

    private static void createChopBone() {
        ItemStack item = new ItemStack(Material.GOLDEN_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bone for trees");
        List<String> lore = new ArrayList<>();
        lore.add("Try hit tree");
        meta.setLore(lore);
        meta.setCustomModelData(1002);
        meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);

        chopbone = item;

        // recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("chopbone_recipe"), item);
        sr.shape(" B ", "   ", "   ");
        sr.setIngredient('B', Material.BONE);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createDigBone() {
        ItemStack item = new ItemStack(Material.GOLDEN_SHOVEL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bone for ground");
        List<String> lore = new ArrayList<>();
        lore.add("Try hit soft ground");
        meta.setLore(lore);
        meta.setCustomModelData(1003);
        meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        meta.addItemFlags();
        item.setItemMeta(meta);

        digbone = item;

        // recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("digbone_recipe"), item);
        sr.shape("   ", "   ", "B  ");
        sr.setIngredient('B', Material.BONE);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createPlantBone() {
        ItemStack item = new ItemStack(Material.GOLDEN_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bone for plants");
        List<String> lore = new ArrayList<>();
        lore.add("Try hit dirt");
        meta.setLore(lore);
        meta.setCustomModelData(1004);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);

        plantbone = item;

        // recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("plantbone_recipe"), item);
        sr.shape("  B", "   ", "   ");
        sr.setIngredient('B', Material.BONE);
        Bukkit.getServer().addRecipe(sr);
    }

    private static void createSwissBone() {
        ItemStack item = new ItemStack(Material.BONE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bone for ALL");
        List<String> lore = new ArrayList<>();
        lore.add("Try hit E V E R Y T H I N G");
        meta.setLore(lore);
        meta.setCustomModelData(1003);
        meta.addEnchant(Enchantment.DIG_SPEED, 8, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);

        utilbone = item;

        // recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("utilbone_recipe"), item);
        sr.shape("DBD", "BLB", "DBD");
        sr.setIngredient('B', Material.BONE);
        sr.setIngredient('D', Material.DIAMOND);
        sr.setIngredient('L', Material.LEATHER);
        Bukkit.getServer().addRecipe(sr);
    }
}
