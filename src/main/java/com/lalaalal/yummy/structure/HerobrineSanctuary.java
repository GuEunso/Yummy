package com.lalaalal.yummy.structure;

import com.google.common.collect.ImmutableMap;
import com.lalaalal.yummy.YummyMod;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.structure.*;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.ProtectedBlockProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;


import java.util.Map;
import java.util.Optional;

public class HerobrineSanctuary extends Structure {
    public static final Codec<HerobrineSanctuary> CODEC = simpleCodec(HerobrineSanctuary::new);
    private static final ResourceLocation HEROBRINE_ENTRANCE = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_entrance");
    private static final ResourceLocation HEROBRINE_010 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_010");
    private static final ResourceLocation HEROBRINE_011 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_011");
    private static final ResourceLocation HEROBRINE_020 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_020");
    private static final ResourceLocation HEROBRINE_021 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_021");
    private static final ResourceLocation HEROBRINE_110 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_110");
    private static final ResourceLocation HEROBRINE_111 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_111");
    private static final ResourceLocation HEROBRINE_120 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_120");
    private static final ResourceLocation HEROBRINE_121 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_121");
    private static final ResourceLocation HEROBRINE_122 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_122");
    private static final ResourceLocation HEROBRINE_130 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_130");
    private static final ResourceLocation HEROBRINE_131 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_131");
    private static final ResourceLocation HEROBRINE_132 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_132");
    private static final ResourceLocation HEROBRINE_140 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_140");
    private static final ResourceLocation HEROBRINE_141 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_141");
    private static final ResourceLocation HEROBRINE_210 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_210");
    private static final ResourceLocation HEROBRINE_211 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_211");
    private static final ResourceLocation HEROBRINE_220 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_220");
    private static final ResourceLocation HEROBRINE_221 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_221");
    private static final ResourceLocation HEROBRINE_222 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_222");
    private static final ResourceLocation HEROBRINE_230 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_230");
    private static final ResourceLocation HEROBRINE_231 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_231");
    private static final ResourceLocation HEROBRINE_232 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_232");
    private static final ResourceLocation HEROBRINE_240 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_240");
    private static final ResourceLocation HEROBRINE_241 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_241");
    private static final ResourceLocation HEROBRINE_300 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_300");
    private static final ResourceLocation HEROBRINE_310 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_310");
    private static final ResourceLocation HEROBRINE_311 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_311");
    private static final ResourceLocation HEROBRINE_320 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_320");
    private static final ResourceLocation HEROBRINE_321 = new ResourceLocation(YummyMod.MOD_ID, "herobrine_sanctuary_321");
    private static final ResourceLocation LAVA_POOL = new ResourceLocation(YummyMod.MOD_ID, "lava_pool");
    private static final ResourceLocation VOID_STRUCTURE = new ResourceLocation(YummyMod.MOD_ID, "void_structure");

