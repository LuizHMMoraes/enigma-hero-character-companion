package background;

import java.util.ArrayList;

import character.CommonMethods;
import proficiency.Proficiency;
import proficiency.RepositorySkill;

public class Background implements CommonMethods {
	
	private String name;
	private String feature;
	private String equipment;
	
	private Proficiency proficiency;
	
	private String personalityTraits;
	private String ideals;
	private String bonds;
	private String flaws;

	@Override
	public int Random(double number) {
		return (int) (Math.random() * number);
	}
	
	public Background RandomBackground() {
		RepositoryBackground randomBackground = new RepositoryBackground();
		randomBackground = randomBackground.BackgroundList().get(Random(randomBackground.BackgroundList().size()));
		this.setName(randomBackground.getName());
		this.setFeature(randomBackground.getFeature());
		this.setEquipment(randomBackground.getEquipment());
		this.setPersonalityTraits(randomBackground.getPersonalityTraits().get(Random(randomBackground.getPersonalityTraits().size())));
		this.setIdeals(randomBackground.getIdeals().get(Random(randomBackground.getIdeals().size())));
		this.setBonds(randomBackground.getBonds().get(Random(randomBackground.getBonds().size())));
		this.setFlaws(randomBackground.getFlaws().get(Random(randomBackground.getBonds().size())));
		this.setProficiency(new Proficiency("background"));
		return this;
	}
	
	public void ApplyBackground(String name) {
		switch (name) {
		case "Acolyte":
			AcolyteModifiers();
			break;

		case "Charlatan":
			CharlatanModifiers();
			break;

		case "Criminal":
			CriminalModifiers();
			break;

		case "Entertainer":
			EntertainerModifiers();
			break;

		case "Folk Hero":
			FolkHeroModifiers();
			break;

		case "Guild Artisan":
			GuildArtisanModifiers();
			break;

		case "Hermit":
			HermitModifiers();
			break;

		case "Noble":
			NobleModifiers();
			break;

		case "Outlander":
			OutlanderModifiers();
			break;
			
		case "Sage":
			SageModifiers();
			break;
			
		case "Sailor":
			SailorModifiers();
			break;
			
		case "Soldier":
			SoldierModifiers();
			break;
			
		case "Urchin":
			UrchinModifiers();
			break;
		}
	}
	
	public void AcolyteModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Insight());
		this.getProficiency().AddSkill(new RepositorySkill().Religion());
		this.getProficiency().setLanguage(new ArrayList<>());
		this.getProficiency().RandomLanguage();
		this.getProficiency().RandomLanguage();
	}
	
	public void CharlatanModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Deception());
		this.getProficiency().AddSkill(new RepositorySkill().SleightOfHand());
	}
	
	public void CriminalModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Deception());
		this.getProficiency().AddSkill(new RepositorySkill().Stealth());
	}
	
	public void EntertainerModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Acrobatics());
		this.getProficiency().AddSkill(new RepositorySkill().Performance());
	}
	
	public void FolkHeroModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().AnimalHandling());
		this.getProficiency().AddSkill(new RepositorySkill().Survival());
	}
	
	public void GuildArtisanModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Insight());
		this.getProficiency().AddSkill(new RepositorySkill().Persuasion());
		this.getProficiency().setLanguage(new ArrayList<>());
		this.getProficiency().RandomLanguage();
	}
	
	public void HermitModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Medicine());
		this.getProficiency().AddSkill(new RepositorySkill().Religion());
		this.getProficiency().setLanguage(new ArrayList<>());
		this.getProficiency().RandomLanguage();
	}
	
	public void NobleModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().History());
		this.getProficiency().AddSkill(new RepositorySkill().Persuasion());
		this.getProficiency().setLanguage(new ArrayList<>());
		this.getProficiency().RandomLanguage();
	}
	
	public void OutlanderModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Athletics());
		this.getProficiency().AddSkill(new RepositorySkill().Survival());
		this.getProficiency().setLanguage(new ArrayList<>());
		this.getProficiency().RandomLanguage();
	}
	
	public void SageModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Arcana());
		this.getProficiency().AddSkill(new RepositorySkill().History());
		this.getProficiency().setLanguage(new ArrayList<>());
		this.getProficiency().RandomLanguage();
	}
	
	public void SailorModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Athletics());
		this.getProficiency().AddSkill(new RepositorySkill().Perception());
	}
	
	public void SoldierModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().Athletics());
		this.getProficiency().AddSkill(new RepositorySkill().Intimidation());
	}
	
	public void UrchinModifiers() {
		this.getProficiency().AddSkill(new RepositorySkill().SleightOfHand());
		this.getProficiency().AddSkill(new RepositorySkill().Stealth());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public Proficiency getProficiency() {
		return proficiency;
	}

	public void setProficiency(Proficiency proficiency) {
		this.proficiency = proficiency;
	}

	public String getPersonalityTraits() {
		return personalityTraits;
	}

	public void setPersonalityTraits(String personalityTraits) {
		this.personalityTraits = personalityTraits;
	}

	public String getIdeals() {
		return ideals;
	}

	public void setIdeals(String ideals) {
		this.ideals = ideals;
	}

	public String getBonds() {
		return bonds;
	}

	public void setBonds(String bonds) {
		this.bonds = bonds;
	}

	public String getFlaws() {
		return flaws;
	}

	public void setFlaws(String flaws) {
		this.flaws = flaws;
	}
}
