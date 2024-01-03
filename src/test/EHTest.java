package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import character.AbilityScores;
import proficiency.Proficiency;
import proficiency.Skill;
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
        RepositoryRace dwarf = RepositoryRace.Dwarf();
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
    void testAddSkill() {
        Proficiency proficiency = new Proficiency();
        proficiency.setSkill(new ArrayList<>());
        Skill skill = new Skill();
        skill.RandomSkill();
        assertTrue(proficiency.AddSkill(skill));
    }
    
    @Test
    void testCheckLanguage() {
    	Proficiency proficiency = new Proficiency();
    	proficiency.setLanguage(new ArrayList<>());
    	proficiency.getLanguage().add("Orc");
    	boolean res = proficiency.CheckLanguage("Orc").equals("Orc");
    	assertFalse(res);
    }
}
