package com.lalaalal.yummy.datagen;

import com.lalaalal.yummy.block.YummyBlocks;
import com.lalaalal.yummy.item.YummyItems;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class YummyBlockLootTables extends BlockLootSubProvider {

    protected YummyBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(YummyBlocks.SOUL_CRAFTER.get());
        add(YummyBlocks.DEEPSLATE_NECTARIUM_ORE.get(), block -> createOreDrop(block, YummyItems.NECTARIUM.get()));
        dropSelf(YummyBlocks.EBONY_BUTTON.get());
        add(YummyBlocks.EBONY_DOOR.get(), this::createDoorTable);
        dropSelf(YummyBlocks.EBONY_FENCE.get());
        dropSelf(YummyBlocks.EBONY_FENCE_GATE.get());
        add(YummyBlocks.EBONY_LEAVES.get(), createOakLeavesDrops(YummyBlocks.EBONY_LEAVES.get(), YummyBlocks.EBONY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        dropSelf(YummyBlocks.EBONY_LOG.get());
        dropSelf(YummyBlocks.EBONY_PLANKS.get());
        dropSelf(YummyBlocks.EBONY_PRESSURE_PLATE.get());
        dropSelf(YummyBlocks.EBONY_SAPLING.get());
        dropOther(YummyBlocks.EBONY_SIGN.get(), YummyItems.EBONY_SIGN.get());
        dropSelf(YummyBlocks.EBONY_SLAB.get());
        dropSelf(YummyBlocks.EBONY_STAIRS.get());
        dropSelf(YummyBlocks.EBONY_TRAPDOOR.get());
        dropOther(YummyBlocks.EBONY_WALL_SIGN.get(), YummyItems.EBONY_SIGN.get());
        dropSelf(YummyBlocks.EBONY_WOOD.get());
        dropSelf(YummyBlocks.HARD_EBONY_PLANKS.get());
        dropSelf(YummyBlocks.PURIFIED_SOUL_BLOCK.get());
        dropSelf(YummyBlocks.NECTARIUM_BLOCK.get());
        dropSelf(YummyBlocks.FAKE_GOLD_BLOCK.get());
        dropSelf(YummyBlocks.SOUL_INFUSED_REDSTONE_BLOCK.get());
        dropSelf(YummyBlocks.SOUL_INFUSED_COPPER_BLOCK.get());
        dropSelf(YummyBlocks.SOUL_INFUSED_GOLD_BLOCK.get());
        dropSelf(YummyBlocks.SOUL_INFUSED_EMERALD_BLOCK.get());
        dropSelf(YummyBlocks.SOUL_INFUSED_DIAMOND_BLOCK.get());
        dropSelf(YummyBlocks.SOUL_INFUSED_LAPIS_BLOCK.get());
        dropSelf(YummyBlocks.SOUL_INFUSED_AMETHYST_BLOCK.get());
        dropSelf(YummyBlocks.SOUL_INFUSED_NECTARIUM_BLOCK.get());
        dropSelf(YummyBlocks.PURIFIED_SOUL_METAL_BLOCK.get());
        add(YummyBlocks.NECTARIUM_ORE.get(), block -> createOreDrop(block, YummyItems.NECTARIUM.get()));
        dropSelf(YummyBlocks.STRIPPED_EBONY_LOG.get());
        dropSelf(YummyBlocks.STRIPPED_EBONY_WOOD.get());
        dropOther(YummyBlocks.EBONY_HANGING_SIGN.get(), YummyItems.EBONY_HANGING_SIGN.get());
        dropOther(YummyBlocks.EBONY_WALL_HANGING_SIGN.get(), YummyItems.EBONY_HANGING_SIGN.get());
        dropSelf(YummyBlocks.AMETHYST_SHARD_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return YummyBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
