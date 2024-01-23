package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Fighter extends Classes {

    public Fighter(String className, String fightingStyle, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomFightingStyle() {
        Random random = new Random();
        int index = random.nextInt(Fighter.FightingStyle.length);
        return Fighter.FightingStyle[index];
    }

    public static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Fighter.Specialization.length);
            return Fighter.Specialization[index];
        }
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("Champion".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesChampion, 0, level));
        } else if ("Battle Master".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesBattleMaster, 0, level));
        } else if ("Eldritch Knight".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesEldritchKnight, 0, level));
        } else {        // fighter features (no specialization)
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesChampion, 0, 2));
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

    public static int getFighterHitDice() {
        return 10;
    }

    // Proficiencies
    public static Proficiency getProficiency() {
        Proficiency classProficiency = new Proficiency();

        ArrayList<String> armor = new ArrayList<>();
        armor.add("All Armor");
        armor.add("Shields");

        ArrayList<String> weapons = new ArrayList<>();
        weapons.add("Simple Weapons");
        weapons.add("Martial Weapons");

        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Strength");
        savingThrows.add("Constitution");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 2) {
            Skill newSkill = classProficiency.RandomSkillFighter();
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

    // Fighting Style
    private static String[] FightingStyle = {
        "Archery",
        "Defense",
        "Dueling",
        "Great Weapon Fighting",
        "Protection",
        "Two-Weapon Fighting"
    };

    // Martial Archetypes
    private static String[] Specialization = {
        "Champion",
        "Battle Master",
        "Eldritch Knight",
    };

    private static String[][] FeaturesChampion = {
        {"Fighting Style", "Second Wind"},
        {"Action Surge (one use)"},
        {"Improved Critical"}, //archetype feature
        {}, //ability score improvement
        {"Extra Attack"},
        {}, //ability score improvement
        {"Remarkable Athlete"}, //archetype feature
        {}, //ability score improvement
        {"Indomitable (one use)"},
        {"Additional Fighting Style"}, //archetype feature
        {"Extra Attack (2)"},
        {}, //ability score improvement
        {"Indomitable (two uses)"},
        {}, //ability score improvement
        {"Superior Critical"}, //archetype feature
        {}, //ability score improvement
        {"Action Surge (two uses)", "Indomitable (three uses)"},
        {"Survivor"}, //archetype feature
        {}, //ability score improvement
        {"Extra Attack (3)"},
    };

    private static String[][] FeaturesBattleMaster = {
        {"Fighting Style", "Second Wind"},
        {"Action Surge (one use)"},
        {"Combat Superiority", "Student of War"}, //archetype feature
        {}, //ability score improvement
        {"Extra Attack"},
        {}, //ability score improvement
        {"Know Your Enemy"}, //archetype feature
        {}, //ability score improvement
        {"Indomitable (one use)"},
        {"Improved Combat Superiority"}, //archetype feature
        {"Extra Attack (2)"},
        {}, //ability score improvement
        {"Indomitable (two uses)"},
        {}, //ability score improvement
        {"Relentless"}, //archetype feature
        {}, //ability score improvement
        {"Action Surge (two uses)", "Indomitable (three uses)"},
        {}, //archetype feature
        {}, //ability score improvement
        {"Extra Attack (3)"},
    };

    private static String[][] FeaturesEldritchKnight = {
        {"Fighting Style", "Second Wind"},
        {"Action Surge (one use)"},
        {"Spellcasting", "Weapon Bond"}, //archetype feature
        {}, //ability score improvement
        {"Extra Attack"},
        {}, //ability score improvement
        {"War Magic"}, //archetype feature
        {}, //ability score improvement
        {"Indomitable (one use)"},
        {"Eldritch Strike"}, //archetype feature
        {"Extra Attack (2)"},
        {}, //ability score improvement
        {"Indomitable (two uses)"},
        {}, //ability score improvement
        {"Arcane Charge"}, //archetype feature
        {}, //ability score improvement
        {"Action Surge (two uses)", "Indomitable (three uses)"},
        {"Improved War Magic"}, //archetype feature
        {}, //ability score improvement
        {"Extra Attack (3)"},
    };

}