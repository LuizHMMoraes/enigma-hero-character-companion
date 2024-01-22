package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import background.Background;
import background.RepositoryBackground;
import character.AbilityScores;
import character.PlayerCharacter;
import classes.Barbarian;
import proficiency.Proficiency;
import proficiency.Skill;
import race.Race;
import race.RepositoryRace;
import spell.Spell;
import spell.SpellsRepository;

class EHTest {

	private AbilityScores abilityScores;
	private Proficiency proficiency;
	private PlayerCharacter playerCharacter;

	@BeforeAll
	static void start() {
		System.out.println("Os testes est�o come�ando!");
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
        proficiency = new Proficiency();
        playerCharacter = new PlayerCharacter();
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
    	proficiency.setLanguage(new ArrayList<>());
    	proficiency.getLanguage().add("Orc");
    	boolean res = proficiency.CheckLanguage("Orc").equals("Orc");
    	assertFalse(res);
    }

    @Test
    void testAddSkill() {
        proficiency.setSkill(new ArrayList<>());
        proficiency.AddSkill(new Skill().Acrobatics());
        assertTrue(proficiency.getSkill().get(0).getName().contains("Acrobatics"));
    }
    
   @Test
   void testRandomSkill() {
       proficiency.setSkill(new ArrayList<>());
       proficiency.getSkill().add(proficiency.RandomSkill());
       assertNotNull(proficiency.getSkill().get(0));
   }
   
