package com.lalaalal.yummy.client.renderer;

import com.lalaalal.yummy.YummyMod;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;

public class EbonyBoatRenderer extends BoatRenderer {

    private final Pair<ResourceLocation, ListModel<Boat>> modelResourcePair;

    private static ResourceLocation getTextureLocation(boolean containChest) {
        String path = containChest ? "textures/entity/chest_boat/ebony.png" : "textures/entity/boat/ebony.png";
        return new ResourceLocation(YummyMod.MOD_ID, path);
    }

    public EbonyBoatRenderer(EntityRendererProvider.Context context, boolean containChest) {
        super(context, containChest);

        ModelLayerLocation modellayerlocation = containChest ? ModelLayers.createChestBoatModelName(Boat.Type.OAK) : ModelLayers.createBoatModelName(Boat.Type.OAK);
        if (!containChest){
            BoatModel model = new BoatModel(context.bakeLayer(modellayerlocation));
            modelResourcePair = new Pair<>(getTextureLocation(containChest), model);
        } else{
            ChestBoatModel model = new ChestBoatModel(context.bakeLayer(modellayerlocation));
            modelResourcePair = new Pair<>(getTextureLocation(containChest), model);
        }


    }

    @Override
    public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(Boat boat) {
        return modelResourcePair;
    }
}
