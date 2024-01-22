package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Barbarian extends Classes {

    public Barbarian(String className, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Barbarian.Specialization.length);
            return Barbarian.Specialization[index];
        }
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("Path of the Berserker".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesBerserker, 0, level));
        } else if ("Path of the Totem Warrior".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesTotemWarrior, 0, level));
        } else {        // barbarian features (no specialization)
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesBerserker, 0, 2));
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

    public static int getBarbarianHitDice() {
        return 12;
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
        savingThrows.add("Constitution");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 2) {
            Skill newSkill = classProficiency.RandomSkillBarbarian();
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

    // Primal Paths
    private static String[] Specialization = {
            "Path of the Berserker",
            "Path of the Totem Warrior",
    };

    private static String[][] FeaturesBerserker = {
        {"Rage", "Unarmored Defense"},
        {"Reckless Attack", "Danger Sense"},
        {"Frenzy"}, //path feature
        {}, //ability score improvement
        {"Extra Attack", "Fast Movement"},
        {"Mindless Rage"}, //path feature
        {"Feral Instinct"},
        {}, //ability score improvement
        {"Brutal Critical (1 die)"},
        {"Intimidating Presence"}, //path feature
        {"Relentless Rage"},
        {}, //ability score improvement
        {"Brutal Critical (2 die)"},
        {"Retaliation"}, //path feature
        {"Persistent Rage"},
        {}, //ability score improvement
        {"Brutal Critical (3 die)"},
        {"Indomitable Might"},
        {}, //ability score improvement
        {"Primal Champion"},
    };

    private static String[][] FeaturesTotemWarrior = {
        {"Rage", "Unarmored Defense"},
        {"Reckless Attack", "Danger Sense"},
        {"Spirit Seeker", "Totem Spirit"}, //path feature
        {}, //score
        {"Extra Attack", "Fast Movement"},
        {"Aspect of the Beast"}, //path feature
        {"Feral Instinct"},
        {}, //score
        {"Brutal Critical (1 die)"},
        {"Spirit Walker"}, //path feature
        {"Relentless Rage"},
        {}, //score
        {"Brutal Critical (2 die)"},
        {"Totemic Attunement"}, //path feature
        {"Persistent Rage"},
        {}, //score
        {"Brutal Critical (3 die)"},
        {"Indomitable Might"},
        {}, //score
        {"Primal Champion"},
    };

}