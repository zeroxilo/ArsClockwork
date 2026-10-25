package slimegirl.ars_clockwork.recipes;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import slimegirl.ars_clockwork.ModRecipes;

import java.util.List;

public record MergeRecipe(List<Ingredient> inputs, ItemStack output) implements Recipe<RecipeInput> {
    public static final MapCodec<MergeRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Ingredient.CODEC.listOf().fieldOf("inputs").forGetter(MergeRecipe::inputs),
            ItemStack.CODEC.fieldOf("output").forGetter(MergeRecipe::output)
    ).apply(instance, MergeRecipe::new));

    public MergeRecipe {
        inputs = List.copyOf(inputs);
        output = output.copy();
    }

    @Override
    public boolean matches(RecipeInput input, Level level) {
        if (input.size() < inputs.size()) {
            return false;
        }

        int[] remaining = new int[input.size()];
        for (int i = 0; i < input.size(); i++) {
            remaining[i] = input.getItem(i).getCount();
        }
        return matchesIngredient(0, input, remaining);
    }

    private boolean matchesIngredient(int ingredientIndex, RecipeInput input, int[] remaining) {
        if (ingredientIndex == inputs.size()) {
            return true;
        }

        Ingredient ingredient = inputs.get(ingredientIndex);
        for (int itemIndex = 0; itemIndex < input.size(); itemIndex++) {
            ItemStack stack = input.getItem(itemIndex);
            if (remaining[itemIndex] > 0 && ingredient.test(stack)) {
                remaining[itemIndex]--;
                if (matchesIngredient(ingredientIndex + 1, input, remaining)) {
                    return true;
                }
                remaining[itemIndex]++;
            }
        }
        return false;
    }

    @Override
    public ItemStack assemble(RecipeInput input, HolderLookup.Provider registries) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return inputs.size() <= width * height;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return output.copy();
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> ingredients = NonNullList.create();
        ingredients.addAll(inputs);
        return ingredients;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.MERGE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.MERGE_TYPE.get();
    }
}
