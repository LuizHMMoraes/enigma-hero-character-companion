package classes;

import java.util.List;
import java.util.Random;

public class Cleric extends Classes {

    public Cleric(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
    }

    public static String getRandomSpecialization() {
        Random random = new Random();
        int index = random.nextInt(Cleric.Specialization.length);
        return Cleric.Specialization[index];
    }
    
    public static List<String> getRandomAbilities() {
        return List.of(Cleric.Abilities);
    }
    
    public static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(8) + 1;
        }
    
        return 8 + additionalHitPoints;
    }

    // Divine Domains
    private static String[] Specialization = {
        "Knowledge Domain",
        "Life Domain",
        "Light Domain",
        "Nature Domain",
        "Tempest Domain",
        "Trickery Domain",
        "War Domain"
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}