    private static final Map<ResourceLocation, BlockPos> OFFSET = new ImmutableMap.Builder<ResourceLocation, BlockPos>()
            .put(HEROBRINE_ENTRANCE, new BlockPos(0, 1, 0))
            .put(HEROBRINE_010, new BlockPos(0, 1, 0))
            .put(HEROBRINE_011, new BlockPos(0, 1, 0))
            .put(HEROBRINE_020, new BlockPos(0, 1, 0))
            .put(HEROBRINE_021, new BlockPos(0, 1, 0))
            .put(HEROBRINE_110, new BlockPos(0, 1, 0))
            .put(HEROBRINE_111, new BlockPos(0, 1, 0))
            .put(HEROBRINE_120, new BlockPos(0, 1, 0))
            .put(HEROBRINE_121, new BlockPos(0, 1, 0))
            .put(HEROBRINE_122, new BlockPos(0, 1, 0))
            .put(HEROBRINE_130, new BlockPos(0, 1, 0))
            .put(HEROBRINE_131, new BlockPos(0, 1, 0))
            .put(HEROBRINE_132, new BlockPos(0, 1, 0))
            .put(HEROBRINE_140, new BlockPos(0, 1, 0))
            .put(HEROBRINE_141, new BlockPos(0, 1, 0))
            .put(HEROBRINE_210, new BlockPos(0, 1, 0))
            .put(HEROBRINE_211, new BlockPos(0, 1, 0))
            .put(HEROBRINE_220, new BlockPos(0, 1, 0))
            .put(HEROBRINE_221, new BlockPos(0, 1, 0))
            .put(HEROBRINE_222, new BlockPos(0, 1, 0))
            .put(HEROBRINE_230, new BlockPos(0, 1, 0))
            .put(HEROBRINE_231, new BlockPos(0, 1, 0))
            .put(HEROBRINE_232, new BlockPos(0, 1, 0))
            .put(HEROBRINE_240, new BlockPos(0, 1, 0))
            .put(HEROBRINE_241, new BlockPos(0, 1, 0))
            .put(HEROBRINE_300, new BlockPos(0, 1, 0))
            .put(HEROBRINE_310, new BlockPos(0, 1, 0))
            .put(HEROBRINE_311, new BlockPos(0, 1, 0))
            .put(HEROBRINE_320, new BlockPos(0, 1, 0))
            .put(HEROBRINE_321, new BlockPos(0, 1, 0))
            .put(LAVA_POOL, new BlockPos(0, 1, 0))
            .put(VOID_STRUCTURE, new BlockPos(0, 1, 0))
            .build();


    protected HerobrineSanctuary(StructureSettings settings) {
        super(settings);
    }

    @Override
    protected Optional<GenerationStub> findGenerationPoint(GenerationContext context) {
        BlockPos blockPos = new BlockPos(context.chunkPos().getMinBlockX(), 68 - 15, context.chunkPos().getMinBlockZ());
        return Optional.of(new GenerationStub(blockPos, (value) -> {
            generatePieces(value, context, blockPos);
        }));
    }

    private static void generatePieces(StructurePiecesBuilder builder, GenerationContext context, BlockPos blockpos) {
        Rotation rotation = Rotation.NONE;
        start(context.structureTemplateManager(), blockpos, rotation, builder, context.random());
    }

