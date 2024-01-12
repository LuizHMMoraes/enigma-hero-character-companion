package character;

public class AbilityScores {

	private static int strength;
	private static int dexterity;
	private static int constitution;
	private static int intelligence;
	private static int wisdom;
	private static int charisma;
	
	public final static int modStr = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getStrength());
	public final static int modDex = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getDexterity());
	public final static int modCon = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getConstitution());
	public final static int modInt = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getIntelligence());
	public final static int modWis = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getWisdom());
	public final static int modCha = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getCharisma());

	public AbilityScores() {
		GenerateAbilityScores();
	}

	
	public int Random(double number) {
		return (int) Math.ceil(Math.random() * number);
	}

	public int RandomAbilityScore() {
		int abilityScore = Random(6);
		int lesserValue = abilityScore;
		
		for (int i = 0; i < 3; i++) {
	        int roll = Random(6);
	        abilityScore += roll;
	        lesserValue = roll<lesserValue?roll:lesserValue;
	    }
	    return abilityScore - lesserValue;
	}

	private void GenerateAbilityScores() {
		setStrength(RandomAbilityScore());
		setDexterity(RandomAbilityScore());
		setConstitution(RandomAbilityScore());
		setIntelligence(RandomAbilityScore());
		setWisdom(RandomAbilityScore());
		setCharisma(RandomAbilityScore());
	}

	public static int CalculateAbilityScoreModifier(int ability) {
		return (int) Math.floor((ability - 10) / 2.0);
	}

	public static void RandomIncrease2() {
		int number = (int) Math.ceil(Math.random() * 6);
		
		switch (number) {
		case 1:
			AbilityScores.setStrength(AbilityScores.getStrength() + 2);
			break;
		case 2:
			AbilityScores.setDexterity(AbilityScores.getDexterity() + 2);
			break;
		case 3:
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 2);
			break;
		case 4:
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 2);
			break;
		case 5:
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 2);
			break;
		case 6:
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 2);
			break;
		}
	}
	
	public static void RandomIncrease1() {
		int number = (int) Math.ceil(Math.random() * 6);
		
		switch (number) {
		case 1:
			AbilityScores.setStrength(AbilityScores.getStrength() + 1);
			break;
		case 2:
			AbilityScores.setDexterity(AbilityScores.getDexterity() + 1);
			break;
		case 3:
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
			break;
		case 4:
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 1);
			break;
		case 5:
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 1);
			break;
		case 6:
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 1);
			break;
		}
	}
	
	public static void RandomIncrease1HalfElf() {
		int number = (int) Math.ceil(Math.random() * 5);
		
		switch (number) {
		case 1:
			AbilityScores.setStrength(AbilityScores.getStrength() + 1);
			break;
		case 2:
			AbilityScores.setDexterity(AbilityScores.getDexterity() + 1);
			break;
		case 3:
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
			break;
		case 4:
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 1);
			break;
		case 5:
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 1);
			break;
		}
	}

	public static int getStrength() {
		return strength;
	}

	public static void setStrength(int strength) {
		AbilityScores.strength = strength;
	}

	public static int getDexterity() {
		return dexterity;
	}

	public static void setDexterity(int dexterity) {
		AbilityScores.dexterity = dexterity;
	}

	public static int getConstitution() {
		return constitution;
	}

	public static void setConstitution(int constitution) {
		AbilityScores.constitution = constitution;
	}

	public static int getIntelligence() {
		return intelligence;
	}

	public static void setIntelligence(int intelligence) {
		AbilityScores.intelligence = intelligence;
	}

	public static int getWisdom() {
		return wisdom;
	}

	public static void setWisdom(int wisdom) {
		AbilityScores.wisdom = wisdom;
	}

	public static int getCharisma() {
		return charisma;
	}

	public static void setCharisma(int charisma) {
		AbilityScores.charisma = charisma;
	}
}
