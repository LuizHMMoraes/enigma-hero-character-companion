package character;

import java.util.ArrayList; 
import java.util.Comparator;

import background.Background;
import proficiency.Proficiency;
import proficiency.RepositorySkill;
import race.Race;

public class PlayerCharacter {

	private String characterName;
	private int hitPoints;
	private int proficienyBonus;
	private int experience;
	private int level;
	private String alignment;
	// private int acBonus;
	// private int attackBonus;

	@SuppressWarnings("unused")
	private AbilityScores abilityScores;

	private Race race;

	private Background background;

	private Proficiency proficiency;

	//

	public PlayerCharacter() {

	}

	public PlayerCharacter(String characterName) {
		this.setCharacterName(characterName);

		this.setAbilityScores(new AbilityScores());
		
		this.setLevel(Random(20));

		this.setRace(new Race().RandomRace());
		this.getRace().ApplyRaceModifiers(this.getRace().getName());

		this.RandomAlignment(this.getRace().getSuggestedAlignment());

		this.setBackground(new Background().RandomBackground());
		this.getBackground().ApplyBackground(this.getBackground().getName());
		// instância de classe
		
		this.ApplyExperiencePoints(this.getLevel());
		this.ApplyProficiencyBonus(this.getLevel());

		this.setProficiency(this.VerifyDuplicates());
	}

	public int Random(double number) {
		return (int) (Math.random() * number);
	}

	public void RandomAlignment(String suggestedAlignment) {
		int good, evil, order, caos;
		good = 2;
		evil = 2;
		order = 2;
		caos = 2;
		if (suggestedAlignment.contains("good")) {
			good++;
			evil--;
		} else if (suggestedAlignment.contains("evil")) {
			good--;
			evil++;
		} else if (suggestedAlignment.contains("order")) {
			order++;
			caos--;
		} else if (suggestedAlignment.contains("caotic")) {
			order--;
			caos++;
		}
		ArrayList<String> alignmentGE = new ArrayList<>();
		ArrayList<String> alignmentOC = new ArrayList<>();
		for (int i = 0; i <= 3; i++) {
			alignmentGE.add("Neutral");
			alignmentOC.add("Neutral");
		}
		for (int i = 0; i <= good; i++) {
			alignmentGE.add("Good");
		}
		for (int i = 0; i <= evil; i++) {
			alignmentGE.add("Evil");
		}
		for (int i = 0; i <= order; i++) {
			alignmentOC.add("Lawful");
		}
		for (int i = 0; i <= caos; i++) {
			alignmentOC.add("Chaotic");
		}
		String goodEvil = alignmentGE.get(Random(alignmentGE.size()));
		String orderCaos = alignmentOC.get(Random(alignmentOC.size()));
		this.setAlignment(orderCaos + " - " + goodEvil);
	}

	/*
	 * public int CalculateHitPoints(int level) { int hitPoints =
	 * this.getClass().getHitDice() + AbilityScore.modCon; int rollHitPointsDice =
	 * Random(this.getClass().getHitDice()); for(int i = 2; i <= level; i++) {
	 * 
	 * if (rollHitPointsDice < (this.getClass().getHitDice()/2) + 1){ rollHitPoints
	 * = this.getClass().getHitDice()/2) + 1; }
	 * 
	 * hitPoints += rollHitPointsDice + AbilityScore.modCon; } return hitPoints; }
	 */

	public Proficiency VerifyDuplicates() {
		Proficiency verifyDuplicates = new Proficiency();
		verifyDuplicates.setSkill(new ArrayList<>()); // aqui setSkill(backgroundSkill)

		// não precisa esse loop pra background, só pra classe
		for (int i = 0; i < this.getBackground().getProficiency().getSkill().size(); i++) {
			verifyDuplicates.getSkill()
					.add(verifyDuplicates.CheckSkill(this.getBackground().getProficiency().getSkill().get(i)));
		}

		if (this.getRace().getProficiency().getSkill() != null) {
			verifyDuplicates.getSkill()
					.add(verifyDuplicates.CheckSkill(this.getRace().getProficiency().getSkill().get(0)));
		}

		verifyDuplicates.setLanguage(this.getRace().getProficiency().getLanguage());

		if (this.getBackground().getProficiency().getLanguage() != null) {
			for (int i = 0; i < this.getBackground().getProficiency().getLanguage().size(); i++) {
				verifyDuplicates.getLanguage().add(
						verifyDuplicates.CheckLanguage(this.getBackground().getProficiency().getLanguage().get(i)));
			}
		}
		verifyDuplicates.getLanguage().sort(Comparator.naturalOrder());
		return verifyDuplicates;
	}

