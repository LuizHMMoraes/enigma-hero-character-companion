package test;

import character.AbilityScores;
import character.PlayerCharacter;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayerCharacter pc1 = new PlayerCharacter("teste", 10, 2);
			
		System.out.println(pc1.getRace().getName() + "\n" + pc1.getRace().getSubrace() + "\n" + pc1.getRace().getRacialTraits() + "\n");
		
		//System.out.println(AbilityScores.getStrength());
		//System.out.println(AbilityScores.getDexterity());
		//System.out.println(AbilityScores.getConstitution());
		
		System.out.println("Força" + AbilityScores.getStrength());
		System.out.println("Carisma" + AbilityScores.getCharisma());
		System.out.println("Inteligencia" +AbilityScores.getIntelligence());
		System.out.println("MOD Inteligencia" +AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getIntelligence()));
		
		System.out.println(pc1.getRace().getProficiency().getLanguage());
		try {
			System.out.println(pc1.getRace().getProficiency().getSkill().get(0).getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			System.out.println(pc1.getRace().getProficiency().getWeapon());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}