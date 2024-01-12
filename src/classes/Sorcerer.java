package classes;

import java.util.List;
import java.util.Random;

public class Sorcerer extends Classes {

    public Sorcerer(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
    }

    public static String getRandomSpecialization() {
        Random random = new Random();
        int index = random.nextInt(Sorcerer.Specialization.length);
        return Sorcerer.Specialization[index];
    }
    
    public static List<String> getRandomAbilities() {
        return List.of(Sorcerer.Abilities);
    }
    
    public static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(6) + 1;
        }
    
        return 6 + additionalHitPoints;
    }

    // Sorcerous Origins
    private static String[] Specialization = {
        "Draconic Bloodline",
        "Wild Magic"
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}