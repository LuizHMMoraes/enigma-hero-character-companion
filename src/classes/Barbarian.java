package classes;

import java.util.List;
import java.util.Random;

public class Barbarian extends Classes {

    public Barbarian(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
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
    
    public static List<String> getRandomAbilities() {
        return List.of(Barbarian.Abilities);
    }
    
    public static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(12) + 1;
        }
    
        return 10 + additionalHitPoints;
    }

    // Primal Paths
    private static String[] Specialization = {
            "Path of the Berserker",
            "Path of the Totem Warrior",
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}