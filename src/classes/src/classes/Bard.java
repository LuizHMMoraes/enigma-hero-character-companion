package classes;

import java.util.List;
import java.util.Random;

public class Bard extends Classes {

    public Bard(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
    }

    static String getRandomSpecialization(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Bard.Specialization.length);
            return Bard.Specialization[index];
        }
    }
    
    static List<String> getRandomAbilities() {
        return List.of(Bard.Abilities);
    }
    
    static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(8) + 1;
        }
    
        return 8 + additionalHitPoints;
    }

    // Bard Colleges
    private static String[] Specialization = {
        "College of Lore",
        "College of Valor",
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}