package spell;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Spell {
    private static SpellsRepository spellRepository;

    public Spell(SpellsRepository spellRepository) {
        Spell.spellRepository = spellRepository;
    }

    public String getRandomKnownSpell(String className, int level) {
        List<String> spells = spellRepository.getSpellsByClassAndLevel(className, level);

        if (spells.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int randomSpellIndex = random.nextInt(spells.size());
        return spells.get(randomSpellIndex);
    }

    public int[] calculateSlots(int level, String className) {
        int[][] classTable = SpellsRepository.getSlotTable(className);

        return classTable[level - 1];
    }

    public int getSpellSlots(String className, int characterLevel, int spellLevel) {
        int [][] slotTable = SpellsRepository.getSlotTable(className);

        return slotTable[(characterLevel - 1)][(spellLevel)];
    }

    public static int countCurrentSpells(List<List<String>> stringLists) {
        int count = 0;

        for (int i = 1; i < stringLists.size(); i++) {
            count += stringLists.get(i).size();
        }

        return count;
    }

    /*
    public void fillSlots(int level, String className) {
        int[] slots = calculateSlots(level, className);

        Set<String> selectedSpells = new HashSet<>();

        for (int i = 0; i < slots.length; i++) {

            if (slots[i] > 0) {
                if (i==0) {
                    System.out.println("Cantrips:");
                }
                else {
                    System.out.println("Level " + i + ":");
                }
    
                for (int j = 0; j < slots[i]; j++) {
                    String randomSpell = getRandomKnownSpell(className, i);
    
                    while (selectedSpells.contains(randomSpell)) {
                        randomSpell = getRandomKnownSpell(className, i);
                    }
    
                    System.out.println(randomSpell);
                    selectedSpells.add(randomSpell);
                }
    
                System.out.println("");
            }
        }
    }
    */
    
    public List<String> getAllSpellsForLevel(String className, int level) {
        List<String> allSpells = spellRepository.getSpellsByClassAndLevel(className, level);
        return allSpells;
    }

    public static int getNumberOfKnownSpells(String className, int level) {
        if (SpellsRepository.numberOfKnownSpells.containsKey(className)) {
            int[][] spellsArray = SpellsRepository.numberOfKnownSpells.get(className);
            return spellsArray[level-1][0];
        } else {
            return -1;
        }
    }

    public int getTotalSpellsCount(List<List<String>> spellsByLevel) {
        int totalSpells = 0;
    
        for (List<String> spellsForLevel : spellsByLevel) {
            totalSpells += spellsForLevel.size();
        }
    
        return totalSpells;
    }

    public int getMaxSpellLevel(String className, int level) {
        int[][] slotTable = SpellsRepository.getSlotTable(className);
    
        for (int i = slotTable[level - 1].length - 1; i >= 0; i--) {
            if (slotTable[level - 1][i] > 0) {
                return i;
            }
        }
    
        return -1;
    }

    public List<String> getRandomSpellsByLevel(String className, int spellLevel, int count) {
        List<String> spells = new ArrayList<>();
        Set<String> selectedSpells = new HashSet<>();

        while (spells.size() < count) {
            String randomSpell = getRandomKnownSpell(className, spellLevel);
            if (!selectedSpells.contains(randomSpell)) {
                spells.add(randomSpell);
                selectedSpells.add(randomSpell);
            }
        }

        return spells;
    }

    public List<List<String>> getPreparedSpells(String className, int level) {
        List<List<String>> spellsByLevel = new ArrayList<>();
    
        int[][] slotTable = SpellsRepository.getSlotTable(className);
        int[] slots = slotTable[level - 1];
    
        for (int i = 0; i < slots.length; i++) {
            List<String> spellsForLevel;
    
            int availableSlots = slots[i];
    
            if (availableSlots > 0) {
                spellsForLevel = getRandomSpellsByLevel(className, i, availableSlots);
            } else {
                spellsForLevel = new ArrayList<>();
            }
    
            spellsByLevel.add(spellsForLevel);
        }
    
        return spellsByLevel;
    }

    public List<List<String>> getKnownSpells(String className, int level) {
        List<List<String>> spellsByLevel = new ArrayList<>();
    
        int[][] slotTable = SpellsRepository.getSlotTable(className);
        int[] slots = slotTable[level - 1];

        int maxSpells, currentSpellsNumber, maxSpellLevel;

        int maxKnowSpells = getNumberOfKnownSpells(className, level);
    
        if (maxKnowSpells == -1) {          // Cleric, Druid OU Paladin
            for (int i = 0; i < slots.length; i++) {

                if (i == 0) {
                    List<String> spellsForLevel;
        
                    int availableSlots = slots[i];
        
                    if (availableSlots > 0) {
                        spellsForLevel = getRandomSpellsByLevel(className, i, availableSlots);
                    } else {
                        spellsForLevel = new ArrayList<>();
                    }
        
                spellsByLevel.add(spellsForLevel);
    
                } else {
                    List<String> spellsForLevel = spellRepository.getSpellsByClassAndLevel(className, i);
                    spellsByLevel.add(spellsForLevel);
                    
                }
    
            }
        } else {                        // Bard, Ranger, Sorcerer, Warlock or Wizard

            // Adiciona as cantrips
            List<String> spellsForLevel;
            int availableSlots = slots[0];
            if (availableSlots > 0) {
                spellsForLevel = getRandomSpellsByLevel(className, 0, availableSlots);
            } else {
                spellsForLevel = new ArrayList<>();
            }
            spellsByLevel.add(spellsForLevel);

            // Inicializa as listas da lista spellsByLevel
            for (int i = 0; i < 9; i++) {
                spellsByLevel.add(new ArrayList<>());
            }

            for (int i = 1; i < level; i++) {
                    maxSpells = getNumberOfKnownSpells(className, i);
                    currentSpellsNumber = countCurrentSpells(spellsByLevel);
                    maxSpellLevel = getMaxSpellLevel(className, i);

                    while (currentSpellsNumber < maxSpells) {
                        String newSpell;
                        do {
                            newSpell = getRandomKnownSpell(className, maxSpellLevel);
                        } while (spellsByLevel.get(maxSpellLevel).contains(newSpell));

                        spellsByLevel.get(maxSpellLevel).add(newSpell);
                        currentSpellsNumber++;

                    }
            }
        }
    
        return spellsByLevel;
    }
}
