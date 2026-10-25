package slimegirl.ars_clockwork;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import slimegirl.ars_clockwork.recipes.MergeRecipe;

public final class ModRecipes {
    private static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, ArsClockwork.MODID);
    private static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, ArsClockwork.MODID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<MergeRecipe>> MERGE_SERIALIZER =
            SERIALIZERS.register("merge", MergeSerializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<MergeRecipe>> MERGE_TYPE =
            TYPES.register("merge", () -> new RecipeType<MergeRecipe>() {});

    private ModRecipes() {
    }

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }

    private static final class MergeSerializer implements RecipeSerializer<MergeRecipe> {
        private static final StreamCodec<RegistryFriendlyByteBuf, MergeRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC.apply(ByteBufCodecs.list()),
                        MergeRecipe::inputs,
                        net.minecraft.world.item.ItemStack.STREAM_CODEC,
                        MergeRecipe::output,
                        MergeRecipe::new
                );

        @Override
        public com.mojang.serialization.MapCodec<MergeRecipe> codec() {
            return MergeRecipe.CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, MergeRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
