package character;

import background.Background;
import race.Race;

public class PlayerCharacter implements CommonMethods {

	private String characterName;
	private int hitPoints;
	private int proficienyBonus;
	//private int experience;
	//private int /level;
	//private String alignment;
	//private int acBonus;
	//private int attackBonus;

	@SuppressWarnings("unused")
	private AbilityScores abilityScores;

	private Race race;
	
	private Background background;

	//

	public PlayerCharacter() {

	}

	public PlayerCharacter(String characterName, int hitPoints, int proficienyBonus) {
		this.characterName = characterName;
		this.hitPoints = hitPoints;
		this.proficienyBonus = proficienyBonus;

		this.abilityScores = new AbilityScores();

		this.race = new Race();
		this.race.RandomRace();
		this.race.ApplyRaceModifiers(race.getName());
		
		this.background = new Background().RandomBackground();
		this.background.ApplyBackground(background.getName());

	}

	@Override
	public int Random(double number) {
		// TODO Auto-generated method stub

		return (int) (Math.random() * number + 1);
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

}
