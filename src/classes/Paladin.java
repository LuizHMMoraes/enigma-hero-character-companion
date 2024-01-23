package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Paladin extends Classes {

    public Paladin(String className, String fightingStyle, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomFightingStyle(int level) {
        if (level < 2) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Paladin.FightingStyle.length);
            return Paladin.FightingStyle[index];
        }
    }

    public static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Paladin.Specialization.length);
            return Paladin.Specialization[index];
        }
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("Oath of Devotion".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesDevotion, 0, level));
        } else if ("Oath of the Ancients".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesAncients, 0, level));
        } else if ("Oath of Vengeance".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesVengeance, 0, level));
        } else {        // paladin features (no specialization)
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesDevotion, 0, 2));
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

    public static int getPaladinHitDice() {
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
        savingThrows.add("Wisdom");
        savingThrows.add("Charisma");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 2) {
            Skill newSkill = classProficiency.RandomSkillPaladin();
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
        "Defense",
        "Dueling",
        "Great Weapon Fighting",
        "Protection"
    };

    // Sacred Oaths
    private static String[] Specialization = {
        "Oath of Devotion",
        "Oath of the Ancients",
        "Oath of Vengeance"
    };

    private static String[][] FeaturesDevotion = {
        {"Divine Sense", "Lay on Hands"},
        {"Fighting Style", "Spellcasting", "Divine Smite"},
        {"Divine Health", "Channel Divinity"}, //oath feature 
        {}, //ability score improvement
        {"Extra Attack"},
        {"Aura of Protection"},
        {"Aura of Devotion"}, //oath feature
        {}, //ability score improvement
        {},
        {"Aura of Courage"},
        {"Improved Divine Simte"},
        {}, //ability score improvement
        {},
        {"Cleansing Touch"},
        {"Purity of Spirit"}, //oath feature
        {}, //ability score improvement
        {},
        {"Aura Improvements"},
        {}, //ability score improvement
        {"Holy Nimbus"}, //oath feature
    };

    private static String[][] FeaturesAncients = {
        {"Divine Sense", "Lay on Hands"},
        {"Fighting Style", "Spellcasting", "Divine Smite"},
        {"Divine Health", "Channel Divinity"}, //oath feature 
        {}, //ability score improvement
        {"Extra Attack"},
        {"Aura of Protection"},
        {"Aura of Warding"}, //oath feature
        {}, //ability score improvement
        {},
        {"Aura of Courage"},
        {"Improved Divine Simte"},
        {}, //ability score improvement
        {},
        {"Cleansing Touch"},
        {"Undying Sentinel"}, //oath feature
        {}, //ability score improvement
        {},
        {"Aura Improvements"},
        {}, //ability score improvement
        {"Elder Champion"}, //oath feature
    };

    private static String[][] FeaturesVengeance = {
        {"Divine Sense", "Lay on Hands"},
        {"Fighting Style", "Spellcasting", "Divine Smite"},
        {"Divine Health", "Channel Divinity"}, //oath feature 
        {}, //ability score improvement
        {"Extra Attack"},
        {"Aura of Protection"},
        {"Relentless Avenger"}, //oath feature
        {}, //ability score improvement
        {},
        {"Aura of Courage"},
        {"Improved Divine Simte"},
        {}, //ability score improvement
        {},
        {"Cleansing Touch"},
        {"Soul of Vengeance"}, //oath feature
        {}, //ability score improvement
        {},
        {"Aura Improvements"},
        {}, //ability score improvement
        {"Avenging Angel"}, //oath feature
    };

}
