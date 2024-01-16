package character;

public class AbilityScores {

	private static int strength;
	private static int dexterity;
	private static int constitution;
	private static int intelligence;
	private static int wisdom;
	private static int charisma;

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
			lesserValue = roll < lesserValue ? roll : lesserValue;
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

	public static boolean IncreaseStrength(int number) {
		if (AbilityScores.getStrength() + number < 21) {
			AbilityScores.setStrength(AbilityScores.getStrength() + number);
			return true;
		} else
			return false;
	}

	public static boolean IncreaseDexterity(int number) {
		if (AbilityScores.getDexterity() + number < 21) {
			AbilityScores.setDexterity(AbilityScores.getDexterity() + number);
			return true;
		} else
			return false;
	}

	public static boolean IncreaseConstitution(int number) {
		if (AbilityScores.getConstitution() + number < 21) {
			AbilityScores.setConstitution(AbilityScores.getConstitution() + number);
			return true;
		} else
			return false;
	}

	public static boolean IncreaseIntelligence(int number) {
		if (AbilityScores.getIntelligence() + number < 21) {
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + number);
			return true;
		} else
			return false;
	}

	public static boolean IncreaseWisdom(int number) {
		if (AbilityScores.getWisdom() + number < 21) {
			AbilityScores.setWisdom(AbilityScores.getWisdom() + number);
			return true;
		} else
			return false;
	}

	public static boolean IncreaseCharisma(int number) {
		if (AbilityScores.getCharisma() + number < 21) {
			AbilityScores.setCharisma(AbilityScores.getCharisma() + number);
			return true;
		} else
			return false;
	}

	public static void RandomIncrease2() {
		int number = (int) Math.ceil(Math.random() * 6);

		switch (number) {
		case 1:
			if (IncreaseStrength(2)) {
				break;
			} else
				AbilityScores.RandomIncrease2();
			break;
		case 2:
			if (IncreaseDexterity(2)) {
				break;
			} else
				AbilityScores.RandomIncrease2();;
			break;
		case 3:
			if (IncreaseConstitution(2)) {
				break;
			} else
				AbilityScores.RandomIncrease2();
			break;
		case 4:
			if (IncreaseIntelligence(2)) {
				break;
			} else
				AbilityScores.RandomIncrease2();
			break;
		case 5:
			if (IncreaseWisdom(2)) {
				break;
			} else
				AbilityScores.RandomIncrease2();
			break;
		case 6:
			if (IncreaseCharisma(2)) {
				break;
			} else
				AbilityScores.RandomIncrease2();
			break;
		}
	}

	public static void RandomIncrease1() {
		int number = (int) Math.ceil(Math.random() * 6);

		switch (number) {
		case 1:
			if (IncreaseStrength(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();
			break;

		case 2:
			if (IncreaseDexterity(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();;
			break;

		case 3:
			if (IncreaseConstitution(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();
			break;

		case 4:
			if (IncreaseIntelligence(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();
			break;

		case 5:
			if (IncreaseWisdom(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();
			break;

		case 6:
			if (IncreaseCharisma(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();
			break;
		}
	}

	public static void RandomIncrease1HalfElf() {
		int number = (int) Math.ceil(Math.random() * 5);

		switch (number) {
		case 1:
			if (IncreaseStrength(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();
			break;

		case 2:
			if (IncreaseDexterity(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();;
			break;

		case 3:
			if (IncreaseConstitution(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();
			break;

		case 4:
			if (IncreaseIntelligence(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();
			break;

		case 5:
			if (IncreaseWisdom(1)) {
				break;
			} else
				AbilityScores.RandomIncrease1();
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