   @Test 
   void testCheckSkill(){
       proficiency.setSkill(new ArrayList<>());
       proficiency.getSkill().add(proficiency.CheckSkill(new Skill().Acrobatics()));
       proficiency.getSkill().add(proficiency.CheckSkill(new Skill().Acrobatics()));
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
	   //seria t�o mais f�cil mudar os par�metros de entrada do m�todo...
	  
	   Background background = new Background();
	   background.setProficiency(new Proficiency());
	   background.getProficiency().setLanguage(new ArrayList<>());
	   background.getProficiency().getLanguage().add("Common");
	   background.getProficiency().setSkill(new ArrayList<>());
	   Skill skillBackground = new Skill().Acrobatics();
	   background.getProficiency().getSkill().add(skillBackground);
	   
	   Race race = new Race();
	   race.setProficiency(new Proficiency());
	   race.getProficiency().setLanguage(new ArrayList<>());
	   race.getProficiency().getLanguage().add("Common");
	   race.getProficiency().setSkill(new ArrayList<>());
	   Skill skillRace = new Skill().Acrobatics();
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
    public void testProficiencyList() {
        Proficiency raceProficiencies = new Proficiency();
        raceProficiencies.setWeapon(new ArrayList<String>(Arrays.asList("Sword", "Bow")));
        raceProficiencies.setArmor(new ArrayList<String>(Arrays.asList("Chainmail")));
        raceProficiencies.setShield(true);

        Proficiency classProficiencies = new Proficiency();
        classProficiencies.setWeapon(new ArrayList<String>(Arrays.asList("Dagger", "Staff")));
        classProficiencies.setArmor(new ArrayList<String>(Arrays.asList("Leather")));
        classProficiencies.setShield(false);

        PlayerCharacter playerCharacter = new PlayerCharacter();

        ArrayList<String> result = playerCharacter.ProficiencyList(raceProficiencies, classProficiencies);

        assertEquals(Arrays.asList("Sword", "Bow", "Chainmail", "Dagger", "Staff", "Leather", "Shield"), result, "Should return the correct list");
    }
   
   @Test
   void testApplySkillProficiencyBonus() {
	   playerCharacter.setProficiency(new Proficiency());
	   playerCharacter.getProficiency().setSkill(new ArrayList<>());
	   playerCharacter.getProficiency().getSkill().add(new Skill().Athletics());
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
	   playerCharacter.ApplyExperiencePoints(1);
	   assertEquals(0, playerCharacter.getExperience());
	   playerCharacter.ApplyExperiencePoints(20);
	   assertEquals(355000, playerCharacter.getExperience());	   
   }
   
   @Test 
   void testCalculateProficiencyBonus() {
	   playerCharacter.CalculateProficiencyBonus(5);
	   assertEquals(3, playerCharacter.getProficienyBonus(), "At level 5 the proficiency b�nus should be 3");
   }

   @Test
   void testApplyAbilityScoreImprovement() {   
	   int initialStrength = AbilityScores.getStrength();
       int initialDexterity = AbilityScores.getDexterity();
       int initialConstitution = AbilityScores.getConstitution();
       int initialIntelligence = AbilityScores.getIntelligence();
       int initialWisdom = AbilityScores.getWisdom();
       int initialCharisma = AbilityScores.getCharisma();
       playerCharacter.setFeat(new ArrayList<>());
       playerCharacter.ApplyAbilityScoreImprovement(1);
       boolean hasFeat = !playerCharacter.getFeat().isEmpty();       
       
	   assertTrue(
               AbilityScores.getStrength() == initialStrength + 2 ||
               AbilityScores.getDexterity() == initialDexterity + 2 ||
               AbilityScores.getConstitution() == initialConstitution + 2 ||
               AbilityScores.getIntelligence() == initialIntelligence + 2 ||
               AbilityScores.getWisdom() == initialWisdom + 2 ||
               AbilityScores.getCharisma() == initialCharisma + 2 ||
               AbilityScores.getStrength() == initialStrength + 1 ||
               AbilityScores.getDexterity() == initialDexterity + 1 ||
               AbilityScores.getConstitution() == initialConstitution + 1 ||
               AbilityScores.getIntelligence() == initialIntelligence + 1 ||
               AbilityScores.getWisdom() == initialWisdom + 1 ||
               AbilityScores.getCharisma() == initialCharisma + 1 ||
               hasFeat,
               "At least one ability should be increased or hasFeat should return true"
       );
   }

   //CLASSE --> Spell <--

    @Test
    public void testGetRandomKnownSpell() {
        Spell spell = new Spell(new SpellsRepository());

        String randomSpell = spell.getRandomKnownSpell("Wizard", 3);

        assertNotNull(randomSpell, "Should return a spell for a valid class and level");
        assertTrue(Arrays.asList("Animate Dead", "Bestow Curse", "Blink", "Clairvoyance", "Counterspell",
            "Dispel Magic", "Fear", "Feign Death", "Fireball", "Fly", "Gaseous Form",
            "Glyph of Warding", "Haste", "Hypnotic Pattern", "Leomund's Tiny Hut",
            "Lightning Bolt", "Magic Circle", "Major Image", "Nondetection",
            "Phantom Steed", "Protection from Energy", "Remove Curse", "Sending",
            "Sleet Storm", "Slow", "Stinking Cloud", "Tongues", "Vampiric Touch",
            "Water Breathing").contains(randomSpell), "Returned spell should be in the list of available spells");
    }

    @Test
    public void testGetSpellSlots() {
        Spell spell = new Spell(new SpellsRepository());

        assertEquals(3, spell.getSpellSlots("Bard", 10, 2), "Exactly 3 spells");
    }

    @Test
    public void testCountCurrentSpells() {
        List<List<String>> validInput = Arrays.asList(
                Arrays.asList("Fireball", "Magic Missile"),
                Arrays.asList("Shield", "Blink", "Mage Armor"),
                Arrays.asList("Healing Word", "Cure Wounds")
        );

        int count = Spell.countCurrentSpells(validInput);

        assertEquals(7, count, "Should return 7");
    }

    @Test
    public void testGetAllSpellsForLevel() {
        Spell spell = new Spell(new SpellsRepository());

        List<String> spells = spell.getAllSpellsForLevel("Sorcerer", 9);

        assertEquals(Arrays.asList("Gate", "Meteor Swarm", "Power Word Kill", "Time Stop", "Wish"), spells, "Should return the correct list of spells");
    }

   //CLASSE --> Barbarian <--
    @Test
    void testGetRandomSpecialization2OrLess() {
        Barbarian barbarian = new Barbarian(null, null, null, proficiency, 0);
        String specialization = Barbarian.getRandomSpecialization(2);
        assertEquals("", specialization);
    }

    @Test
    public void testGetRandomSpecialization3OrHigher() {
        String specialization = Barbarian.getRandomSpecialization(3);
        assertTrue(Arrays.asList(Barbarian.getSpecializations()).contains(specialization));
    }

    @Test
    public void testGetRandomFeaturesBerserker() {
        List<String> features = Barbarian.getRandomFeatures(3, "Path of the Berserker");
        assertNotNull(features);
        assertEquals(Arrays.asList("Rage", "Unarmored Defense", "Reckless Attack"), features);
    }

    @Test
    public void testGetRandomFeaturesTotemWarrior() {
        List<String> features = Barbarian.getRandomFeatures(2, "Path of the Totem Warrior");
        assertNotNull(features);
        assertEquals(Arrays.asList("Rage", "Unarmored Defense", "Reckless Attack", "Spirit Seeker", "Totem Spirit"), features);
    }

    @Test
    public void testGetBarbarianHitDice() {
        int result = Barbarian.getBarbarianHitDice();
        assertEquals(12, result, "Value must be 12");
    }

    @Test
    public void testGetProficiencyNotNull() {
        Proficiency proficiency = Barbarian.getProficiency();
        assertNotNull(proficiency, "The instance should not be null.");
        assertTrue(proficiency instanceof Proficiency, "The instance should be of type Proficiency");
    }

    @Test
    public void testGetProficiencySkillLists() {
        Proficiency proficiency = Barbarian.getProficiency();
        
        assertEquals(Arrays.asList("Light Armor", "Medium Armor", "Shields"), proficiency.getArmor());
        assertEquals(Arrays.asList("Simple Weapons", "Martial Weapons"), proficiency.getWeapon());
        assertEquals(Arrays.asList("Strength", "Constitution"), proficiency.getSavingThrow());

        assertEquals(2, proficiency.getSkill().size(), "Exactly 2 skills");

    }
}
