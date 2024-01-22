package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Monk extends Classes {

    public Monk(String className, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Monk.Specialization.length);
            return Monk.Specialization[index];
        }
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("Way of the Open Hand".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesOpenHand, 0, level));
        } else if ("Way of Shadow".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesShadow, 0, level));
        } else if ("Way of the Four Elements".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesFourElements, 0, level));
        } else {        // monk features (no specialization)
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesOpenHand, 0, 2));
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

    public static int getMonkHitDice() {
        return 8;
    }

    // Proficiencies
    public static Proficiency getProficiency() {
        Proficiency classProficiency = new Proficiency();

        ArrayList<String> armor = new ArrayList<>();
        // None

        ArrayList<String> weapons = new ArrayList<>();
        weapons.add("Simple Weapons");
        weapons.add("Shortswords");

        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Strength");
        savingThrows.add("Dexterity");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 2) {
            Skill newSkill = classProficiency.RandomSkillMonk();
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

    // Monastic Traditions
    private static String[] Specialization = {
        "Way of the Open Hand",
        "Way of Shadow",
        "Way of the Four Elements"
    };

    private static String[][] FeaturesOpenHand = {
        {"Unarmored Defense", "Martial Arts"},
        {"Ki", "Unarmored Movement"},
        {"Deflect Missiles", "Open Hand Technique"}, //monastic feature 
        {"Slow Fall"}, //ability score improvement
        {"Extra Attack", "Stunning Strike"},
        {"Ki-Empowered Strike", "Wholeness of Body"}, //monastic feature
        {"Evasion", "Stillness of Mind"},
        {}, //ability score improvement
        {"Unarmored Movement Improvement"},
        {"Purity of Body"},
        {"Tranquility"}, //monastic feature
        {}, //ability score improvement
        {"Tongue of the Sun and Moon"},
        {"Diamond Soul"},
        {"Timeless Body"},
        {}, //ability score improvement
        {"Quivering Palm"}, //monastic feature
        {"Empty Body"},
        {}, //ability score improvement
        {"Perfect Self"},
    };

    private static String[][] FeaturesShadow = {
        {"Unarmored Defense", "Martial Arts"},
        {"Ki", "Unarmored Movement"},
        {"Deflect Missiles", "Shadow Arts"}, //monastic feature 
        {"Slow Fall"}, //ability score improvement
        {"Extra Attack", "Stunning Strike"},
        {"Ki-Empowered Strike", "Shadow Step"}, //monastic feature
        {"Evasion", "Stillness of Mind"},
        {}, //ability score improvement
        {"Unarmored Movement Improvement"},
        {"Purity of Body"},
        {"Cloak of Shadows"}, //monastic feature
        {}, //ability score improvement
        {"Tongue of the Sun and Moon"},
        {"Diamond Soul"},
        {"Timeless Body"},
        {}, //ability score improvement
        {"Opportunist"}, //monastic feature
        {"Empty Body"},
        {}, //ability score improvement
        {"Perfect Self"},
    };

    private static String[][] FeaturesFourElements = {
        {"Unarmored Defense", "Martial Arts"},
        {"Ki", "Unarmored Movement"},
        {"Deflect Missiles", "Disciple of the Elements"}, //monastic feature 
        {"Slow Fall"}, //ability score improvement
        {"Extra Attack", "Stunning Strike"},
        {"Ki-Empowered Strike", ""}, //monastic feature
        {"Evasion", "Stillness of Mind"},
        {}, //ability score improvement
        {"Unarmored Movement Improvement"},
        {"Purity of Body"},
        {""}, //monastic feature
        {}, //ability score improvement
        {"Tongue of the Sun and Moon"},
        {"Diamond Soul"},
        {"Timeless Body"},
        {}, //ability score improvement
        {""}, //monastic feature
        {"Empty Body"},
        {}, //ability score improvement
        {"Perfect Self"},
    };

}