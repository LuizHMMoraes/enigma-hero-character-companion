package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Ranger extends Classes {

    public Ranger(String className, String fightingStyle, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomFightingStyle(int level) {
        if (level < 2) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Ranger.FightingStyle.length);
            return Ranger.FightingStyle[index];
        }
    }

    public static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Ranger.Specialization.length);
            return Ranger.Specialization[index];
        }
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("Hunter".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesHunter, 0, level));
        } else if ("Beastmaster".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesBeastmaster, 0, level));
        } else {        // ranger features (no specialization)
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesHunter, 0, 2));
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

    public static int getRangerHitDice() {
        return 10;
    }

    // Proficiencies
    public static Proficiency getProficiency() {
        Proficiency classProficiency = new Proficiency();

        ArrayList<String> armor = new ArrayList<>();
        armor.add("Light Armor");
        armor.add("Medium Armor");
        armor.add("Shields");

        ArrayList<String> weapons = new ArrayList<>();
        weapons.add("Simple Weapons");
        weapons.add("Martial Weapons");

        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Strength");
        savingThrows.add("Dexterity");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 3) {
            Skill newSkill = classProficiency.RandomSkillRanger();
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
        "Two-Weapon Fighting"
    };

    // Ranger Archetypes
    private static String[] Specialization = {
        "Hunter",
        "Beastmaster"
    };

    private static String[][] FeaturesHunter = {
        {"Favored Enemy", "Natural Explorer"},
        {"Fighting Style", "Spellcasting"},
        {"Primeval Awareness", "Hunter's Prey"}, //archetype feature
        {}, //ability score improvement
        {"Extra Attack"},
        {"Favored Enemy and Natural Explorer improvements"},
        {"Defensive Tactics"}, //archetype feature
        {"Land's Stride"}, //ability score improvement
        {},
        {"Natural Explorer improvement", "Hide in Plain Sight"},
        {"Multiattack"}, //archetype feature
        {}, //ability score improvement
        {},
        {"Favored Enemy improvement", "Vanish"},
        {"Superior Hunter's Defense"}, //archetype feature
        {}, //ability score improvement
        {},
        {"Feral Senses"}, 
        {}, //ability score improvement
        {"Foe Slayer"},
    };

    private static String[][] FeaturesBeastmaster = {
        {"Favored Enemy", "Natural Explorer"},
        {"Fighting Style", "Spellcasting"},
        {"Primeval Awareness", "Ranger's Companion"}, //archetype feature
        {}, //ability score improvement
        {"Extra Attack"},
        {"Favored Enemy and Natural Explorer improvements"},
        {"Exceptional Training"}, //archetype feature
        {"Land's Stride"}, //ability score improvement
        {},
        {"Natural Explorer improvement", "Hide in Plain Sight"},
        {"Bestial Fury"}, //archetype feature
        {}, //ability score improvement
        {},
        {"Favored Enemy improvement", "Vanish"},
        {"Share Spells"}, //archetype feature
        {}, //ability score improvement
        {},
        {"Feral Senses"}, 
        {}, //ability score improvement
        {"Foe Slayer"},
    };

}