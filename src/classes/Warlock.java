package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Warlock extends Classes {

    public Warlock(String className, String fightingStyle, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomFightingStyle(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Warlock.FightingStyle.length);
            return Warlock.FightingStyle[index];
        }
    }

    public static String getRandomSpecialization() {
        Random random = new Random();
        int index = random.nextInt(Warlock.Specialization.length);
        return Warlock.Specialization[index];
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("The Archfey".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesArchfey, 0, level));
        } else if ("The Fiend".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesFiend, 0, level));
        } else if ("The Great Old One".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesGreatOldOne, 0, level));
        }

        return getFeaturesList(featureList);
    }

    private static List<String> getFeaturesList(List<String[]> featureList) {
        List<String> result = new ArrayList<>();
        if (featureList != null) {
            for (String[] sublist : featureList) {
                result.addAll(Arrays.asList(sublist));
            }
        }
        return result;
    }

    public static int getWarlockHitDice() {
        return 8;
    }

    // Proficiencies
    public static Proficiency getProficiency() {
        Proficiency classProficiency = new Proficiency();

        ArrayList<String> armor = new ArrayList<>();
        armor.add("Light Armor");

        ArrayList<String> weapons = new ArrayList<>();
        weapons.add("Simple Weapons");

        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Wisdom");
        savingThrows.add("Charisma");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 2) {
            Skill newSkill = classProficiency.RandomSkillWarlock();
            if (!skills.contains(newSkill)) {
                skills.add(newSkill);
            }
        }

        classProficiency.setArmor(armor);
        classProficiency.setWeapon(weapons);
        classProficiency.setSavingThrow(savingThrows);
        classProficiency.setSkill(skills);

        return classProficiency;
    }

    // Pact Boon
    private static String[] FightingStyle = {
        "Pact of the Chain",
        "Pact of the Blade",
        "Pact of the Tome"
    };

    // Otherworldly Patrons
    private static String[] Specialization = {
        "The Archfey",
        "The Fiend",
        "The Great Old One"
    };

    private static String[][] FeaturesArchfey = {
        {"Pact Magic", "Expanded Spell List", "Fey Presence"}, //patron feature
        {"Eldritch Invocations"},
        {"Pact Boon"},
        {}, //ability score improvement
        {},
        {"Misty Escape"}, //patron feature
        {},
        {}, //ability score improvement
        {},
        {"Beguiling Defenses"}, //patron feature
        {"Mystic Arcanum (6th level)"},
        {}, //ability score improvement
        {"Mystic Arcanum (7th level)"}, 
        {"Dark Delirium"}, //patron feature
        {"Mystic Arcanum (8th level)"},
        {}, //ability score improvement
        {"Mystic Arcanum (9th level)"},
        {},
        {}, //ability score improvement
        {"Eldritch Master"},
    };

    private static String[][] FeaturesFiend = {
        {"Pact Magic", "Expanded Spell List", "Dark One s Blessing"}, //patron feature
        {"Eldritch Invocations"},
        {"Pact Boon"},
        {}, //ability score improvement
        {},
        {"Dark One s Own Luck"}, //patron feature
        {},
        {}, //ability score improvement
        {},
        {"Fiendish Resilience"}, //patron feature
        {"Mystic Arcanum (6th level)"},
        {}, //ability score improvement
        {"Mystic Arcanum (7th level)"}, 
        {"Hurl Through Hell"}, //patron feature
        {"Mystic Arcanum (8th level)"},
        {}, //ability score improvement
        {"Mystic Arcanum (9th level)"},
        {},
        {}, //ability score improvement
        {"Eldritch Master"},
    };

    private static String[][] FeaturesGreatOldOne = {
        {"Pact Magic", "Expanded Spell List", "Awakened Mind"}, //patron feature
        {"Eldritch Invocations"},
        {"Pact Boon"},
        {}, //ability score improvement
        {},
        {"Entropic Ward"}, //patron feature
        {},
        {}, //ability score improvement
        {},
        {"Thought Shield"}, //patron feature
        {"Mystic Arcanum (6th level)"},
        {}, //ability score improvement
        {"Mystic Arcanum (7th level)"}, 
        {"Create Thrall"}, //patron feature
        {"Mystic Arcanum (8th level)"},
        {}, //ability score improvement
        {"Mystic Arcanum (9th level)"},
        {},
        {}, //ability score improvement
        {"Eldritch Master"},
    };

}