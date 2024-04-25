package com.lalaalal.yummy;

import com.lalaalal.yummy.block.YummyBlocks;
import com.lalaalal.yummy.item.YummyItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
@Mod.EventBusSubscriber(modid = YummyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class YummyTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YummyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> YUMMY_TAB = CREATIVE_MODE_TABS.register("yummy", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + YummyMod.MOD_ID))
            .icon(() -> new ItemStack(YummyItems.BUNNY_CHEST_ITEM.get()))
            .displayItems((features, entries) -> {
                entries.accept(YummyBlocks.EBONY_LOG.get());
                entries.accept(YummyBlocks.EBONY_WOOD.get());
                entries.accept(YummyBlocks.STRIPPED_EBONY_LOG.get());
                entries.accept(YummyBlocks.STRIPPED_EBONY_WOOD.get());
                entries.accept(YummyBlocks.EBONY_PLANKS.get());
                entries.accept(YummyBlocks.EBONY_STAIRS.get());
                entries.accept(YummyBlocks.EBONY_SLAB.get());
                entries.accept(YummyBlocks.EBONY_FENCE.get());
                entries.accept(YummyBlocks.EBONY_FENCE_GATE.get());
                entries.accept(YummyBlocks.EBONY_DOOR.get());
                entries.accept(YummyBlocks.EBONY_TRAPDOOR.get());
                entries.accept(YummyBlocks.EBONY_PRESSURE_PLATE.get());
                entries.accept(YummyBlocks.EBONY_BUTTON.get());
                entries.accept(YummyItems.EBONY_BOAT_ITEM.get());
                entries.accept(YummyItems.EBONY_CHEST_BOAT_ITEM.get());
                entries.accept(YummyItems.EBONY_SIGN.get());
                entries.accept(YummyItems.EBONY_HANGING_SIGN.get());
                entries.accept(YummyBlocks.HARD_EBONY_PLANKS.get());
                entries.accept(YummyBlocks.EBONY_LEAVES.get());
                entries.accept(YummyBlocks.EBONY_SAPLING.get());
                entries.accept(YummyItems.SPEAR_OF_LONGINUS.get());
                entries.accept(YummyBlocks.SOUL_CRAFTER.get());
                entries.accept(YummyItems.BUNNY_CHEST_ITEM.get());
                entries.accept(YummyItems.SPEAR.get());
                entries.accept(YummyItems.MIGHTY_HOLY_SPEAR.get());
                entries.accept(YummyItems.EBONY_SWORD.get());
                entries.accept(YummyItems.GOD_BLOOD.get());
                entries.accept(YummyItems.SOUL_INFUSED_REDSTONE_SWORD.get());
                entries.accept(YummyItems.SOUL_INFUSED_COPPER_SWORD.get());
                entries.accept(YummyItems.SOUL_INFUSED_GOLDEN_SWORD.get());
                entries.accept(YummyItems.SOUL_INFUSED_EMERALD_SWORD.get());
                entries.accept(YummyItems.SOUL_INFUSED_DIAMOND_SWORD.get());
                entries.accept(YummyItems.SOUL_INFUSED_LAPIS_SWORD.get());
                entries.accept(YummyItems.SOUL_INFUSED_AMETHYST_SWORD.get());
                entries.accept(YummyItems.SOUL_INFUSED_NECTARIUM_SWORD.get());
                entries.accept(YummyItems.PURIFIED_SOUL_SWORD.get());
                entries.accept(YummyItems.SOUL_INFUSED_REDSTONE.get());
                entries.accept(YummyItems.SOUL_INFUSED_COPPER.get());
                entries.accept(YummyItems.SOUL_INFUSED_GOLD.get());
                entries.accept(YummyItems.SOUL_INFUSED_EMERALD.get());
                entries.accept(YummyItems.SOUL_INFUSED_DIAMOND.get());
                entries.accept(YummyItems.SOUL_INFUSED_LAPIS.get());
                entries.accept(YummyItems.SOUL_INFUSED_AMETHYST.get());
                entries.accept(YummyItems.SOUL_INFUSED_NECTARIUM.get());
                entries.accept(YummyItems.PURIFIED_SOUL_METAL.get());
                entries.accept(YummyBlocks.SOUL_INFUSED_REDSTONE_BLOCK.get());
                entries.accept(YummyBlocks.SOUL_INFUSED_COPPER_BLOCK.get());
                entries.accept(YummyBlocks.SOUL_INFUSED_GOLD_BLOCK.get());
                entries.accept(YummyBlocks.SOUL_INFUSED_EMERALD_BLOCK.get());
                entries.accept(YummyBlocks.SOUL_INFUSED_DIAMOND_BLOCK.get());
                entries.accept(YummyBlocks.SOUL_INFUSED_LAPIS_BLOCK.get());
                entries.accept(YummyBlocks.SOUL_INFUSED_AMETHYST_BLOCK.get());
                entries.accept(YummyBlocks.SOUL_INFUSED_NECTARIUM_BLOCK.get());
                entries.accept(YummyBlocks.PURIFIED_SOUL_METAL_BLOCK.get());
                entries.accept(YummyItems.HEROBRINE_SPAWN_EGG.get());
                entries.accept(YummyItems.HEROBRINE_PHASE1_DISC.get());
                entries.accept(YummyItems.HEROBRINE_PHASE2_DISC.get());
                entries.accept(YummyItems.HEROBRINE_PHASE3_DISC.get());
                entries.accept(YummyItems.FLOATING_STICK.get());
                entries.accept(YummyItems.METEOR_STAFF.get());
                entries.accept(YummyBlocks.HEROBRINE_SPAWNER_BLOCK.get());
                entries.accept(YummyBlocks.POLLUTED_BLOCK.get());
                entries.accept(YummyBlocks.CORRUPTED_POLLUTED_BLOCK.get());
                entries.accept(YummyBlocks.DISPLAYING_POLLUTED_BLOCK.get());
                entries.accept(YummyBlocks.PURIFIED_SOUL_BLOCK.get());
                entries.accept(YummyItems.PURIFIED_SOUL_HELMET.get());
                entries.accept(YummyItems.PURIFIED_SOUL_CHESTPLATE.get());
                entries.accept(YummyItems.PURIFIED_SOUL_LEGGINGS.get());
                entries.accept(YummyItems.PURIFIED_SOUL_BOOTS.get());
                entries.accept(YummyItems.PURIFIED_SOUL_UPGRADE_SMITHING_TEMPLATE.get());
                entries.accept(YummyItems.PURIFIED_SOUL_SHARD.get());
                entries.accept(YummyItems.FAKE_GOLD_INGOT.get());
                entries.accept(YummyBlocks.FAKE_GOLD_BLOCK.get());
            })
            .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
    @SubscribeEvent
    public static void addToExistingTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tabKey = event.getTabKey();
        if (tabKey == CreativeModeTabs.NATURAL_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(Blocks.DEEPSLATE_DIAMOND_ORE), new ItemStack(YummyBlocks.NECTARIUM_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(YummyBlocks.NECTARIUM_ORE.get()), new ItemStack(YummyBlocks.DEEPSLATE_NECTARIUM_ORE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tabKey == CreativeModeTabs.BUILDING_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(Blocks.DIAMOND_BLOCK), new ItemStack(YummyBlocks.NECTARIUM_BLOCK.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Blocks.AMETHYST_BLOCK), new ItemStack(YummyBlocks.AMETHYST_SHARD_BLOCK.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tabKey == CreativeModeTabs.INGREDIENTS) {
            event.getEntries().putAfter(new ItemStack(Items.DIAMOND), new ItemStack(YummyItems.NECTARIUM.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tabKey == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.getEntries().putAfter(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), new ItemStack(YummyItems.NECTARIUM.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
       }
    }
}
