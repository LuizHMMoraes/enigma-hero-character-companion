package classes;

import java.util.List;
import java.util.Random;

public abstract class Classes {
    public String className;
    public String fightingStyle;
    public String specialization;
    public int hitPoints;
    public List<String> abilities;

    public Classes(String className, String fightingStyle, String specialization, int hitPoints, List<String> abilities) {
        this.className = className;
        this.fightingStyle = fightingStyle;
        this.specialization = specialization;
        this.hitPoints = hitPoints;
        this.abilities = abilities;
    }

    public static String RandomClass() {
        String[] classes = {
                "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"
        };

        Random random = new Random();
        int index = random.nextInt(classes.length);

        return classes[index];
    }

    public static Classes createRandomClass(int level) {
        String randomClassName = RandomClass();

        switch (randomClassName) {
            case "Barbarian":
                String barbarianFightingStyle = "";
                String barbarianSpecialization = Barbarian.getRandomSpecialization(level);
                List<String> barbarianAbilities = Barbarian.getRandomAbilities();
                int barbarianHitPoints = Barbarian.calculateRandomHitPoints(level);
                return new Barbarian(randomClassName, barbarianFightingStyle, barbarianSpecialization, barbarianHitPoints, barbarianAbilities);

            case "Bard":
                String bardFightingStyle = "";
                String bardSpecialization = Bard.getRandomSpecialization(level);
                List<String> bardAbilities = Bard.getRandomAbilities();
                int bardHitPoints = Bard.calculateRandomHitPoints(level);
                return new Bard(randomClassName, bardFightingStyle, bardSpecialization, bardHitPoints, bardAbilities);

            case "Cleric":
                String clericFightingStyle = "";
                String clericSpecialization = Cleric.getRandomSpecialization();
                List<String> clericAbilities = Cleric.getRandomAbilities();
                int clericHitPoints = Cleric.calculateRandomHitPoints(level);
                return new Cleric(randomClassName, clericFightingStyle, clericSpecialization, clericHitPoints, clericAbilities);

            case "Druid":
                String druidFightingStyle = "";
                String druidSpecialization = Druid.getRandomSpecialization(level);
                List<String> druidAbilities = Druid.getRandomAbilities();
                int druidHitPoints = Druid.calculateRandomHitPoints(level);
                return new Druid(randomClassName, druidFightingStyle, druidSpecialization, druidHitPoints, druidAbilities);

            case "Fighter":
                String fighterFightingStyle = Fighter.getRandomFightingStyle();
                String fighterSpecialization = Fighter.getRandomSpecialization(level);
                List<String> fighterAbilities = Fighter.getRandomAbilities();
                int fighterHitPoints = Fighter.calculateRandomHitPoints(level);
                return new Fighter(randomClassName, fighterFightingStyle, fighterSpecialization, fighterHitPoints, fighterAbilities);
            
            case "Monk":
                String monkFightingStyle = "";
                String monkSpecialization = Monk.getRandomSpecialization(level);
                List<String> monkAbilities = Monk.getRandomAbilities();
                int monkHitPoints = Monk.calculateRandomHitPoints(level);
                return new Monk(randomClassName, monkFightingStyle, monkSpecialization, monkHitPoints, monkAbilities);

            case "Paladin":
                String paladinFightingStyle = Paladin.getRandomFightingStyle(level);
                String paladinSpecialization = Paladin.getRandomSpecialization(level);
                List<String> paladinAbilities = Paladin.getRandomAbilities();
                int paladinHitPoints = Paladin.calculateRandomHitPoints(level);
                return new Paladin(randomClassName, paladinFightingStyle, paladinSpecialization, paladinHitPoints, paladinAbilities);

            case "Ranger":
                String rangerFightingStyle = Ranger.getRandomFightingStyle(level);
                String rangerSpecialization = Ranger.getRandomSpecialization(level);
                List<String> rangerAbilities = Ranger.getRandomAbilities();
                int rangerHitPoints = Ranger.calculateRandomHitPoints(level);
                return new Ranger(randomClassName, rangerFightingStyle, rangerSpecialization, rangerHitPoints, rangerAbilities);

            case "Rogue":
                String rogueFightingStyle = "";
                String rogueSpecialization = Rogue.getRandomSpecialization(level);
                List<String> rogueAbilities = Rogue.getRandomAbilities();
                int rogueHitPoints = Rogue.calculateRandomHitPoints(level);
                return new Rogue(randomClassName, rogueFightingStyle, rogueSpecialization, rogueHitPoints, rogueAbilities);

            case "Sorcerer":
                String sorcererFightingStyle = "";
                String sorcererSpecialization = Sorcerer.getRandomSpecialization();
                List<String> sorcererAbilities = Sorcerer.getRandomAbilities();
                int sorcererHitPoints = Sorcerer.calculateRandomHitPoints(level);
                return new Sorcerer(randomClassName, sorcererFightingStyle, sorcererSpecialization, sorcererHitPoints, sorcererAbilities);

            case "Warlock":
                String warlockFightingStyle = Warlock.getRandomFightingStyle(level);
                String warlockSpecialization = Warlock.getRandomSpecialization();
                List<String> warlockAbilities = Warlock.getRandomAbilities();
                int warlockHitPoints = Warlock.calculateRandomHitPoints(level);
                return new Warlock(randomClassName, warlockFightingStyle, warlockSpecialization, warlockHitPoints, warlockAbilities);

            case "Wizard":
                String wizardFightingStyle = "";
                String wizardSpecialization = Wizard.getRandomSpecialization(level);
                List<String> wizardAbilities = Wizard.getRandomAbilities();
                int wizardHitPoints = Wizard.calculateRandomHitPoints(level);
                return new Wizard(randomClassName, wizardFightingStyle, wizardSpecialization, wizardHitPoints, wizardAbilities);

            default:
                throw new IllegalArgumentException("Unknown class: " + randomClassName);
        }
    }

}