package classes;

import java.util.List;
import java.util.Random;

public class Monk extends Classes {

    public Monk(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
    }

    static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Monk.Specialization.length);
            return Monk.Specialization[index];
        }
    }
    
    static List<String> getRandomAbilities() {
        return List.of(Monk.Abilities);
    }
    
    static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(8) + 1;
        }
    
        return 8 + additionalHitPoints;
    }

    // Monastic Traditions
    private static String[] Specialization = {
        "Way of the Open Hand",
        "Way of Shadow",
        "Way of the Four Elements"
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}