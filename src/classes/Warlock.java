package classes;

import java.util.List;
import java.util.Random;

public class Warlock extends Classes {

    public Warlock(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
    }

    public static String getRandomFightingStyle(int level) {
        if (level < 3) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Warlock.FightingStyle.length);
            return Warlock.FightingStyle[index];
        }
    }

    public static String getRandomSpecialization() {
        Random random = new Random();
        int index = random.nextInt(Warlock.Specialization.length);
        return Warlock.Specialization[index];
    }
    
    public static List<String> getRandomAbilities() {
        return List.of(Warlock.Abilities);
    }
    
    public static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(8) + 1;
        }
    
        return 8 + additionalHitPoints;
    }

    // Pact Boon
    private static String[] FightingStyle = {
        "Pact of the Chain",
        "Pact of the Blade",
        "Pact of the Tome"
    };

    // Otherworldly Patrons
    private static String[] Specialization = {
        "The Archfey",
        "The Fiend",
        "The Great Old One"
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}