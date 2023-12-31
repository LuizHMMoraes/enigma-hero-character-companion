package proficiency;

import java.util.ArrayList;

import character.AbilityScores;
import character.CommonMethods;

public class Proficiency implements CommonMethods {

	private ArrayList<String> savingThrow;
	private ArrayList<String> weapon;
	private ArrayList<String> armor;
	private boolean shield;
	private ArrayList<String> language;
	private ArrayList<RepositorySkill> skill;
	
	//
	public Proficiency() {
		
	}
	
	public Proficiency(String name) {
		
		if (name == "race") {
			this.setLanguage(new ArrayList<>());
			this.getLanguage().add("Common");
			for (int i = 1; i <= AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getIntelligence()); i++) {
				this.getLanguage().add((RandomLanguage()));
			} 
		} else if (name == "background") {
			this.setSkill(new ArrayList<>());
		}
	}
	
	@Override
	public int Random(double number) {
		return (int) (Math.random() * number);
	}
	
	public String RandomLanguage() {
		Language lang = new Language();
		String name;
		do {
			name = lang.getName().get(Random(lang.getName().size()));
		} while (this.getLanguage().contains(name));
		return name;
	}
	
	public String CheckLanguage(String language) {	
		Language randomLanguage = new Language();
		while (this.getLanguage().contains(language)) {		
			language = randomLanguage.getName().get(Random(randomLanguage.getName().size()));
		}
		return language;
	}

	public void AddSkill(RepositorySkill skill) {
		this.getSkill().add(CheckSkill(skill));
	}
	
	public RepositorySkill RandomSkill() {
		RepositorySkill skill = new RepositorySkill();
		skill = skill.RepositorySkillList().get(Random(skill.RepositorySkillList().size()));
		return skill;
	}
	
	public RepositorySkill CheckSkill(RepositorySkill skill) {
		while (this.getSkill().contains(skill)) {
			skill = this.RandomSkill();
		}
		return skill;
	}
	public ArrayList<String> getSavingThrow() {
		return savingThrow;
	}

	public void setSavingThrow(ArrayList<String> savingThrow) {
		this.savingThrow = savingThrow;
	}

	public ArrayList<String> getWeapon() {
		return weapon;
	}

	public void setWeapon(ArrayList<String> weapon) {
		this.weapon = weapon;
	}

	public ArrayList<String> getArmor() {
		return armor;
	}

	public void setArmor(ArrayList<String> armor) {
		this.armor = armor;
	}

	public boolean isShield() {
		return shield;
	}

	public void setShield(boolean shield) {
		this.shield = shield;
	}

	public ArrayList<String> getLanguage() {
		return language;
	}

	public void setLanguage(ArrayList<String> language) {
		this.language = language;
	}

	public ArrayList<RepositorySkill> getSkill() {
		return skill;
	}

	public void setSkill(ArrayList<RepositorySkill> skill) {
		this.skill = skill;
	}
	
}
