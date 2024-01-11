package test;

import character.AbilityScores; 
import character.PlayerCharacter;
import proficiency.RepositorySkill;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayerCharacter pc1 = new PlayerCharacter("teste");

		System.out.println(pc1.getRace().getName() + " - " + pc1.getRace().getSubrace());

		if(pc1.getRace().getProficiency().getSkill() != null){
		System.out.println("Skill RAÇA: "+pc1.getRace().getProficiency().getSkill().get(0).getName());
		System.out.println("Skill PLAYER: "+pc1.getProficiency().getSkill().get(2).getName());
		}
		
		System.out.println(pc1.getBackground().getName());

		System.out.println("Skill BACKGROUND: "+pc1.getBackground().getProficiency().getSkill().get(0).getName());
		System.out.println("Skill BACKGROUND: "+pc1.getBackground().getProficiency().getSkill().get(1).getName());

		//System.out.println("Skill PLAYER: "+pc1.getProficiency().getSkill().get(0).getName()+pc1.getProficiency().getSkill().get(0).getHasProficiency());
		
		/*
		 * RepositorySkill skill = new RepositorySkill(); skill =
		 * skill.RepositorySkillList().get(pc1.Random(skill.RepositorySkillList().size()
		 * )); System.out.println("WHY  "+skill.getHasProficiency());
		 */


	}
}