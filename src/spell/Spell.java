package spell;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Spell {
    private static SpellsRepository spellRepository;

    public Spell(SpellsRepository spellRepository) {
        Spell.spellRepository = spellRepository;
    }

    public static String getRandomKnownSpell(String className, int level) {
        List<String> spells = spellRepository.getSpellsByClassAndLevel(className, level);

        if (spells.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int randomSpellIndex = random.nextInt(spells.size());
        return spells.get(randomSpellIndex);
    }

    public static int[] calculateSlots(int level, String className) {
        int[][] classTable = SpellsRepository.getSlotTable(className);

        return classTable[level - 1];
    }

    public static void fillSlots(int level, String className) {
        int[] slots = calculateSlots(level, className);

        Set<String> selectedSpells = new HashSet<>();

        for (int i = 0; i < slots.length; i++) {
            for (int j = 0; j < slots[i]; j++) {
                String randomSpell = getRandomKnownSpell(className, i);

                // To avoid repetitions
                while (selectedSpells.contains(randomSpell)) {
                    randomSpell = getRandomKnownSpell(className, i);
                }

                System.out.println(randomSpell);
                selectedSpells.add(randomSpell);
            }
        }
    }
}
