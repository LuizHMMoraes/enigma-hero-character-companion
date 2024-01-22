package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Cleric extends Classes {

    public Cleric(String className, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomSpecialization() {
        Random random = new Random();
        int index = random.nextInt(Cleric.Specialization.length);
        return Cleric.Specialization[index];
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("Knowledge Domain".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesKnowledge, 0, level));
        } else if ("Life Domain".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesLife, 0, level));
        } else if ("Light Domain".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesLight, 0, level));
        } else if ("Nature Domain".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesNature, 0, level));
        } else if ("Tempest Domain".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesTempest, 0, level));
        } else if ("Trickery Domain".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesTrickery, 0, level));
        } else if ("War Domain".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesWar, 0, level));
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

    public static int getClericHitDice() {
        return 8;
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

        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Wisdom");
        savingThrows.add("Charisma");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 2) {
            Skill newSkill = classProficiency.RandomSkillCleric();
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

    // Divine Domains
    private static String[] Specialization = {
        "Knowledge Domain",
        "Life Domain",
        "Light Domain",
        "Nature Domain",
        "Tempest Domain",
        "Trickery Domain",
        "War Domain"
    };

    private static String[][] FeaturesKnowledge = {
        {"Spellcasting", "Blessings of Knowledge"}, //domain feature
        {"Channel Divinity (1/rest)", "Channel Divinity: Knowledge of the Ages"}, //domain feature
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 1/2)"},
        {"Channel Divinity (2/rest)", "Channel Divinity: Read Thoughts"}, //domain feature
        {},
        {"Destroy Undead (CR 1)", "Potent Spellcasting"}, //domain feature, ability score improvement
        {},
        {"Divine Intervention"},
        {"Destroy Undead (CR 2)"},
        {}, //ability score improvement
        {},
        {"Destroy Undead (CR 3)"},
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 4)", "Visions of the Past"}, //domain feature
        {"Channel Divinity (3/rest)"},
        {}, //ability score improvement
        {"Divine Intervention Improvement"},
    };

    private static String[][] FeaturesLife = {
        {"Spellcasting", "Bonus Proficiency", "Disciple of Life"}, //domain feature
        {"Channel Divinity (1/rest)", "Channel Divinity: Preserve Life"}, //domain feature
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 1/2)"},
        {"Channel Divinity (2/rest)", "Blessed Healer"}, //domain feature
        {},
        {"Destroy Undead (CR 1)", "Divine Strike"}, //domain feature, ability score improvement
        {},
        {"Divine Intervention"},
        {"Destroy Undead (CR 2)"},
        {}, //ability score improvement
        {},
        {"Destroy Undead (CR 3)"},
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 4)", "Supreme Healing"}, //domain feature
        {"Channel Divinity (3/rest)"},
        {}, //ability score improvement
        {"Divine Intervention Improvement"},
    };

    private static String[][] FeaturesLight = {
        {"Spellcasting", "Bonus Cantrip", "Warding Flare"}, //domain feature
        {"Channel Divinity (1/rest)", "Channel Divinity: Radiance of the Dawn"}, //domain feature
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 1/2)"},
        {"Channel Divinity (2/rest)", "Improved Flare"}, //domain feature
        {},
        {"Destroy Undead (CR 1)", "Potent Spellcasting"}, //domain feature, ability score improvement
        {},
        {"Divine Intervention"},
        {"Destroy Undead (CR 2)"},
        {}, //ability score improvement
        {},
        {"Destroy Undead (CR 3)"},
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 4)", "Corona of Light"}, //domain feature
        {"Channel Divinity (3/rest)"},
        {}, //ability score improvement
        {"Divine Intervention Improvement"},
    };

    private static String[][] FeaturesNature = {
        {"Spellcasting", "Acolyte of Nature", "Bonus Proficiency"}, //domain feature
        {"Channel Divinity (1/rest)", "Channel Divinity: Charm Animals and Plants"}, //domain feature
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 1/2)"},
        {"Channel Divinity (2/rest)", "Dampen Elements"}, //domain feature
        {},
        {"Destroy Undead (CR 1)", "Divine Strike"}, //domain feature, ability score improvement
        {},
        {"Divine Intervention"},
        {"Destroy Undead (CR 2)"},
        {}, //ability score improvement
        {},
        {"Destroy Undead (CR 3)"},
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 4)", "Master of Nature"}, //domain feature
        {"Channel Divinity (3/rest)"},
        {}, //ability score improvement
        {"Divine Intervention Improvement"},
    };

    private static String[][] FeaturesTempest = {
        {"Spellcasting", "Bonus Proficiencies", "Wrath of the Storm"}, //domain feature
        {"Channel Divinity (1/rest)", "Channel Divinity: Destructive Wrath"}, //domain feature
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 1/2)"},
        {"Channel Divinity (2/rest)", "Thunderbolt Strike"}, //domain feature
        {},
        {"Destroy Undead (CR 1)", "Divine Strike"}, //domain feature, ability score improvement
        {},
        {"Divine Intervention"},
        {"Destroy Undead (CR 2)"},
        {}, //ability score improvement
        {},
        {"Destroy Undead (CR 3)"},
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 4)", "Stormborn"}, //domain feature
        {"Channel Divinity (3/rest)"},
        {}, //ability score improvement
        {"Divine Intervention Improvement"},
    };

    private static String[][] FeaturesTrickery = {
        {"Spellcasting", "Blessing of the Trickster"}, //domain feature
        {"Channel Divinity (1/rest)", "Channel Divinity: Invoke Duplicity"}, //domain feature
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 1/2)"},
        {"Channel Divinity (2/rest)", "Channel Divinity: Cloak of Shadows"}, //domain feature
        {},
        {"Destroy Undead (CR 1)", "Divine Strike"}, //domain feature, ability score improvement
        {},
        {"Divine Intervention"},
        {"Destroy Undead (CR 2)"},
        {}, //ability score improvement
        {},
        {"Destroy Undead (CR 3)"},
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 4)", "Improved Duplicity"}, //domain feature
        {"Channel Divinity (3/rest)"},
        {}, //ability score improvement
        {"Divine Intervention Improvement"},
    };

    private static String[][] FeaturesWar = {
        {"Spellcasting", "Bonus Proficiencies", "War Priest"}, //domain feature
        {"Channel Divinity (1/rest)", "Channel Divinity: Guided Strike"}, //domain feature
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 1/2)"},
        {"Channel Divinity (2/rest)", "Channel Divinity: War God's Blessing"}, //domain feature
        {},
        {"Destroy Undead (CR 1)", "Divine Strike"}, //domain feature, ability score improvement
        {},
        {"Divine Intervention"},
        {"Destroy Undead (CR 2)"},
        {}, //ability score improvement
        {},
        {"Destroy Undead (CR 3)"},
        {},
        {}, //ability score improvement
        {"Destroy Undead (CR 4)", "Avatar of Battle"}, //domain feature
        {"Channel Divinity (3/rest)"},
        {}, //ability score improvement
        {"Divine Intervention Improvement"},
    };

}