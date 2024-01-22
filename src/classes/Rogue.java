package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Rogue extends Classes {

    public Rogue(String className, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Rogue.Specialization.length);
            return Rogue.Specialization[index];
        }
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("Thief".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesThief, 0, level));
        } else if ("Assassin".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesAssassin, 0, level));
        } else if ("Arcane Trickster".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesArcaneTrickster, 0, level));
        } else {        // rogue features (no specialization)
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesThief, 0, 2));
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

    public static int getRogueHitDice() {
        return 8;
    }

    // Proficiencies
    public static Proficiency getProficiency() {
        Proficiency classProficiency = new Proficiency();

        ArrayList<String> armor = new ArrayList<>();
        armor.add("Light Wrmor");

        ArrayList<String> weapons = new ArrayList<>();
        weapons.add("Simple Weapons");
        weapons.add("Hand Crossbows");
        weapons.add("Longswords");
        weapons.add("Rapiers");
        weapons.add("Shortswords");

        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Dexterity");
        savingThrows.add("Intelligence");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 4) {
            Skill newSkill = classProficiency.RandomSkillRogue();
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

    // Roguish Archetypes
    private static String[] Specialization = {
        "Thief",
        "Assassin",
        "Arcane Trickster"
    };

    private static String[][] FeaturesThief = {
        {"Expertise", "Sneak Attack", "Thieves's Cant"},
        {"Cunning Action"},
        {"Fast Hands", "Second-Story Work"}, //archetype feature
        {}, //ability score improvement
        {"Uncanny Dodge"},
        {"Expertise"},
        {"Evasion"},
        {}, //ability score improvement
        {"Supreme Sneak"}, //archetype feature
        {}, //ability score improvement
        {"Reliable Talent"},
        {}, //ability score improvement
        {"Use Magic Device"}, //archetype feature
        {"Blindsense"},
        {"Slippery Mind"},
        {}, //ability score improvement
        {"Thief's Reflexes"}, //archetype feature
        {"Elusive"},
        {}, //ability score improvement
        {"Stroke of Luck"},
    };

    private static String[][] FeaturesAssassin = {
        {"Expertise", "Sneak Attack", "Thieves's Cant"},
        {"Cunning Action"},
        {"Bonus Proficiencies", "Assassinate"}, //archetype feature
        {}, //ability score improvement
        {"Uncanny Dodge"},
        {"Expertise"},
        {"Evasion"},
        {}, //ability score improvement
        {"Infiltration Expertise"}, //archetype feature
        {}, //ability score improvement
        {"Reliable Talent"},
        {}, //ability score improvement
        {"Impostor"}, //archetype feature
        {"Blindsense"},
        {"Slippery Mind"},
        {}, //ability score improvement
        {"Death Strike"}, //archetype feature
        {"Elusive"},
        {}, //ability score improvement
        {"Stroke of Luck"},
    };

    private static String[][] FeaturesArcaneTrickster = {
        {"Expertise", "Sneak Attack", "Thieves's Cant"},
        {"Cunning Action"},
        {"Spellcasting", "Mage Hand Legerdemain"}, //archetype feature
        {}, //ability score improvement
        {"Uncanny Dodge"},
        {"Expertise"},
        {"Evasion"},
        {}, //ability score improvement
        {"Magical Ambush"}, //archetype feature
        {}, //ability score improvement
        {"Reliable Talent"},
        {}, //ability score improvement
        {"Versatile Trickster"}, //archetype feature
        {"Blindsense"},
        {"Slippery Mind"},
        {}, //ability score improvement
        {"Spell Thief"}, //archetype feature
        {"Elusive"},
        {}, //ability score improvement
        {"Stroke of Luck"},
    };

}
