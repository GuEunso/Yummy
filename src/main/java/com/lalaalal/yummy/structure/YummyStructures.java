package com.lalaalal.yummy.structure;


import com.lalaalal.yummy.YummyMod;
import com.lalaalal.yummy.structure.HerobrineSanctuary;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import com.mojang.serialization.Codec;

public class YummyStructures {
    private static final DeferredRegister<StructureType<?>> STRUCTURES = DeferredRegister.create(Registries.STRUCTURE_TYPE, YummyMod.MOD_ID);
    private static final DeferredRegister<StructurePieceType> PIECE_TYPE = DeferredRegister.create(Registries.STRUCTURE_PIECE, YummyMod.MOD_ID);
    public static final RegistryObject<StructureType<HerobrineSanctuary>> HeroBrineS = STRUCTURES.register("herobrine_sanctuary", () -> explicitStructureTypeTyping(HerobrineSanctuary.CODEC));
    public static final RegistryObject<StructurePieceType> HEROS = PIECE_TYPE.register("herobrine_sanctuary", () -> HerobrineSanctuary.Piece::new);

    private static <T extends Structure> StructureType<T> explicitStructureTypeTyping(Codec<T> structureCodec) {
        return () -> structureCodec;
    }

    public static void register(IEventBus iEventBus) {
        STRUCTURES.register(iEventBus);
        PIECE_TYPE.register(iEventBus);
    }
}
