package classes;

import java.util.List;
import java.util.Random;

public class Rogue extends Classes {

    public Rogue(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
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
    
    public static List<String> getRandomAbilities() {
        return List.of(Rogue.Abilities);
    }
    
    public static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(8) + 1;
        }
    
        return 8 + additionalHitPoints;
    }

    // Roguish Archetypes
    private static String[] Specialization = {
        "Thief",
        "Assassin",
        "Arcane Trickster"
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}
