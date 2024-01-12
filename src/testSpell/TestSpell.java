package testSpell;

import spell.Spell;
import spell.SpellsRepository;

public class TestSpell {
    public static void main(String[] args) {
        SpellsRepository repositorio = new SpellsRepository();
        Spell spell = new Spell(repositorio);


        Spell.fillSlots(8, "Sorcerer");

    }
}
