package classes;

import java.util.List;
import java.util.Random;

public class Druid extends Classes {

    public Druid(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
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
    
    public static List<String> getRandomAbilities() {
        return List.of(Druid.Abilities);
    }
    
    public static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(8) + 1;
        }
    
        return 8 + additionalHitPoints;
    }

    // Druid Circles
    private static String[] Specialization = {
        "Circle of the Land",
        "Circle of the Moon"
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}