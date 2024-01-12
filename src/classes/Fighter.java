package classes;

import java.util.List;
import java.util.Random;

public class Fighter extends Classes {

    public Fighter(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
    }

    public static String getRandomFightingStyle() {
        Random random = new Random();
        int index = random.nextInt(Fighter.FightingStyle.length);
        return Fighter.FightingStyle[index];
    }

    public static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Fighter.Specialization.length);
            return Fighter.Specialization[index];
        }
    }
    
    public static List<String> getRandomAbilities() {
        return List.of(Fighter.Abilities);
    }
    
    public static int calculateRandomHitPoints(int level) {
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
        "Great Weapon Fighting",
        "Protection",
        "Two-Weapon Fighting"
    };

    // Martial Archetypes
    private static String[] Specialization = {
        "Champion",
        "Battle Master",
        "Eldritch Knight",
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}