    private static void start(StructureTemplateManager manager, BlockPos pos, Rotation rotation, StructurePiecesBuilder builder, WorldgenRandom random) {
        int x = pos.getX();
        int z = pos.getZ();


        BlockPos rotationOffset;
        BlockPos blockPos;

        int[] Xcon = {-76, -28, 20, 48};
        int[] Zcon = {-95, -47, 1, 49, 97, 145, 193};
        int[] Ycon = {-7, 41, 89, 137, 185, 233, 281};

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 7; j++) {
                for (int k = 1; k <= 7; k++) {
                    rotationOffset = new BlockPos(Xcon[i - 1], Ycon[k - 1], Zcon[j - 1]).rotate(rotation);
                    blockPos = rotationOffset.offset(x, pos.getY(), z);
                    builder.addPiece(new Piece(manager, VOID_STRUCTURE, rotation, blockPos));
                }
            }
        }


        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 7; j++){
                rotationOffset = new BlockPos(Xcon[i-1], -7, Zcon[j-1]).rotate(rotation);
                blockPos = rotationOffset.offset(x, pos.getY(), z);
                builder.addPiece(new Piece(manager, LAVA_POOL, rotation, blockPos));
            }
        }


        rotationOffset = (new BlockPos(-4, -7, 1-96)).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_ENTRANCE, rotation, blockPos));
        //
        //
        rotationOffset = new BlockPos(1, 1, 27-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_110, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 1, 27-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_210, rotation, blockPos));

        rotationOffset = new BlockPos(1, 49, 27-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_111, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 49, 27-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_211, rotation, blockPos));
        //
        //
        rotationOffset = new BlockPos(1, 1, 75-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_120, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 1, 75-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_220, rotation, blockPos));

        rotationOffset = new BlockPos(1, 49, 75-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_121, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 49, 75-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_221, rotation, blockPos));
        //
        //
        rotationOffset = new BlockPos(1, 1, 123-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_130, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 1, 123-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_230, rotation, blockPos));

        rotationOffset = new BlockPos(1, 49, 123-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_131, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 49, 123-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_231, rotation, blockPos));
        //
        //
        rotationOffset = new BlockPos(1, 1, 171-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_140, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 1, 171-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_240, rotation, blockPos));

        rotationOffset = new BlockPos(1, 49, 171-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_141, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 49, 171-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_241, rotation, blockPos));
        //---------------------
        //---------------------
        //---------------------
        rotationOffset = new BlockPos(30, 1, 91-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_010, rotation, blockPos));

        rotationOffset = new BlockPos(30, 1, 139-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_020, rotation, blockPos));

        rotationOffset = new BlockPos(30, 49, 91-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_011, rotation, blockPos));

        rotationOffset = new BlockPos(30, 49, 139-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_021, rotation, blockPos));
        //
        //
        rotationOffset = new BlockPos(-76, 1, 91-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_310, rotation, blockPos));

        rotationOffset = new BlockPos(-76, 1, 139-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_320, rotation, blockPos));

        rotationOffset = new BlockPos(-76, 49, 91-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_311, rotation, blockPos));

        rotationOffset = new BlockPos(-76, 49, 139-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_321, rotation, blockPos));
        //---------------------
        //---------------------
        //---------------------
        rotationOffset = new BlockPos(1, 97, 111-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_122, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 97, 111-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_222, rotation, blockPos));

        rotationOffset = new BlockPos(1, 97, 159-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_132, rotation, blockPos));

        rotationOffset = new BlockPos(-28, 97, 159-96).rotate(rotation);
        blockPos = rotationOffset.offset(x, pos.getY(), z);
        builder.addPiece(new Piece(manager, HEROBRINE_232, rotation, blockPos));



    }




    @Override
    public StructureType<?> type() {
        return YummyStructures.HeroBrineS.get();
    }

    @Override
    public GenerationStep.Decoration step() {
        return GenerationStep.Decoration.SURFACE_STRUCTURES;
    }

    public static class Piece extends TemplateStructurePiece {
        public Piece(StructureTemplateManager manager, ResourceLocation location, Rotation rotation, BlockPos blockPos) {
            super(YummyStructures.HEROS.get(), 0, manager, location, location.toString(), makeSettings(rotation), makePosition(location, blockPos));
        }

        public Piece(StructureTemplateManager templateManagerIn, CompoundTag tagCompound) {
            super(YummyStructures.HEROS.get(), tagCompound, templateManagerIn, (location) -> makeSettings(Rotation.valueOf(tagCompound.getString("Rot"))));
        }

        public Piece(StructurePieceSerializationContext context, CompoundTag tag) {
            this(context.structureTemplateManager(), tag);
        }


        private static StructurePlaceSettings makeSettings(Rotation rotation) {
            BlockIgnoreProcessor blockignoreprocessor = BlockIgnoreProcessor.STRUCTURE_BLOCK;
            return (new StructurePlaceSettings()).setRotation(rotation).setMirror(Mirror.NONE).addProcessor(blockignoreprocessor).addProcessor(new ProtectedBlockProcessor(BlockTags.FEATURES_CANNOT_REPLACE));
        }

        private static BlockPos makePosition(ResourceLocation location, BlockPos blockPos) {
            return blockPos.offset(HerobrineSanctuary.OFFSET.get(location));
        }

        @Override
        protected void addAdditionalSaveData(StructurePieceSerializationContext context, CompoundTag compoundTag) {
            super.addAdditionalSaveData(context, compoundTag);
            compoundTag.putString("Rot", this.placeSettings.getRotation().name());
        }

        @Override
        protected void handleDataMarker(String pName, BlockPos pPos, ServerLevelAccessor pLevel, RandomSource pRandom, BoundingBox pBox) {

        }

    }
}
