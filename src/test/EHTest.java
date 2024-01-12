package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import background.Background;
import background.RepositoryBackground;
import character.AbilityScores;
import character.PlayerCharacter;
import proficiency.Proficiency;
import proficiency.RepositorySkill;
import race.Race;
import race.RepositoryRace;

class EHTest {

	private AbilityScores abilityScores;

	@BeforeAll
	static void start() {
		System.out.println("Os testes estão começando!");
	}
	
	@Test
	@BeforeEach
	private void init() {
		
	}
	
	@AfterAll
	static void close() {
		System.out.println("Os testes terminaram!");
	}
	
	//CLASSE --> AbilityScore <--
	@BeforeEach
    void setUp() {
        abilityScores = new AbilityScores();
    }
	
	@Test
    void testRandom() {
        int result = abilityScores.Random(6);
        assertTrue(result >= 1 && result <= 6);
    }
	
    @Test
    void testRandomAbilityScore() {
        int abilityScore = abilityScores.RandomAbilityScore();
        assertTrue(abilityScore >= 3 && abilityScore <= 18);
    }
    
    @Test
    void testCalculateAbilityScoreModifier() {
        assertEquals(-5, AbilityScores.CalculateAbilityScoreModifier(1), "Modifier for 1 should be -5");
        assertEquals(-1, AbilityScores.CalculateAbilityScoreModifier(9), "Modifier for 9 should be -1");
        assertEquals(0, AbilityScores.CalculateAbilityScoreModifier(11), "Modifier for 11 should be 0");
        assertEquals(5, AbilityScores.CalculateAbilityScoreModifier(20), "Modifier for 20 should be 5");
    }
    
    @Test
    void testRandomIncrease2() {
        
        int initialStrength = AbilityScores.getStrength();
        int initialDexterity = AbilityScores.getDexterity();
        int initialConstitution = AbilityScores.getConstitution();
        int initialIntelligence = AbilityScores.getIntelligence();
        int initialWisdom = AbilityScores.getWisdom();
        int initialCharisma = AbilityScores.getCharisma();

        AbilityScores.RandomIncrease2();

        assertTrue(
                AbilityScores.getStrength() == initialStrength + 2 ||
                AbilityScores.getDexterity() == initialDexterity + 2 ||
                AbilityScores.getConstitution() == initialConstitution + 2 ||
                AbilityScores.getIntelligence() == initialIntelligence + 2 ||
                AbilityScores.getWisdom() == initialWisdom + 2 ||
                AbilityScores.getCharisma() == initialCharisma + 2,
                "At least one ability should be increased by 2"
        );
    }
    
    //CLASSE --> RepositoryRace <--
    @Test
    void testDwarf() {
        RepositoryRace dwarf = new RepositoryRace().Dwarf();
        assertEquals("Dwarf", dwarf.getName());
        assertEquals(7.5, dwarf.getSpeed());
        assertEquals("Medium", dwarf.getSize());
        assertEquals("order", dwarf.getAlignment());

        ArrayList<String> dwarfTraits = dwarf.getRacialTraits();
        assertEquals(3, dwarfTraits.size());
        assertTrue(dwarfTraits.contains("Darkvision"));
        assertTrue(dwarfTraits.contains("Dwarf Resilience"));
        assertTrue(dwarfTraits.contains("Stonecunning"));

        ArrayList<String> dwarfSubraces = dwarf.getSubrace();
        assertEquals(2, dwarfSubraces.size());
        assertTrue(dwarfSubraces.contains("Hill Dwarf"));
        assertTrue(dwarfSubraces.contains("Mountain Dwarf"));
    }
    
    //CLASSE --> Race <--
    @Test
    void testRandomRace() {
        Race race = new Race();
        race.RandomRace();

        assertNotNull(race.getName());
        assertNotNull(race.getSuggestedAlignment());
        assertNotNull(race.getRacialTraits());
        assertNotNull(race.getSize());
        assertNotNull(race.getSubrace());
    }

    @Test
    void testApplyRaceModifiers() {
        Race race = new Race("Dwarf", 7.5, "order", new ArrayList<>(),"Medium", "Hill Dwarf");
        race.ApplyRaceModifiers("Dwarf");
        assertTrue(race.getRacialTraits().contains("Dwarven Toughness"));
    }
    
 //CLASSE --> Proficiency <--
    @Test
    void testRandomLanguage() {
        Proficiency proficiency = new Proficiency();
        proficiency.setLanguage(new ArrayList<>());
        proficiency.getLanguage().add(proficiency.RandomLanguage());
        proficiency.getLanguage().add(proficiency.RandomLanguage());
        proficiency.getLanguage().add(proficiency.RandomLanguage());
        proficiency.getLanguage().add(proficiency.RandomLanguage());
        assertEquals(4, proficiency.getLanguage().size());
        String languages [] = Arrays.asList(proficiency.getLanguage().toArray()).toArray(new String[0]);
        Arrays.sort(languages);
        for(int i = 0; i <=2; i++) {
        	assertFalse(languages[i].equals(languages[i+1]));
        }
    }
    
    @Test
    void testCheckLanguage() {
    	Proficiency proficiency = new Proficiency();
    	proficiency.setLanguage(new ArrayList<>());
    	proficiency.getLanguage().add("Orc");
    	boolean res = proficiency.CheckLanguage("Orc").equals("Orc");
    	assertFalse(res);
    }

