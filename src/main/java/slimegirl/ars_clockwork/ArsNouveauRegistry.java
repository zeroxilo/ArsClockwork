package slimegirl.ars_clockwork;

import slimegirl.ars_clockwork.glyphs.HighNoon;
import slimegirl.ars_clockwork.glyphs.Merge;
import slimegirl.ars_clockwork.glyphs.MoonSlash;
import slimegirl.ars_clockwork.glyphs.MoonWalk;
import slimegirl.ars_clockwork.glyphs.Moonbeam;
import slimegirl.ars_clockwork.glyphs.Paladin;
import slimegirl.ars_clockwork.glyphs.Saparate;
import slimegirl.ars_clockwork.glyphs.Sunburst;

import com.hollingsworth.arsnouveau.api.registry.GlyphRegistry;
import com.hollingsworth.arsnouveau.api.registry.SpellSoundRegistry;
import com.hollingsworth.arsnouveau.api.sound.SpellSound;
import com.hollingsworth.arsnouveau.api.spell.AbstractSpellPart;
import net.minecraft.network.chat.Component;

import java.util.ArrayList;
import java.util.List;

public class ArsNouveauRegistry {

    public static List<AbstractSpellPart> registeredSpells = new ArrayList<>(); //this will come handy for datagen

    public static void registerGlyphs(){
        register(Moonbeam.INSTANCE);
        register(MoonSlash.INSTANCE);
        register(MoonWalk.INSTANCE);
        register(Sunburst.INSTANCE);
        register(HighNoon.INSTANCE);
        register(Paladin.INSTANCE);
        register(Merge.INSTANCE);
        register(Saparate.INSTANCE);
    }
    public static void registerSounds(){
        //SpellSoundRegistry.registerSpellSound(ModRegistry.EXAMPLE_SPELL_SOUND);
    }
    public static void register(AbstractSpellPart spellPart){
        GlyphRegistry.registerSpell(spellPart);
        registeredSpells.add(spellPart);
    }
}