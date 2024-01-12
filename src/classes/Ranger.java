package classes;

import java.util.List;
import java.util.Random;

public class Ranger extends Classes {

    public Ranger(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
    }

    public static String getRandomFightingStyle(int level) {
        if (level < 2) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Ranger.FightingStyle.length);
            return Ranger.FightingStyle[index];
        }
    }

    public static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Ranger.Specialization.length);
            return Ranger.Specialization[index];
        }
    }
    
    public static List<String> getRandomAbilities() {
        return List.of(Ranger.Abilities);
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
        "Archery",
        "Defense",
        "Dueling",
        "Two-Weapon Fighting"
    };

    // Ranger Archetypes
    private static String[] Specialization = {
        "Hunter",
        "Beastmaster"
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}