    @Test
    void testAddSkill() {
        Proficiency proficiency = new Proficiency();
        proficiency.setSkill(new ArrayList<>());
        proficiency.AddSkill(new RepositorySkill().Acrobatics());
        assertTrue(proficiency.getSkill().get(0).getName().contains("Acrobatics"));
    }
    
   @Test
   void testRandomSkill() {
	   Proficiency proficiency = new Proficiency();
       proficiency.setSkill(new ArrayList<>());
       proficiency.getSkill().add(proficiency.RandomSkill());
       assertNotNull(proficiency.getSkill().get(0));
   }
   
   @Test 
   void testCheckSkill(){
	   Proficiency proficiency = new Proficiency();
       proficiency.setSkill(new ArrayList<>());
       proficiency.getSkill().add(proficiency.CheckSkill(new RepositorySkill().Acrobatics()));
       proficiency.getSkill().add(proficiency.CheckSkill(new RepositorySkill().Acrobatics()));
       assertFalse(proficiency.getSkill().get(0).getName().equals(proficiency.getSkill().get(1).getName()));
   }
   
   //CLASSE --> Background <--
   @Test
   void testRandomBackground() {
	   Background background = new Background().RandomBackground();
	   assertNotNull(background.getName());
	   assertNotNull(background.getFeature());
	   assertNotNull(background.getEquipment());
	   assertNotNull(background.getPersonalityTraits());
	   assertNotNull(background.getIdeals());
	   assertNotNull(background.getBonds());
	   assertNotNull(background.getFlaws());
	   assertNotNull(background.getProficiency());
   }
   
   @Test
   void testApplyBackground() {
	   Background background = new Background();
	   background.setProficiency(new Proficiency("background"));
	   background.ApplyBackground("Charlatan");
	   assertTrue(background.getProficiency().getSkill().get(0).getName().equals("Deception"));
	   assertTrue(background.getProficiency().getSkill().get(1).getName().equals("Sleight of Hand"));
   }
   
   //CLASSE --> RespositoryBackground <--   
   @Test
   void testBackgroundList() {
	   RepositoryBackground repoBack = new RepositoryBackground().BackgroundList().get(0);
	   assertTrue(repoBack.getName().equals("Acolyte"), "Should return true. Index 0 of the list contains 'Acolyte'");
   }
   
   //CLASSE --> PlayerCharacter <--
   @Test
   void testRandomAlignment() {
	   PlayerCharacter playerCharacter = new PlayerCharacter();
	   playerCharacter.RandomAlignment("evil");
	   assertNotNull(playerCharacter.getAlignment());
   }
   
   @Test
   void testVerifyDuplicates() {
	   //seria tão mais fácil mudar os parâmetros de entrada do método...
	  
	   Background background = new Background();
	   background.setProficiency(new Proficiency());
	   background.getProficiency().setLanguage(new ArrayList<>());
	   background.getProficiency().getLanguage().add("Common");
	   background.getProficiency().setSkill(new ArrayList<>());
	   RepositorySkill skillBackground = new RepositorySkill().Acrobatics();
	   background.getProficiency().getSkill().add(skillBackground);
	   
	   Race race = new Race();
	   race.setProficiency(new Proficiency());
	   race.getProficiency().setLanguage(new ArrayList<>());
	   race.getProficiency().getLanguage().add("Common");
	   race.getProficiency().setSkill(new ArrayList<>());
	   RepositorySkill skillRace = new RepositorySkill().Acrobatics();
	   race.getProficiency().getSkill().add(skillRace);
	   
	   PlayerCharacter playerCharacter = new PlayerCharacter();
	   playerCharacter.setBackground(background);
	   playerCharacter.setRace(race);
	   playerCharacter.setProficiency(playerCharacter.VerifyDuplicates());
	   
	   assertFalse(playerCharacter.getProficiency().getLanguage().get(0).equals(playerCharacter.getProficiency().getLanguage().get(1)),
			   "Should return True");
	   assertFalse(playerCharacter.getProficiency().getSkill().get(0).getName().equals(playerCharacter.getProficiency().getSkill().get(1).getName()),
			   "Should return True");
   }
   
   @Test
   void testProficiencyList() {
	   //precisa das classes de personagem
   }
   
   @Test
   void testApplySkillProficiencyBonus() {
	   PlayerCharacter playerCharacter = new PlayerCharacter();
	   playerCharacter.setProficiency(new Proficiency());
	   playerCharacter.getProficiency().setSkill(new ArrayList<>());
	   playerCharacter.getProficiency().getSkill().add(new RepositorySkill().Athletics());
	   playerCharacter.setProficienyBonus(5);
	   
	   assertEquals(5, playerCharacter.ApplySkillProficiencyBonus("Athletics"));
	   assertEquals(0, playerCharacter.ApplySkillProficiencyBonus("Deception"));
   }
   
   @Test
   void testApplySavingThrowProficiencyBonus() {
	   //precisa das classes de personagem
   }
   
   @Test
   void testApplyExperiencePoints() {
	   PlayerCharacter playerCharacter = new PlayerCharacter();
	   playerCharacter.ApplyExperiencePoints(1);
	   assertEquals(0, playerCharacter.getExperience());
	   playerCharacter.ApplyExperiencePoints(20);
	   assertEquals(355000, playerCharacter.getExperience());	   
   }
   
   @Test 
   void testApplyProficiencyBonus() {
	   PlayerCharacter playerCharacter = new PlayerCharacter();
	   playerCharacter.ApplyProficiencyBonus(5);
	   assertEquals(3, playerCharacter.getProficienyBonus(), "At level 5 the proficiency bônus should be 3");
   }
}
