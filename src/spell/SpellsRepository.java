package spell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpellsRepository {
    private Map<String, Map<Integer, List<String>>> spellsByClassAndLevel;
    private static Map<String, int[][]> slotTables = new HashMap<>();
    static Map<String, int[][]> numberOfKnownSpells = new HashMap<>();

    public static int[][] getSlotTable(String classType) {
        return slotTables.get(classType);
    }

    public SpellsRepository() {
        this.spellsByClassAndLevel = new HashMap<>();
        initializeSpells();
    }

    private void addSpells(String classType, int level, String... spellNames) {
        for (String spellName : spellNames) {
            addSpell(classType, level, spellName);
        }
    }

    private void addSpell(String classType, int level, String spellName) {
        spellsByClassAndLevel
            .computeIfAbsent(classType, k -> new HashMap<>())
            .computeIfAbsent(level, k -> new ArrayList<>())
            .add(spellName);
    }

    public List<String> getSpellsByClassAndLevel(String classType, int level) {
        return spellsByClassAndLevel
            .getOrDefault(classType, new HashMap<>())
            .getOrDefault(level, new ArrayList<>());
    }

   // Initializes the tables with the number of spells for each spell level for each character class
    static {
        slotTables.put("Bard", new int[][]{
            {2, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 4, 2, 0, 0, 0, 0, 0, 0, 0},
            {3, 4, 3, 0, 0, 0, 0, 0, 0, 0},
            {3, 4, 3, 2, 0, 0, 0, 0, 0, 0},
            {3, 4, 3, 3, 0, 0, 0, 0, 0, 0},
            {3, 4, 3, 3, 1, 0, 0, 0, 0, 0},
            {3, 4, 3, 3, 2, 0, 0, 0, 0, 0},
            {3, 4, 3, 3, 3, 1, 0, 0, 0, 0},
            {4, 4, 3, 3, 3, 2, 0, 0, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 1, 1},
            {4, 4, 3, 3, 3, 3, 1, 1, 1, 1},
            {4, 4, 3, 3, 3, 3, 2, 1, 1, 1},
            {4, 4, 3, 3, 3, 3, 2, 2, 1, 1}
        });

        slotTables.put("Cleric", new int[][]{
            {3, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {3, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {3, 4, 2, 0, 0, 0, 0, 0, 0, 0},
            {4, 4, 3, 0, 0, 0, 0, 0, 0, 0},
            {4, 4, 3, 2, 0, 0, 0, 0, 0, 0},
            {4, 4, 3, 3, 0, 0, 0, 0, 0, 0},
            {4, 4, 3, 3, 1, 0, 0, 0, 0, 0},
            {4, 4, 3, 3, 2, 0, 0, 0, 0, 0},
            {4, 4, 3, 3, 3, 1, 0, 0, 0, 0},
            {5, 4, 3, 3, 3, 2, 0, 0, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 1, 1},
            {5, 4, 3, 3, 3, 3, 1, 1, 1, 1},
            {5, 4, 3, 3, 3, 3, 2, 1, 1, 1},
            {5, 4, 3, 3, 3, 3, 2, 2, 1, 1}
        });

        slotTables.put("Druid", new int[][]{
            {2, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 4, 2, 0, 0, 0, 0, 0, 0, 0},
            {3, 4, 3, 0, 0, 0, 0, 0, 0, 0},
            {3, 4, 3, 2, 0, 0, 0, 0, 0, 0},
            {3, 4, 3, 3, 0, 0, 0, 0, 0, 0},
            {3, 4, 3, 3, 1, 0, 0, 0, 0, 0},
            {3, 4, 3, 3, 2, 0, 0, 0, 0, 0},
            {3, 4, 3, 3, 3, 1, 0, 0, 0, 0},
            {4, 4, 3, 3, 3, 2, 0, 0, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {4, 4, 3, 3, 3, 2, 1, 1, 1, 1},
            {4, 4, 3, 3, 3, 3, 1, 1, 1, 1},
            {4, 4, 3, 3, 3, 3, 2, 1, 1, 1},
            {4, 4, 3, 3, 3, 3, 2, 2, 1, 1}
        });

        slotTables.put("Paladin", new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 2, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 2, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 1, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 1, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 2, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 2, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 3, 1, 0, 0, 0, 0},
            {0, 4, 3, 3, 3, 1, 0, 0, 0, 0},
            {0, 4, 3, 3, 3, 2, 0, 0, 0, 0},
            {0, 4, 3, 3, 3, 2, 0, 0, 0, 0}
        });

        slotTables.put("Ranger", new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 0, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 2, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 2, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 0, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 1, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 1, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 2, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 2, 0, 0, 0, 0, 0},
            {0, 4, 3, 3, 3, 1, 0, 0, 0, 0},
            {0, 4, 3, 3, 3, 1, 0, 0, 0, 0},
            {0, 4, 3, 3, 3, 2, 0, 0, 0, 0},
            {0, 4, 3, 3, 3, 2, 0, 0, 0, 0}
        });

        slotTables.put("Sorcerer", new int[][]{
            {4, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {4, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {4, 4, 2, 0, 0, 0, 0, 0, 0, 0},
            {5, 4, 3, 0, 0, 0, 0, 0, 0, 0},
            {5, 4, 3, 2, 0, 0, 0, 0, 0, 0},
            {5, 4, 3, 3, 0, 0, 0, 0, 0, 0},
            {5, 4, 3, 3, 1, 0, 0, 0, 0, 0},
            {5, 4, 3, 3, 2, 0, 0, 0, 0, 0},
            {5, 4, 3, 3, 3, 1, 0, 0, 0, 0},
            {6, 4, 3, 3, 3, 2, 0, 0, 0, 0},
            {6, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {6, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {6, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {6, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {6, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {6, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {6, 4, 3, 3, 3, 2, 1, 1, 1, 1},
            {6, 4, 3, 3, 3, 3, 1, 1, 1, 1},
            {6, 4, 3, 3, 3, 3, 2, 1, 1, 1},
            {6, 4, 3, 3, 3, 3, 2, 2, 1, 1}
        });

        slotTables.put("Warlock", new int[][]{
            {2, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 2, 0, 0, 0, 0, 0, 0, 0},
            {3, 0, 2, 0, 0, 0, 0, 0, 0, 0},
            {3, 0, 0, 2, 0, 0, 0, 0, 0, 0},
            {3, 0, 0, 2, 0, 0, 0, 0, 0, 0},
            {3, 0, 0, 0, 2, 0, 0, 0, 0, 0},
            {3, 0, 0, 0, 2, 0, 0, 0, 0, 0},
            {3, 0, 0, 0, 0, 2, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 2, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 3, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 4, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 4, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 4, 0, 0, 0, 0},
            {4, 0, 0, 0, 0, 4, 0, 0, 0, 0}
        });

        slotTables.put("Wizard", new int[][]{
            {3, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {3, 3, 0, 0, 0, 0, 0, 0, 0, 0},
            {3, 4, 2, 0, 0, 0, 0, 0, 0, 0},
            {4, 4, 3, 0, 0, 0, 0, 0, 0, 0},
            {4, 4, 3, 2, 0, 0, 0, 0, 0, 0},
            {4, 4, 3, 3, 0, 0, 0, 0, 0, 0},
            {4, 4, 3, 3, 1, 0, 0, 0, 0, 0},
            {4, 4, 3, 3, 2, 0, 0, 0, 0, 0},
            {4, 4, 3, 3, 3, 1, 0, 0, 0, 0},
            {5, 4, 3, 3, 3, 2, 0, 0, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 0, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 0, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 1, 0},
            {5, 4, 3, 3, 3, 2, 1, 1, 1, 1},
            {5, 4, 3, 3, 3, 3, 1, 1, 1, 1},
            {5, 4, 3, 3, 3, 3, 2, 1, 1, 1},
            {5, 4, 3, 3, 3, 3, 2, 2, 1, 1}
        });


        // Initializes the table with the number of spells known for each level of each character class
        numberOfKnownSpells.put("Bard", new int[][]{
            {4}, {5}, {6}, {7}, {8}, {9}, {10}, {11}, {12}, {14}, {15}, {15}, {16}, {18}, {19}, {19}, {20}, {22}, {22}, {22}
        });

        numberOfKnownSpells.put("Ranger", new int[][]{
            {0}, {2}, {3}, {3}, {4}, {4}, {5}, {5}, {6}, {6}, {7}, {7}, {8}, {8}, {9}, {9}, {10}, {10}, {11}, {11}
        });

        numberOfKnownSpells.put("Sorcerer", new int[][]{
            {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}, {11}, {12}, {12}, {13}, {13}, {14}, {14}, {15}, {15}, {15}, {15}
        });

        numberOfKnownSpells.put("Warlock", new int[][]{
            {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}, {10}, {11}, {11}, {12}, {12}, {13}, {13}, {14}, {14}, {15}, {15}
        });

        numberOfKnownSpells.put("Wizard", new int[][]{
            {6}, {8}, {10}, {12}, {14}, {16}, {18}, {20}, {22}, {24}, {26}, {28}, {30}, {32}, {34}, {36}, {38}, {40}, {42}, {44}
        });
    }

    // Initializes the spells for each character class, by spell level
    private void initializeSpells() {
        // BARD
        addSpells("Bard", 0,
            "Blade Ward", "Dancing Lights", "Friends", "Light", "Mage Hand",
            "Mending", "Message", "Minor Illusion", "Prestidigitation", "True Strike", "Vicious Mockery");
        
        addSpells("Bard", 1,
            "Animal Friendship", "Bane", "Charm Person", "Comprehend Languages", "Cure Wounds",
            "Detect Magic", "Disguise Self", "Dissonant Whispers", "Faerie Fire", "Feather Fall",
            "Healing Word", "Heroism", "Identify", "Illusory Script", "Longstrider", "Silent Image",
            "Sleep", "Speak with Animals", "Tasha s Hideous Laughter", "Thunderwave", "Unseen Servant");
        
        addSpells("Bard", 2,
            "Animal Messenger", "Blindness/Deafness", "Calm Emotions", "Cloud of Daggers", "Crown of Madness",
            "Detect Thoughts", "Enhance Ability", "Enthrall", "Heat Metal", "Hold Person",
            "Invisibility", "Knock", "Lesser Restoration", "Locate Animals or Plants", "Locate Object",
            "Magic Mouth", "Phantasmal Force", "See Invisibility", "Shatter", "Silence", "Suggestion", "Zone of Truth");

        addSpells("Bard", 3,
            "Bestow Curse", "Clairvoyance", "Dispel Magic", "Fear", "Feign Death",
            "Glyph of Warding", "Hypnotic Pattern", "Leomund s Tiny Hut", "Major Image", "Nondetection",
            "Plant Growth", "Sending", "Speak with Dead", "Speak with Plants", "Stinking Cloud", "Tongues");

        addSpells("Bard", 4,
            "Compulsion", "Confusion", "Dimension Door", "Freedom of Movement", "Greater Invisibility",
            "Hallucinatory Terrain", "Locate Creature", "Polymorph");

        addSpells("Bard", 5,
            "Animate Objects", "Awaken", "Dominate Person", "Dream", "Geas",
            "Greater Restoration", "Hold Monster", "Legend Lore", "Mass Cure Wounds", "Mislead",
            "Modify Memory", "Planar Binding", "Raise Dead", "Scrying", "Seeming", "Teleportation Circle");

        addSpells("Bard", 6,
            "Eyebite", "Find the Path", "Guards and Wards", "Mass Suggestion", "Otto s Irresistible Dance",
            "Programmed Illusion", "True Seeing");

        addSpells("Bard", 7,
            "Etherealness", "Forcecage", "Mirage Arcane", "Mordenkainen s Magnificent Mansion",
            "Mordenkainen s Sword", "Project Image", "Regenerate", "Resurrection", "Symbol", "Teleport");

        addSpells("Bard", 8,
            "Dominate Monster", "Feeblemind", "Glibness", "Mind Blank", "Power Word Stun");

        addSpells("Bard", 9,
            "Foresight", "Power Word Heal", "Power Word Kill", "True Polymorph");

        // CLERIC
        addSpells("Cleric", 0,
            "Guidance", "Light", "Mending", "Resistance", "Sacred Flame", "Spare the Dying", "Thaumaturgy");

        addSpells("Cleric", 1,
            "Bane", "Bless", "Command", "Create or Destroy Water", "Cure Wounds",
            "Detect Evil and Good", "Detect Magic", "Detect Poison and Disease", "Guiding Bolt",
            "Healing Word", "Inflict Wounds", "Protection from Evil and Good", "Purify Food and Drink",
            "Sanctuary", "Shield of Faith");

        addSpells("Cleric", 2,
            "Aid", "Augury", "Blindness/Deafness", "Calm Emotions", "Continual Flame", "Enhance Ability",
            "Find Traps", "Gentle Repose", "Hold Person", "Lesser Restoration", "Locate Object",
            "Prayer of Healing", "Protection from Poison", "Silence", "Spiritual Weapon", "Warding Bond", "Zone of Truth");

        addSpells("Cleric", 3,
            "Animate Dead", "Beacon of Hope", "Bestow Curse", "Clairvoyance", "Create Food and Water",
            "Daylight", "Dispel Magic", "Feign Death", "Glyph of Warding", "Magic Circle",
            "Mass Healing Word", "Meld into Stone", "Protection from Energy", "Remove Curse", "Revivify",
            "Sending", "Speak with Dead", "Spirit Guardians", "Tongues", "Water Walk");

        addSpells("Cleric", 4,
            "Banishment", "Control Water", "Death Ward", "Divination", "Freedom of Movement",
            "Guardian of Faith", "Locate Creature", "Stone Shape");

        addSpells("Cleric", 5,
            "Commune", "Contagion", "Dispel Evil and Good", "Flame Strike", "Geas",
            "Greater Restoration", "Hallow", "Insect Plague", "Legend Lore", "Mass Cure Wounds",
            "Planar Binding", "Raise Dead", "Scrying");

        addSpells("Cleric", 6,
            "Blade Barrier", "Create Undead", "Find the Path", "Forbiddance", "Harm",
            "Heal", "Heroes  Feast", "Planar Ally", "True Seeing", "Word of Recall");

        addSpells("Cleric", 7,
            "Conjure Celestial", "Divine Word", "Etherealness", "Fire Storm", "Plane Shift",
            "Regenerate", "Resurrection", "Symbol");

        addSpells("Cleric", 8,
            "Antimagic Field", "Control Weather", "Earthquake", "Holy Aura");

        addSpells("Cleric", 9,
            "Astral Projection", "Gate", "Mass Heal", "True Resurrection");

        // DRUID
        addSpells("Druid", 0,
            "Druidcraft", "Guidance", "Mending", "Poison Spray", "Produce Flame",
            "Resistance", "Shillelagh", "Thorn Whip");

        addSpells("Druid", 1,
            "Animal Friendship", "Charm Person", "Create or Destroy Water", "Cure Wounds",
            "Detect Magic", "Detect Poison and Disease", "Entangle", "Faerie Fire", "Fog Cloud",
            "Goodberry", "Healing Word", "Jump", "Longstrider", "Purify Food and Drink",
            "Speak with Animals", "Thunderwave");

        addSpells("Druid", 2,
            "Animal Messenger", "Barkskin", "Beast Sense", "Darkvision", "Enhance Ability",
            "Find Traps", "Flame Blade", "Flaming Sphere", "Gust of Wind", "Heat Metal",
            "Hold Person", "Lesser Restoration", "Locate Animals or Plants", "Locate Object",
            "Moonbeam", "Pass without Trace", "Protection from Poison", "Spike Growth");

        addSpells("Druid", 3,
            "Call Lightning", "Conjure Animals", "Daylight", "Dispel Magic", "Feign Death",
            "Meld into Stone", "Plant Growth", "Protection from Energy", "Sleet Storm",
            "Speak with Plants", "Water Breathing", "Water Walk", "Wind Wall");

        addSpells("Druid", 4,
            "Blight", "Confusion", "Conjure Minor Elementals", "Conjure Woodland Beings",
            "Control Water", "Dominate Beast", "Freedom of Movement", "Giant Insect",
            "Grasping Vine", "Hallucinatory Terrain", "Ice Storm", "Locate Creature", "Polymorph",
            "Stone Shape", "Stoneskin", "Wall of Fire");

        addSpells("Druid", 5,
            "Antilife Shell", "Awaken", "Commune with Nature", "Conjure Elemental", "Contagion",
            "Geas", "Greater Restoration", "Insect Plague", "Mass Cure Wounds", "Planar Binding",
            "Reincarnate", "Scrying", "Tree Stride", "Wall of Stone");

        addSpells("Druid", 6,
            "Conjure Fey", "Find the Path", "Heal", "Heroes  Feast", "Move Earth",
            "Sunbeam", "Transport via Plants", "Wall of Thorns", "Wind Walk");

        addSpells("Druid", 7,
            "Fire Storm", "Mirage Arcane", "Plane Shift", "Regenerate", "Reverse Gravity");

        addSpells("Druid", 8,
            "Animal Shapes", "Antipathy/Sympathy", "Control Weather", "Earthquake", "Feeblemind",
            "Sunburst", "Tsunami");

        addSpells("Druid", 9,
            "Foresight", "Shapechange", "Storm of Vengeance", "True Resurrection");

        // PALADIN
        addSpells("Paladin", 1,
            "Bless", "Command", "Compelled Duel", "Cure Wounds", "Detect Evil and Good",
            "Detect Magic", "Detect Poison and Disease", "Divine Favor", "Heroism",
            "Protection from Evil and Good", "Purify Food and Drink", "Searing Smite",
            "Shield of Faith", "Thunderous Smite", "Wrathful Smite");

        addSpells("Paladin", 2,
            "Aid", "Branding Smite", "Find Steed", "Lesser Restoration", "Locate Object",
            "Magic Weapon", "Protection from Poison", "Zone of Truth");

        addSpells("Paladin", 3,
            "Aura of Vitality", "Blinding Smite", "Create Food and Water", "Crusader s Mantle",
            "Daylight", "Dispel Magic", "Elemental Weapon", "Magic Circle", "Remove Curse", "Revivify");

        addSpells("Paladin", 4,
            "Aura of Life", "Aura of Purity", "Banishment", "Death Ward", "Locate Creature",
            "Staggering Smite");

        addSpells("Paladin", 5,
            "Banishing Smite", "Circle of Power", "Destructive Smite", "Dispel Evil and Good",
            "Geas", "Raise Dead");

        // RANGER
        addSpells("Ranger", 1,
            "Alarm", "Animal Friendship", "Cure Wounds", "Detect Magic", "Detect Poison and Disease",
            "Ensnaring Strike", "Fog Cloud", "Goodberry", "Hail of Thorns", "Hunter s Mark",
            "Jump", "Longstrider", "Speak with Animals");

        addSpells("Ranger", 2,
            "Animal Messenger", "Barkskin", "Beast Sense", "Cordon of Arrows", "Darkvision",
            "Find Traps", "Lesser Restoration", "Locate Animals or Plants", "Locate Object",
            "Pass without Trace", "Protection from Poison", "Silence", "Spike Growth");

        addSpells("Ranger", 3,
            "Conjure Animals", "Conjure Barrage", "Daylight", "Lightning Arrow", "Nondetection",
            "Plant Growth", "Protection from Energy", "Speak with Plants", "Water Breathing",
            "Water Walk", "Wind Wall");
        addSpells("Ranger", 4,
            "Conjure Woodland Beings", "Freedom of Movement", "Grasping Vine", "Locate Creature", "Stoneskin");

        addSpells("Ranger", 5,
            "Commune with Nature", "Conjure Volley", "Swift Quiver", "Tree Stride");

        // SORCERER
        addSpells("Sorcerer", 0,
            "Acid Splash", "Blade Ward", "Chill Touch", "Dancing Lights", "Fire Bolt",
            "Friends", "Light", "Mage Hand", "Mending", "Message", "Minor Illusion",
            "Poison Spray", "Prestidigitation", "Ray of Frost", "Shocking Grasp", "True Strike");

        addSpells("Sorcerer", 1,
            "Burning Hands", "Charm Person", "Chromatic Orb", "Color Spray", "Comprehend Languages",
            "Detect Magic", "Disguise Self", "Expeditious Retreat", "False Life", "Feather Fall",
            "Fog Cloud", "Jump", "Mage Armor", "Magic Missile", "Ray of Sickness", "Shield",
            "Silent Image", "Sleep", "Thunderwave", "Witch Bolt");

        addSpells("Sorcerer", 2,
            "Alter Self", "Blindness/Deafness", "Blur", "Cloud of Daggers", "Crown of Madness",
            "Darkness", "Darkvision", "Detect Thoughts", "Enhance Ability", "Enlarge/Reduce",
            "Gust of Wind", "Hold Person", "Invisibility", "Knock", "Levitate", "Mirror Image",
            "Misty Step", "Phantasmal Force", "Scorching Ray", "See Invisibility", "Shatter",
            "Spider Climb", "Suggestion", "Web");

        addSpells("Sorcerer", 3,
            "Blink", "Clairvoyance", "Counterspell", "Daylight", "Dispel Magic", "Fear",
            "Fireball", "Fly", "Gaseous Form", "Haste", "Hypnotic Pattern", "Lightning Bolt",
            "Major Image", "Protection from Energy", "Sleet Storm", "Slow", "Stinking Cloud",
            "Tongues", "Water Breathing", "Water Walk");

        addSpells("Sorcerer", 4,
            "Banishment", "Blight", "Confusion", "Dimension Door", "Dominate Beast",
            "Greater Invisibility", "Ice Storm", "Polymorph", "Stoneskin", "Wall of Fire");

        addSpells("Sorcerer", 5,
            "Animate Objects", "Cloudkill", "Cone of Cold", "Creation", "Dominate Person",
            "Hold Monster", "Insect Plague", "Seeming", "Telekinesis", "Teleportation Circle",
            "Wall of Stone");

        addSpells("Sorcerer", 6,
            "Arcane Gate", "Chain Lightning", "Circle of Death", "Disintegrate", "Eyebite",
            "Globe of Invulnerability", "Mass Suggestion", "Move Earth", "Sunbeam", "True Seeing");

        addSpells("Sorcerer", 7,
            "Delayed Blast Fireball", "Etherealness", "Finger of Death", "Fire Storm",
            "Plane Shift", "Prismatic Spray", "Reverse Gravity", "Teleport");

        addSpells("Sorcerer", 8,
            "Dominate Monster", "Earthquake", "Incendiary Cloud", "Power Word Stun", "Sunburst");

        addSpells("Sorcerer", 9,
            "Gate", "Meteor Swarm", "Power Word Kill", "Time Stop", "Wish");

        // WARLOCK
        addSpells("Warlock", 0,
            "Blade Ward", "Chill Touch", "Eldritch Blast", "Friends", "Mage Hand",
            "Minor Illusion", "Poison Spray", "Prestidigitation", "True Strike");

        addSpells("Warlock", 1,
            "Armor of Agathys", "Arms of Hadar", "Charm Person", "Comprehend Languages",
            "Expeditious Retreat", "Hellish Rebuke", "Hex", "Illusory Script",
            "Protection from Evil and Good", "Unseen Servant", "Witch Bolt");

        addSpells("Warlock", 2,
            "Cloud of Daggers", "Crown of Madness", "Darkness", "Enthrall", "Hold Person",
            "Invisibility", "Mirror Image", "Misty Step", "Ray of Enfeeblement", "Shatter",
            "Spider Climb", "Suggestion");

        addSpells("Warlock", 3,
            "Counterspell", "Dispel Magic", "Fear", "Fly", "Gaseous Form", "Hunger of Hadar",
            "Hypnotic Pattern", "Magic Circle", "Major Image", "Remove Curse", "Tongues",
            "Vampiric Touch");

        addSpells("Warlock", 4,
            "Banishment", "Blight", "Dimension Door", "Hallucinatory Terrain");

        addSpells("Warlock", 5,
            "Contact Other Plane", "Dream", "Hold Monster", "Scrying");

        addSpells("Warlock", 6,
            "Arcane Gate", "Circle of Death", "Conjure Fey", "Create Undead", "Eyebite",
            "Flesh to Stone", "Mass Suggestion", "True Seeing");

        addSpells("Warlock", 7,
            "Etherealness", "Finger of Death", "Forcecage", "Plane Shift");

        addSpells("Warlock", 8,
            "Demiplane", "Dominate Monster", "Feeblemind", "Glibness", "Power Word Stun");

        addSpells("Warlock", 9,
            "Astral Projection", "Foresight", "Imprisonment", "Power Word Kill", "True Polymorph");

        // WIZARD
        addSpells("Wizard", 0,
            "Acid Splash", "Blade Ward", "Chill Touch", "Dancing Lights", "Fire Bolt",
            "Friends", "Light", "Mage Hand", "Mending", "Message", "Minor Illusion",
            "Poison Spray", "Prestidigitation", "Ray of Frost", "Shocking Grasp", "True Strike");

        addSpells("Wizard", 1,
            "Alarm", "Burning Hands", "Charm Person", "Chromatic Orb", "Color Spray",
            "Comprehend Languages", "Detect Magic", "Disguise Self", "Expeditious Retreat",
            "False Life", "Feather Fall", "Find Familiar", "Fog Cloud", "Grease", "Identify",
            "Illusory Script", "Jump", "Longstrider", "Mage Armor", "Magic Missile",
            "Protection from Evil and Good", "Ray of Sickness", "Shield", "Silent Image",
            "Sleep", "Tasha s Hideous Laughter", "Tenser s Floating Disk", "Thunderwave",
            "Unseen Servant", "Witch Bolt");

        addSpells("Wizard", 2,
            "Alter Self", "Arcane Lock", "Blindness/Deafness", "Blur", "Cloud of Daggers",
            "Continual Flame", "Crown of Madness", "Darkness", "Darkvision", "Detect Thoughts",
            "Enlarge/Reduce", "Flaming Sphere", "Gentle Repose", "Gust of Wind", "Hold Person",
            "Invisibility", "Knock", "Levitate", "Locate Object", "Magic Mouth", "Magic Weapon",
            "Melf s Acid Arrow", "Mirror Image", "Misty Step", "Nystul s Magic Aura",
            "Phantasmal Force", "Ray of Enfeeblement", "Rope Trick", "Scorching Ray",
            "See Invisibility", "Shatter", "Spider Climb", "Suggestion", "Web");

        addSpells("Wizard", 3,
            "Animate Dead", "Bestow Curse", "Blink", "Clairvoyance", "Counterspell",
            "Dispel Magic", "Fear", "Feign Death", "Fireball", "Fly", "Gaseous Form",
            "Glyph of Warding", "Haste", "Hypnotic Pattern", "Leomund s Tiny Hut",
            "Lightning Bolt", "Magic Circle", "Major Image", "Nondetection",
            "Phantom Steed", "Protection from Energy", "Remove Curse", "Sending",
            "Sleet Storm", "Slow", "Stinking Cloud", "Tongues", "Vampiric Touch",
            "Water Breathing");

        addSpells("Wizard", 4,
            "Arcane Eye", "Banishment", "Blight", "Confusion", "Conjure Minor Elementals",
            "Control Water", "Dimension Door", "Evard s Black Tentacles", "Fabricate",
            "Fire Shield", "Greater Invisibility", "Hallucinatory Terrain", "Ice Storm",
            "Leomund s Secret ChestLocate Creature", "Mordenkainen s Faithful Hound",
            "Mordenkainen s Private Sanctum", "Otiluke s Resilient Sphere",
            "Phantasmal Killer", "Polymorph", "Stone Shape", "Stoneskin", "Wall of Fire");

        addSpells("Wizard", 5,
            "Animate Objects", "Bigby s Hand", "CloudkilI", "Cone of Cold",
            "Conjure Elemental", "Contact Other Plane", "Creation", "Dominate Person",
            "Dream", "Geas", "Hold Monster", "Legend Lore", "Mislead", "Modify Memory",
            "Passwall", "Planar Binding", "Rary s Telepathic Bond", "Scrying", "Seeming",
            "Telekinesis", "Teleportation Circle", "Wall of Force", "Wall of Stone");

        addSpells("Wizard", 6,
            "Arcane Gate", "Chain Lightning", "Circle of Death", "Contingency",
            "Create Undead", "Disintegrate", "Drawmij s Instant Summons", "Eyebite",
            "Flesh to Stone", "Globe of Invulnerability", "Guards and Wards", "Magic Jar",
            "Mass Suggestion", "Move Earth", "Otiluke s Freezing Sphere",
            "Otto s Irresistible Dance", "Programmed Illusion", "Sunbeam", "True Seeing",
            "Wall of Ice");

        addSpells("Wizard", 7,
            "Delayed Blast Fireball", "Etherealness", "Finger of Death", "Forcecage",
            "Mirage Arcane", "Mordenkainen s Magnificent Mansion", "Mordenkainen s Sword",
            "Plane Shift", "Prismatic Spray", "Project Image", "Reverse Gravity",
            "Sequester", "Simulacrum", "Symbol", "Teleport");

        addSpells("Wizard", 8,
            "Antimagic Field", "Antipathy/Sympathy", "Clone", "Control Weather",
            "Demiplane", "Dominate Monster", "Feeblemind", "Incendiary Cloud", "Maze",
            "Mind Blank", "Power Word Stun", "Sunburst", "Telepathy", "Trap the Soul");

        addSpells("Wizard", 9,
            "Astral Projection", "Foresight", "Gate", "Imprisonment", "Meteor Swarm",
            "Power Word Kill", "Prismatic Wall", "Shapechange", "Time Stop",
            "True Polymorph", "Weird", "Wish");
    }

}