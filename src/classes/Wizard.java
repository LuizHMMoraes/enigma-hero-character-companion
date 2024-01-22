package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Wizard extends Classes {

    public Wizard(String className, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomSpecialization(int level) {
        if (level < 2) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Wizard.Specialization.length);
            return Wizard.Specialization[index];
        }
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("School of Abjuration".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesAbjuration, 0, level));
        } else if ("School of Conjuration".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesConjuration, 0, level));
        } else if ("School of Divination".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesDivination, 0, level));
        } else if ("School of Enchantment".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesEnchantment, 0, level));
        } else if ("School of Evocation".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesEvocation, 0, level));
        } else if ("School of Illusion".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesIllusion, 0, level));
        } else if ("School of Necromancy".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesNecromancy, 0, level));
        } else if ("School of Transmutation".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesTransmutation, 0, level));
        } else {        // wizard features (no specialization)
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesAbjuration, 0, 1));
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

    public static int getWizardHitDice() {
        return 6;
    }

    // Proficiencies
    public static Proficiency getProficiency() {
        Proficiency classProficiency = new Proficiency();

        ArrayList<String> armor = new ArrayList<>();
        // None

        ArrayList<String> weapons = new ArrayList<>();
        weapons.add("Daggers");
        weapons.add("Darts");
        weapons.add("Slings");
        weapons.add("Quarterstaffs");
        weapons.add("Light Crossbow");

        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Intelligence");
        savingThrows.add("Wisdom");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 2) {
            Skill newSkill = classProficiency.RandomSkillWizard();
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

    // Arcane Traditions
    private static String[] Specialization = {
        "School of Abjuration",
        "School of Conjuration",
        "School of Divination",
        "School of Enchantment",
        "School of Evocation",
        "School of Illusion",
        "School of Necromancy",
        "School of Transmutation"
    };

    private static String[][] FeaturesAbjuration = {
        {"Spellcasting", "Arcane Recovery"},
        {"Abjuration Savant", "Arcane Ward"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Projected Ward"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Improved Abjuration"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Spell Resistance"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Spell Mastery"},
        {}, //ability score improvement
        {"Signature Spell"},
    };

    private static String[][] FeaturesConjuration = {
        {"Spellcasting", "Arcane Recovery"},
        {"Conjuration Savant", "Minor Conjuration"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Benign Transposition"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Focused Conjuration"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Durable Summons"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Spell Mastery"},
        {}, //ability score improvement
        {"Signature Spell"},
    };

    private static String[][] FeaturesDivination = {
        {"Spellcasting", "Arcane Recovery"},
        {"Divination Savant", "Portent"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Expert Divination"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"The Third Eye"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Greater Portent"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Spell Mastery"},
        {}, //ability score improvement
        {"Signature Spell"},
    };

    private static String[][] FeaturesEnchantment = {
        {"Spellcasting", "Arcane Recovery"},
        {"Enchantment Savant", "Hypnotic Gaze"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Instinctive Charm"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Split Enchantment"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Alter Memories"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Spell Mastery"},
        {}, //ability score improvement
        {"Signature Spell"},
    };

    private static String[][] FeaturesEvocation = {
        {"Spellcasting", "Arcane Recovery"},
        {"Evocation Savant", "Esculpt Spells"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Potent Cantrip"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Empowered Evocation"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Overchannel"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Spell Mastery"},
        {}, //ability score improvement
        {"Signature Spell"},
    };

    private static String[][] FeaturesIllusion = {
        {"Spellcasting", "Arcane Recovery"},
        {"Illusion Savant", "Improved Minor Illusion"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Malleable Illusions"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Illusory Self"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Illusory Reality"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Spell Mastery"},
        {}, //ability score improvement
        {"Signature Spell"},
    };

    private static String[][] FeaturesNecromancy = {
        {"Spellcasting", "Arcane Recovery"},
        {"Necromancy Savant", "Grim Harvest"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Undead Thralls"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Injured to Undeath"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Command Undead"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Spell Mastery"},
        {}, //ability score improvement
        {"Signature Spell"},
    };

    private static String[][] FeaturesTransmutation = {
        {"Spellcasting", "Arcane Recovery"},
        {"Transmutation Savant", "Minor Alchemy"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Transmuter's Stone"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Shapechanger"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Master Transmuter"}, //tradition feature
        {},
        {}, //ability score improvement
        {},
        {"Spell Mastery"},
        {}, //ability score improvement
        {"Signature Spell"},
    };

}