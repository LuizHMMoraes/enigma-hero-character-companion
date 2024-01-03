package proficiency;

import java.util.ArrayList;

import character.AbilityScores;
import character.CommonMethods;

public class Proficiency implements CommonMethods {

	private ArrayList<String> savingThrow;
	private ArrayList<String> weapon;
	private ArrayList<String> armor;
	private boolean shield;
	private ArrayList<String> tool;
	private ArrayList<String> language;
	private ArrayList<Skill> skill;
	
	//
	public Proficiency() {
		
	}
	
	public Proficiency(String name) {
		
		if (name == "race") {
			this.language = new ArrayList<>();
			this.language.add("Common");
			for (int i = 1; i <= AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getIntelligence()); i++) {
				this.language.add((RandomLanguage()));
			} 
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

	public boolean AddSkill(Skill skill) {
		ArrayList<Skill> toAdd = new ArrayList<>();
		toAdd.add(skill);
		return this.getSkill().addAll(toAdd);
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

	public ArrayList<String> getTool() {
		return tool;
	}

	public void setTool(ArrayList<String> tool) {
		this.tool = tool;
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
