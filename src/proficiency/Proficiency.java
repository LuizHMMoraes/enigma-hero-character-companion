package proficiency;

import java.util.ArrayList; 

import character.AbilityScores;

public class Proficiency {

	private ArrayList<String> savingThrow;
	private ArrayList<String> weapon;
	private ArrayList<String> armor;
	private boolean shield;
	private ArrayList<String> language;
	private ArrayList<Skill> skill;
	
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
	
	public int Random(double number) {
		return (int) (Math.random() * number);
	}
	
	public String RandomLanguage() {
		Language language = new Language();
		String name;
		do {
			name = language.getName().get(Random(language.getName().size()));
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

	public void AddSkill(Skill skill) {
		this.getSkill().add(CheckSkill(skill));
	}
	
	public Skill RandomSkill() {
		Skill skill = new Skill();
		skill = skill.SkillList().get(Random(skill.SkillList().size()));
		return skill;
	}
	
	public Skill CheckSkill(Skill skill) {
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

	public boolean getShield() {
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

	public ArrayList<Skill> getSkill() {
		return skill;
	}

	public void setSkill(ArrayList<Skill> skill) {
		this.skill = skill;
	}
	
}
