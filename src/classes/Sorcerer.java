package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Sorcerer extends Classes {

    public Sorcerer(String className, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomSpecialization() {
        Random random = new Random();
        int index = random.nextInt(Sorcerer.Specialization.length);
        return Sorcerer.Specialization[index];
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("Draconic Bloodline".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesDraconicBloodline, 0, level));
        } else if ("Wild Magic".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesWildMagic, 0, level));
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

    public static int getSorcererHitDice() {
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
        savingThrows.add("Constitution");
        savingThrows.add("Charisma");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 2) {
            Skill newSkill = classProficiency.RandomSkillSorcerer();
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

    // Sorcerous Origins
    private static String[] Specialization = {
        "Draconic Bloodline",
        "Wild Magic"
    };

    private static String[][] FeaturesDraconicBloodline = {
        {"Spellcasting", "Dragon Ancestor", "Draconic Resilience"}, //origin feature
        {"Font of Magic"},
        {"Metamagic (+2 spells)"},
        {}, //ability score improvement
        {},
        {"Elemental Affinity"}, //origin feature
        {},
        {}, //ability score improvement
        {},
        {"Metamagic (+1 spells)"},
        {},
        {}, //ability score improvement
        {},
        {"Dragon Wings"}, //origin feature
        {},
        {}, //ability score improvement
        {"Metamagic (+1 spells)"},
        {"Draconic Presence"}, //origin feature
        {}, //ability score improvement
        {"Sorcerous Restoration"}, 
    };

    private static String[][] FeaturesWildMagic = {
        {"Spellcasting", "Wild Magic Surge", "Tides of Chaos"}, //origin feature
        {"Font of Magic"},
        {"Metamagic"},
        {}, //ability score improvement
        {},
        {"Bend Luck"}, //origin feature
        {},
        {}, //ability score improvement
        {},
        {"Metamagic"},
        {},
        {}, //ability score improvement
        {},
        {"Controlled Chaos"}, //origin feature
        {},
        {}, //ability score improvement
        {"Metamagic"},
        {"Spell Bombardment"}, //origin feature
        {}, //ability score improvement
        {"Sorcerous Restoration"}, 
    };

}