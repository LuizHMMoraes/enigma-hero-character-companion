package proficiency;

import java.util.ArrayList;

public class Skill {
	private String name;
	private String ability;
	
	
	//
	public Skill() {
		
	}
	
	public Skill(String name, String ability) {
		this.name = name;
		this.ability = ability;
	}
	
	@Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Skill))
            return false;
        Skill other = (Skill) o;
        boolean valueEquals = (this.name == null && other.name == null)
          || (this.name != null && this.name.equals(other.name));
        boolean storeEquals = (this.ability == null && other.ability == null)
          || (this.ability != null && this.ability.equals(other.ability));
        return valueEquals && storeEquals;
    }
	
	public ArrayList<Skill> SkillList() {
		ArrayList<Skill> skillList = new ArrayList<>();
		skillList.add(Acrobatics());
		skillList.add(AnimalHandling());
		skillList.add(Arcana());
		skillList.add(Athletics());
		skillList.add(Deception());
		skillList.add(History());
		skillList.add(Insight());
		skillList.add(Intimidation());
		skillList.add(Investigation());
		skillList.add(Medicine());
		skillList.add(Nature());
		skillList.add(Perception());
		skillList.add(Performance());
		skillList.add(Persuasion());
		skillList.add(Religion());
		skillList.add(SleightOfHand());
		skillList.add(Stealth());
		skillList.add(Survival());
		return skillList;
	}
	
	public Skill Acrobatics() {
		Skill acrobatics = new Skill("Acrobatics", "Dexterity");
		return acrobatics;
	}
	
	public Skill AnimalHandling() {
		Skill animalHandling = new Skill("Animal Handling", "Wisdom");
		return animalHandling;
	}
	
	public Skill Arcana() {
		Skill arcana = new Skill("Arcana", "Intelligence");
		return arcana;
	}
	
	public Skill Athletics() {
		Skill athletics = new Skill("Athletics", "Strength");
		return athletics;
	}
	
	public Skill Deception() {
		Skill deception = new Skill("Deception", "Dexterity");
		return deception;
	}
	
	public Skill History() {
		Skill history = new Skill("History", "Intelligence");
		return history;
	}
	
	public Skill Insight() {
		Skill insight = new Skill("Insight", "Wisdom");
		return insight;
	}
	
	public Skill Intimidation() {
		Skill intimidation = new Skill("Intimidation", "Charisma");
		return intimidation;
	}
	
	public Skill Investigation() {
		Skill investigation = new Skill("Investigation", "Intelligence");
		return investigation;
	}
	
	public Skill Medicine() {
		Skill medicine = new Skill("Medicine", "Wisdom");
		return medicine;
	}
	
	public Skill Nature() {
		Skill nature = new Skill("Nature", "Intelligence");
		return nature;
	}
	
	public Skill Perception() {
		Skill perception = new Skill("Perception", "Wisdom");
		return perception;
	}
	
	public Skill Performance() {
		Skill performance = new Skill("Performance", "Charisma");
		return performance;
	}
	
	public Skill Persuasion() {
		Skill persuasion = new Skill("Persuasion", "Charisma");
		return persuasion;
	}
	
	public Skill Religion() {
		Skill religion = new Skill("Religion", "Intelligence");
		return religion;
	}
	
	public Skill SleightOfHand() {
		Skill sleightOfHand = new Skill("Sleight of Hand", "Dexterity");
		return sleightOfHand;
	}
	
	public Skill Stealth() {
		Skill stealth = new Skill("Stealth", "Dexterity");
		return stealth;
	}
	
	public Skill Survival() {
		Skill survival = new Skill("Survival", "Wisdom");
		return survival;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}	
}
