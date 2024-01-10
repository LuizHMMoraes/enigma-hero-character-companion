package classes;

import java.util.List;
import java.util.Random;

public class Paladin extends Classes {

    public Paladin(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
    }

    static String getRandomFightingStyle(int level) {
        if (level < 2) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Paladin.FightingStyle.length);
            return Paladin.FightingStyle[index];
        }
    }

    static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Paladin.Specialization.length);
            return Paladin.Specialization[index];
        }
    }
    
    static List<String> getRandomAbilities() {
        return List.of(Paladin.Abilities);
    }
    
    static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(10) + 1;
        }
    
        return 10 + additionalHitPoints;
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

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}
