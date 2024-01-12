package proficiency;

import java.util.ArrayList;

import character.AbilityScores;

public class RepositorySkill {
	private String name;
	private Integer ability;
	
	
	//
	public RepositorySkill() {
		
	}
	
	public RepositorySkill(String name, Integer ability) {
		this.name = name;
		this.ability = ability;
	}
	
	@Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RepositorySkill))
            return false;
        RepositorySkill other = (RepositorySkill) o;
        boolean valueEquals = (this.name == null && other.name == null)
          || (this.name != null && this.name.equals(other.name));
        boolean storeEquals = (this.ability == null && other.ability == null)
          || (this.ability != null && this.ability.equals(other.ability));
        return valueEquals && storeEquals;
    }
	
	public ArrayList<RepositorySkill> RepositorySkillList() {
		ArrayList<RepositorySkill> skillList = new ArrayList<>();
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
	
	public RepositorySkill Acrobatics() {
		RepositorySkill acrobatics = new RepositorySkill("Acrobatics", AbilityScores.modDex);
		return acrobatics;
	}
	
	public RepositorySkill AnimalHandling() {
		RepositorySkill animalHandling = new RepositorySkill("Animal Handling", AbilityScores.modWis);
		return animalHandling;
	}
	
	public RepositorySkill Arcana() {
		RepositorySkill arcana = new RepositorySkill("Arcana", AbilityScores.modInt);
		return arcana;
	}
	
	public RepositorySkill Athletics() {
		RepositorySkill athletics = new RepositorySkill("Athletics", AbilityScores.modStr);
		return athletics;
	}
	
	public RepositorySkill Deception() {
		RepositorySkill deception = new RepositorySkill("Deception", AbilityScores.modDex);
		return deception;
	}
	
	public RepositorySkill History() {
		RepositorySkill history = new RepositorySkill("History", AbilityScores.modInt);
		return history;
	}
	
	public RepositorySkill Insight() {
		RepositorySkill insight = new RepositorySkill("Insight", AbilityScores.modWis);
		return insight;
	}
	
	public RepositorySkill Intimidation() {
		RepositorySkill intimidation = new RepositorySkill("Intimidation", AbilityScores.modCha);
		return intimidation;
	}
	
	public RepositorySkill Investigation() {
		RepositorySkill investigation = new RepositorySkill("Investigation", AbilityScores.modInt);
		return investigation;
	}
	
	public RepositorySkill Medicine() {
		RepositorySkill medicine = new RepositorySkill("Medicine", AbilityScores.modWis);
		return medicine;
	}
	
	public RepositorySkill Nature() {
		RepositorySkill nature = new RepositorySkill("Nature", AbilityScores.modInt);
		return nature;
	}
	
	public RepositorySkill Perception() {
		RepositorySkill perception = new RepositorySkill("Perception", AbilityScores.modWis);
		return perception;
	}
	
	public RepositorySkill Performance() {
		RepositorySkill performance = new RepositorySkill("Performance", AbilityScores.modCha);
		return performance;
	}
	
	public RepositorySkill Persuasion() {
		RepositorySkill persuasion = new RepositorySkill("Persuasion", AbilityScores.modCha);
		return persuasion;
	}
	
	public RepositorySkill Religion() {
		RepositorySkill religion = new RepositorySkill("Religion", AbilityScores.modInt);
		return religion;
	}
	
	public RepositorySkill SleightOfHand() {
		RepositorySkill sleightOfHand = new RepositorySkill("Sleight of Hand", AbilityScores.modDex);
		return sleightOfHand;
	}
	
	public RepositorySkill Stealth() {
		RepositorySkill stealth = new RepositorySkill("Stealth", AbilityScores.modDex);
		return stealth;
	}
	
	public RepositorySkill Survival() {
		RepositorySkill survival = new RepositorySkill("Survival", AbilityScores.modWis);
		return survival;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAbility() {
		return ability;
	}

	public void setAbility(Integer ability) {
		this.ability = ability;
	}

}
