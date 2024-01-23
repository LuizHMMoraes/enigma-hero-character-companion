package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Bard extends Classes {

    public Bard(String className, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Bard.Specialization.length);
            return Bard.Specialization[index];
        }
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("College of Lore".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesLore, 0, level));
        } else if ("College of Valor".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesValor, 0, level));
        } else {        // bard features (no specialization)
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesLore, 0, 2));
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

    public static int getBardHitDice() {
        return 8;
    }

    // Proficiencies
    public static Proficiency getProficiency() {
        Proficiency classProficiency = new Proficiency();

        ArrayList<String> armor = new ArrayList<>();
        armor.add("Light armor");

        ArrayList<String> weapons = new ArrayList<>();
        weapons.add("Simple Weapons");
        weapons.add("Hand Crossbows");
        weapons.add("Longswords");
        weapons.add("Rapiers");
        weapons.add("Shortswords");

        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Dexterity");
        savingThrows.add("Charisma");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 3) {
            Skill newSkill = classProficiency.RandomSkill();
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

    // Bard Colleges
    private static String[] Specialization = {
        "College of Lore",
        "College of Valor",
    };

    private static String[][] FeaturesLore = {
        {"Spellcasting", "Bardic Inspiration (d6)"},
        {"Jack of All Trades", "Song of Rest (d6)"},
        {"Bonus Proficiencies", "Cutting Words"}, //college feature
        {}, // ability score improvement
        {"Bardic Inspiration (d8)", "Font of Inspiration"},
        {"Countercharm", "Adicional Magical Secrets"}, //college feature
        {},
        {}, // ability score improvement
        {"Song of Rest (d8)"},
        {"Bardic Inspiration (d10)", "Expertise", "Magical Secrets"},
        {},
        {}, // ability score improvement
        {"Song of Rest (d10)"},
        {"Magical Secrets", "Peerless Skill"}, //college feature
        {"Bardic Inspiration (d12)"},
        {}, // ability score improvement
        {"Song of Rest (d12)"},
        {"Magical Secrets"},
        {}, // ability score improvement
        {"Superior Inspiration"},
    };

    private static String[][] FeaturesValor = {
        {"Spellcasting", "Bardic Inspiration (d6)"},
        {"Jack of All Trades", "Song of Rest (d6)"},
        {"Bonus Proficiencies", "Combat Inspiration"}, //college feature
        {}, // ability score improvement
        {"Bardic Inspiration (d8)", "Font of Inspiration"},
        {"Countercharm", "Extra Attack"}, //college feature
        {},
        {}, // ability score improvement
        {"Song of Rest (d8)"},
        {"Bardic Inspiration (d10)", "Expertise", "Magical Secrets"},
        {},
        {}, // ability score improvement
        {"Song of Rest (d10)"},
        {"Magical Secrets", "Battle Magic"}, //college feature
        {"Bardic Inspiration (d12)"},
        {}, // ability score improvement
        {"Song of Rest (d12)"},
        {"Magical Secrets"},
        {}, // ability score improvement
        {"Superior Inspiration"},
    };


}