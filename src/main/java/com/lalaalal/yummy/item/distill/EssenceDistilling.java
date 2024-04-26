package com.lalaalal.yummy.item.distill;

import com.lalaalal.yummy.item.YummyItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.HashMap;
import java.util.Map;

public class EssenceDistilling {
    private static final Map<Item, DistillingEntry> DISTILLING_MAP = new HashMap<>();

    public static void init() {
        addDistillRecipe(Items.GOLD_INGOT, 1, YummyItems.SOUL_INFUSED_GOLD.get());
        addDistillRecipe(Items.REDSTONE, 1, YummyItems.SOUL_INFUSED_REDSTONE.get());
        addDistillRecipe(Items.COPPER_INGOT, 1, YummyItems.SOUL_INFUSED_COPPER.get());
        addDistillRecipe(Items.DIAMOND, 1, YummyItems.SOUL_INFUSED_DIAMOND.get());
        addDistillRecipe(Items.EMERALD, 1, YummyItems.SOUL_INFUSED_EMERALD.get());
        addDistillRecipe(Items.AMETHYST_SHARD, 1, YummyItems.SOUL_INFUSED_AMETHYST.get());
        addDistillRecipe(Items.LAPIS_LAZULI, 1, YummyItems.SOUL_INFUSED_LAPIS.get());
        addDistillRecipe(YummyItems.NECTARIUM.get(), 1, YummyItems.SOUL_INFUSED_NECTARIUM.get());
    }

    public static void addDistillRecipe(Item ingredient, int requiredCount, Item result) {
        DISTILLING_MAP.put(ingredient, new DistillingEntry(result, requiredCount));
    }

    public static boolean isIngredient(Item item) {
        return DISTILLING_MAP.containsKey(item);
    }

    public static int getRequiredCount(Item ingredient) {
        return DISTILLING_MAP.getOrDefault(ingredient, DistillingEntry.EMPTY).requiredCount;
    }

    public static Item getResult(Item ingredient) {
        return DISTILLING_MAP.getOrDefault(ingredient, DistillingEntry.EMPTY).result;
    }

    private record DistillingEntry(Item result, int requiredCount) {
        public static final DistillingEntry EMPTY = new DistillingEntry(Items.AIR, 0);
    }
}
