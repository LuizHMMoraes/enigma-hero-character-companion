package classes;

import java.util.List;
import java.util.Random;

public class Wizard extends Classes {

    public Wizard(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        super(className, fightingStyle, specialization, hitPoints, abilities);
    }

    static String getRandomSpecialization(int level) {
        if (level < 2) {
            return "";
        }
        else {
            Random random = new Random();
            int index = random.nextInt(Wizard.Specialization.length);
            return Wizard.Specialization[index];
        }
    }
    
    static List<String> getRandomAbilities() {
        return List.of(Wizard.Abilities);
    }
    
    static int calculateRandomHitPoints(int level) {
        Random random = new Random();
        int additionalHitPoints = 0;
    
        for (int i = 2; i <= level; i++) {
            additionalHitPoints += random.nextInt(6) + 1;
        }
    
        return 6 + additionalHitPoints;
    }

    // Arcane Traditions
    private static String[] Specialization = {
        "School of Abjuration",
        "School of Conjuration",
        "School of Divination",
        "School of Enchantment",
        "School of Evocation",
        "School of Illusion",
        "School of Necromancy",
        "School of Transmutation"
    };

    private static String[] Abilities = {
        "ability1",
        "ability2",
        "ability3"
    };

}