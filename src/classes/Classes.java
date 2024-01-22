package classes;

import java.util.List;
import java.util.Random;

import proficiency.Proficiency;

public abstract class Classes {
    private String className;
    private String specialization;
    private List<String> features;
    private Proficiency classProficiency;
    private int hitDice;

    public Classes(String className, String specialization, List<String> features, Proficiency classProficiency, int hitDice) {
        this.setClassName(className);
        this.setSpecialization(specialization);
        this.setFeatures(features);
        this.setClassProficiency(classProficiency);
        this.setHitDice(hitDice);
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
                String barbarianSpecialization = Barbarian.getRandomSpecialization(level);
                List<String> barbarianFeatures = Barbarian.getRandomFeatures(level, barbarianSpecialization);
                Proficiency barbarianProficiency = Barbarian.getProficiency();
                int barbarianHitDice = Barbarian.getBarbarianHitDice();
                return new Barbarian(randomClassName, barbarianSpecialization, barbarianFeatures, barbarianProficiency, barbarianHitDice);

            case "Bard":
                String bardSpecialization = Bard.getRandomSpecialization(level);
                List<String> bardFeatures = Bard.getRandomFeatures(level, bardSpecialization);
                Proficiency bardProficiency = Bard.getProficiency();
                int bardHitDice = Bard.getBardHitDice();
                return new Bard(randomClassName, bardSpecialization, bardFeatures, bardProficiency, bardHitDice);

            case "Cleric":
                String clericSpecialization = Cleric.getRandomSpecialization();
                List<String> clericFeatures = Cleric.getRandomFeatures(level, clericSpecialization);
                Proficiency clericProficiency = Cleric.getProficiency();
                int clericHitDice = Cleric.getClericHitDice();
                return new Cleric(randomClassName, clericSpecialization, clericFeatures, clericProficiency, clericHitDice);

            case "Druid":
                String druidSpecialization = Druid.getRandomSpecialization(level);
                List<String> druidFeatures = Druid.getRandomFeatures(level, druidSpecialization);
                Proficiency druidProficiency = Druid.getProficiency();
                int druidHitDice = Druid.getDruidHitDice();
                return new Druid(randomClassName, druidSpecialization, druidFeatures, druidProficiency, druidHitDice);

            case "Fighter":
                String fighterFightingStyle = Fighter.getRandomFightingStyle();
                String fighterSpecialization = Fighter.getRandomSpecialization(level);
                List<String> fighterFeatures = Fighter.getRandomFeatures(level, fighterSpecialization);
                Proficiency fighterProficiency = Fighter.getProficiency();
                int fighterHitDice = Fighter.getFighterHitDice();
                return new Fighter(randomClassName, fighterFightingStyle, fighterSpecialization, fighterFeatures, fighterProficiency, fighterHitDice);
            
            case "Monk":
                String monkSpecialization = Monk.getRandomSpecialization(level);
                List<String> monkFeatures = Monk.getRandomFeatures(level, monkSpecialization);
                Proficiency monkProficiency = Monk.getProficiency();
                int monkHitDice = Monk.getMonkHitDice();
                return new Monk(randomClassName, monkSpecialization, monkFeatures, monkProficiency, monkHitDice);

            case "Paladin":
                String paladinFightingStyle = Paladin.getRandomFightingStyle(level);
                String paladinSpecialization = Paladin.getRandomSpecialization(level);
                List<String> paladinFeatures = Paladin.getRandomFeatures(level, paladinSpecialization);
                Proficiency paladinProficiency = Paladin.getProficiency();
                int paladinHitDice = Paladin.getPaladinHitDice();
                return new Paladin(randomClassName, paladinFightingStyle, paladinSpecialization, paladinFeatures, paladinProficiency, paladinHitDice);

            case "Ranger":
                String rangerFightingStyle = Ranger.getRandomFightingStyle(level);
                String rangerSpecialization = Ranger.getRandomSpecialization(level);
                List<String> rangerFeatures = Ranger.getRandomFeatures(level, rangerSpecialization);
                Proficiency rangerProficiency = Ranger.getProficiency();
                int rangerHitDice = Ranger.getRangerHitDice();
                return new Ranger(randomClassName, rangerFightingStyle, rangerSpecialization, rangerFeatures, rangerProficiency, rangerHitDice);

            case "Rogue":
                String rogueSpecialization = Rogue.getRandomSpecialization(level);
                List<String> rogueFeatures = Rogue.getRandomFeatures(level, rogueSpecialization);
                Proficiency rogueProficiency = Rogue.getProficiency();
                int rogueHitDice = Rogue.getRogueHitDice();
                return new Rogue(randomClassName, rogueSpecialization, rogueFeatures, rogueProficiency, rogueHitDice);

            case "Sorcerer":
                String sorcererSpecialization = Sorcerer.getRandomSpecialization();
                List<String> sorcererFeatures = Sorcerer.getRandomFeatures(level, sorcererSpecialization);
                Proficiency sorcererProficiency = Sorcerer.getProficiency();
                int sorcererHitDice = Sorcerer.getSorcererHitDice();
                return new Sorcerer(randomClassName, sorcererSpecialization, sorcererFeatures, sorcererProficiency, sorcererHitDice);

            case "Warlock":
                String warlockFightingStyle = Warlock.getRandomFightingStyle(level);
                String warlockSpecialization = Warlock.getRandomSpecialization();
                List<String> warlockFeatures = Warlock.getRandomFeatures(level, warlockSpecialization);
                Proficiency warlockProficiency = Warlock.getProficiency();
                int warlockHitDice = Warlock.getWarlockHitDice();
                return new Warlock(randomClassName, warlockFightingStyle, warlockSpecialization, warlockFeatures, warlockProficiency, warlockHitDice);

            case "Wizard":
                String wizardSpecialization = Wizard.getRandomSpecialization(level);
                List<String> wizardFeatures = Wizard.getRandomFeatures(level, wizardSpecialization);
                Proficiency wizardProficiency = Wizard.getProficiency();
                int wizardHitDice = Wizard.getWizardHitDice();
                return new Wizard(randomClassName, wizardSpecialization, wizardFeatures, wizardProficiency, wizardHitDice);

            default:
                throw new IllegalArgumentException("Unknown class: " + randomClassName);
        }
    }

    public String getClassName() {
		return className;
	}

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSpecialization() {
		return specialization;
	}

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<String> getFeatures() {
		return features;
	}

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Proficiency getClassProficiency() {
		return classProficiency;
	}

    public void setClassProficiency(Proficiency classProficiency) {
        this.classProficiency = classProficiency;
    }
    
    public int getHitDice() {
		return hitDice;
	}

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

}