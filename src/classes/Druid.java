package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import proficiency.Proficiency;
import proficiency.Skill;

public class Druid extends Classes {

    public Druid(String className, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        super(className, specialization, features, classProficiency, hitDice);
    }

    public static String getRandomSpecialization(int level) {
        if (level < 2) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Druid.Specialization.length);
            return Druid.Specialization[index];
        }
    }
    
    public static List<String> getRandomFeatures(int level, String specialization) {
        List<String[]> featureList = null;

        if ("Circle of the Land".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesLand, 0, level));
        } else if ("Circle of the Moon".equals(specialization)) {
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesMoon, 0, level));
        } else {        // druid features (no specialization)
            featureList = Arrays.asList(Arrays.copyOfRange(FeaturesLand, 0, 1));
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

    public static int getDruidHitDice() {
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
        weapons.add("Clubs");
        weapons.add("Daggers");
        weapons.add("Darts");
        weapons.add("Javelins");
        weapons.add("Maces");
        weapons.add("Quarterstaffs");
        weapons.add("Scimitars");
        weapons.add("Sickles");
        weapons.add("Slings");
        weapons.add("Spears");

        ArrayList<String> savingThrows = new ArrayList<>();
        savingThrows.add("Intelligence");
        savingThrows.add("Wisdom");

        ArrayList<Skill> skills = new ArrayList<>();
        while (skills.size() < 2) {
            Skill newSkill = classProficiency.RandomSkillDruid();
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

    // Druid Circles
    private static String[] Specialization = {
        "Circle of the Land",
        "Circle of the Moon"
    };

    private static String[][] FeaturesLand = {
        {"Druidic", "Spellcasting"},
        {"Wild Shape", "Bonus Cantrip", "Natural Recovery"}, //circle feature
        {"Circle Spells"},
        {"Wild Shape Improvement"}, //ability score improvement
        {"Circle Spells"},
        {"Land s Stride"}, //circle feature
        {"Circle Spells"},
        {"Wild Shape Improvement"}, //ability score improvement
        {"Circle Spells"},
        {"Nature s Ward"}, //circle feature
        {},
        {}, //ability score improvement
        {},
        {"Nature s Sanctuary"}, //circle feature
        {},
        {}, //ability score improvement
        {},
        {"Timeless Body", "Beast Spells"},
        {}, //ability score improvement
        {"Archdruid"},
    };

    private static String[][] FeaturesMoon = {
        {"Druidic", "Spellcasting"},
        {"Wild Shape", "Combat Wild Shape", "Circle Forms"}, //circle feature
        {},
        {"Wild Shape Improvement"}, //ability score improvement
        {},
        {"Circle Forms", "Primal Strike"}, //circle feature
        {},
        {"Wild Shape Improvement"}, //ability score improvement
        {},
        {"Elemental Wild Shape"}, //circle feature
        {},
        {}, //ability score improvement
        {},
        {"Thousand Forms"}, //circle feature
        {},
        {}, //ability score improvement
        {},
        {"Timeless Body", "Beast Spells"},
        {}, //ability score improvement
        {"Archdruid"},
    };

}