	public ArrayList<String> SkillList(ArrayList<RepositorySkill> charSkills) {
		ArrayList<String> skillList = new ArrayList<>();
		for (int i = 0; i < charSkills.size(); i++) {
			skillList.add(charSkills.get(i).getName());
		}
		return skillList;
	}

	// precisa adicionar outro parâmetro "classProficiency"
	public ArrayList<String> ProficiencyList(Proficiency raceProfciencies) {
		ArrayList<String> profciencyList = new ArrayList<>();
		if (raceProfciencies.getWeapon() != null) {
			for (int i = 0; i < raceProfciencies.getWeapon().size(); i++) {
				profciencyList.add(raceProfciencies.getWeapon().get(i));
			}
		}
		if (raceProfciencies.getArmor() != null) {
			for (int i = 0; i < raceProfciencies.getArmor().size(); i++) {
				profciencyList.add(raceProfciencies.getArmor().get(i));
			}
		}
		if (raceProfciencies.getShield()) {
			profciencyList.add("Shield");
		}

		return profciencyList;
	}

	public int ApplySkillProficiencyBonus(String skill) {
		int proficiency = 0;
		for (int i = 0; i < this.getProficiency().getSkill().size(); i++) {
			if (this.getProficiency().getSkill().get(i).getName().contains(skill)) {
				proficiency = this.getProficienyBonus();
			}
		}
		return proficiency;
	}

	public int ApplySavingThrowProficiencyBonus(String saving) {
		int proficiency = 0;
		if (this.getProficiency().getSavingThrow() != null) {
			if (this.getProficiency().getSavingThrow().contains(saving)) {
				proficiency = this.getProficienyBonus();
			}
		}
		return proficiency;
	}

	public void ApplyExperiencePoints(int level) {
		ArrayList<Integer> experienceThreshold = new ArrayList<>();
		experienceThreshold.add(0);
		experienceThreshold.add(0);
		experienceThreshold.add(300);
		experienceThreshold.add(900);
		experienceThreshold.add(2700);
		experienceThreshold.add(6500);
		experienceThreshold.add(14000);
		experienceThreshold.add(23000);
		experienceThreshold.add(34000);
		experienceThreshold.add(48000);
		experienceThreshold.add(64000);
		experienceThreshold.add(85000);
		experienceThreshold.add(100000);
		experienceThreshold.add(120000);
		experienceThreshold.add(140000);
		experienceThreshold.add(165000);
		experienceThreshold.add(195000);
		experienceThreshold.add(225000);
		experienceThreshold.add(265000);
		experienceThreshold.add(305000);
		experienceThreshold.add(355000);

		this.setExperience(experienceThreshold.get(level));
	}

	public void ApplyProficiencyBonus(int level) {
		if (level <= 4) {
			this.setProficienyBonus(2);
		} else if (level >= 5 && level <= 8) {
			this.setProficienyBonus(3);
		} else if (level >= 9 && level <= 12) {
			this.setProficienyBonus(4);
		} else if (level >= 13 && level <= 16) {
			this.setProficienyBonus(5);
		} else if (level >= 17 && level <= 20) {
			this.setProficienyBonus(6);
		} else {
			this.setProficienyBonus(0);
		}
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getProficienyBonus() {
		return proficienyBonus;
	}

	public void setProficienyBonus(int proficienyBonus) {
		this.proficienyBonus = proficienyBonus;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public Proficiency getProficiency() {
		return proficiency;
	}

	public void setProficiency(Proficiency proficiency) {
		this.proficiency = proficiency;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setAbilityScores(AbilityScores abilityScores) {
		this.abilityScores = abilityScores;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
