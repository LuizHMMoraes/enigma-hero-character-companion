package character;

import java.util.ArrayList;

import screen.SheetScreen;

public class Feat {
	private String name;
	private boolean meetPrerequisite;

	public Feat() {
	}

	public Feat(String name, boolean meetPrerequisite) {
		this.name = name;
		this.meetPrerequisite = meetPrerequisite;
	}
	
	public int Random(double number) {
		return (int) (Math.random() * number);
	}

	// Ficaram de fora dessa lista os seguintes talentos:
	/*
	 * Elemental Adept, Heavily Armored, Heavy Armor Master, Lightly Armored,Linguist,
	 * Magic Initiate, Martial Adept, Medium Armor Master, Moderately Armored, Resilient,
	 * Ritual Caster, Skilled, Spell Sniper, War Caster, Weapon Master.
	 */
	public Feat RandomFeat() {
		ArrayList<Feat> featList = new ArrayList<>();
		featList.add(Alert());
		featList.add(Athlete());
		featList.add(Actor());
		featList.add(Charger());
		featList.add(CrossbowExpert());
		featList.add(DefensiveDuelist());
		featList.add(DualWielder());
		featList.add(DungeonDelver());
		featList.add(Durable());
		featList.add(Grappler());
		featList.add(GreatWeaponMaster());
		featList.add(Healer());
		featList.add(InspiringLeader());
		featList.add(KeenMind());
		featList.add(Lucky());
		featList.add(MageSlayer());
		featList.add(Mobile());
		featList.add(MountedCombatant());
		featList.add(Observant());
		featList.add(PolearmMaster());
		featList.add(SavageAttacker());
		featList.add(Sentinel());
		featList.add(Sharpshooter());
		featList.add(ShieldMaster());
		featList.add(Skulker());
		featList.add(TavernBrawler());
		featList.add(Tough());
		
		return featList.get(Random(featList.size()));		
	}

	public Feat Alert() {
		Feat alert = new Feat();
		alert.setName("Alert");
		alert.setMeetPrerequisite(true);
		SheetScreen.initiative = 5;
		return alert;
	}

	public Feat Athlete() {
		Feat athlete = new Feat();
		athlete.setName("Athlete");
		athlete.setMeetPrerequisite(true);
		AbilityScores.IncreaseStrength(1);
		return athlete;
	}

	public Feat Actor() {
		Feat actor = new Feat();
		actor.setName("Actor");
		actor.setMeetPrerequisite(true);
		AbilityScores.IncreaseCharisma(1);
		return actor;
	}

	public Feat Charger() {
		Feat charger = new Feat();
		charger.setName("Charger");
		charger.setMeetPrerequisite(true);
		return charger;
	}

	public Feat CrossbowExpert() {
		Feat crossbowExpert = new Feat();
		crossbowExpert.setName("Crossbow Expert");
		crossbowExpert.setMeetPrerequisite(true);
		return crossbowExpert;
	}

	public Feat DefensiveDuelist() {
		Feat defensiveDuelist = new Feat();
		defensiveDuelist.setName("Defensive Duelist");

		if (AbilityScores.getDexterity() >= 13) {
			defensiveDuelist.setMeetPrerequisite(true);
		} else {
			defensiveDuelist.setMeetPrerequisite(false);
		}

		return defensiveDuelist;
	}

	public Feat DualWielder() {
		Feat dualWielder = new Feat();
		dualWielder.setName("Dual Wielder");
		dualWielder.setMeetPrerequisite(true);
		return dualWielder;
	}

	public Feat DungeonDelver() {
		Feat dungeonDelver = new Feat();
		dungeonDelver.setName("Dungeon Delver");
		dungeonDelver.setMeetPrerequisite(true);
		return dungeonDelver;
	}

	public Feat Durable() {
		Feat durable = new Feat();
		durable.setName("Durable");
		durable.setMeetPrerequisite(true);
		AbilityScores.IncreaseConstitution(1);
		return durable;
	}

	public Feat Grappler() {
		Feat grappler = new Feat();
		grappler.setName("Grappler");

		if (AbilityScores.getStrength() >= 13) {
			grappler.setMeetPrerequisite(true);
		} else {
			grappler.setMeetPrerequisite(false);
		}

		return grappler;
	}

	public Feat GreatWeaponMaster() {
		Feat greatWeaponMaster = new Feat();
		greatWeaponMaster.setName("Great Weapon Master");
		greatWeaponMaster.setMeetPrerequisite(true);
		return greatWeaponMaster;
	}

	public Feat Healer() {
		Feat healer = new Feat();
		healer.setName("Healer");
		healer.setMeetPrerequisite(true);
		return healer;
	}

	public Feat InspiringLeader() {
		Feat inspiringLeader = new Feat();
		inspiringLeader.setName("Inspiring Leader");

		if (AbilityScores.getCharisma() >= 13) {
			inspiringLeader.setMeetPrerequisite(true);
		} else {
			inspiringLeader.setMeetPrerequisite(false);
		}

		return inspiringLeader;
	}

	public Feat KeenMind() {
		Feat keenMind = new Feat();
		keenMind.setName("Keen Mind");
		keenMind.setMeetPrerequisite(true);
		AbilityScores.IncreaseIntelligence(1);
		return keenMind;
	}

	public Feat Lucky() {
		Feat lucky = new Feat();
		lucky.setName("Lucky");
		lucky.setMeetPrerequisite(true);
		return lucky;
	}

	public Feat MageSlayer() {
		Feat mageSlayer = new Feat();
		mageSlayer.setName("Mage Slayer");
		mageSlayer.setMeetPrerequisite(true);
		return mageSlayer;
	}

	public Feat Mobile() {
		Feat mobile = new Feat();
		mobile.setName("Mobile");
		mobile.setMeetPrerequisite(true);
		SheetScreen.speed = 3.0;
		return mobile;
	}

	public Feat MountedCombatant() {
		Feat mountedCombatant = new Feat();
		mountedCombatant.setName("Mounted Combatant");
		mountedCombatant.setMeetPrerequisite(true);
		return mountedCombatant;
	}

	public Feat Observant() {
		Feat observant = new Feat();
		observant.setName("Observant");
		observant.setMeetPrerequisite(true);

		int roll = (int) Math.ceil(Math.random() * 2);
		if (roll == 1) {
			AbilityScores.IncreaseIntelligence(1);
		} else
			AbilityScores.IncreaseWisdom(1);

		SheetScreen.passivePerception = 15;
		return observant;
	}

	public Feat PolearmMaster() {
		Feat polearmMaster = new Feat();
		polearmMaster.setName("Polearm Master");
		polearmMaster.setMeetPrerequisite(true);
		return polearmMaster;
	}

	public Feat SavageAttacker() {
		Feat savageAttacker = new Feat();
		savageAttacker.setName("Savage Attacker");
		savageAttacker.setMeetPrerequisite(true);
		return savageAttacker;
	}

	public Feat Sentinel() {
		Feat sentinel = new Feat();
		sentinel.setName("Sentinel");
		sentinel.setMeetPrerequisite(true);
		return sentinel;
	}

	public Feat Sharpshooter() {
		Feat sharpshooter = new Feat();
		sharpshooter.setName("Sharpshooter");
		sharpshooter.setMeetPrerequisite(true);
		return sharpshooter;
	}

	public Feat ShieldMaster() {
		Feat shieldMaster = new Feat();
		shieldMaster.setName("Shield Master");
		shieldMaster.setMeetPrerequisite(true);
		return shieldMaster;
	}

	public Feat Skulker() {
		Feat skulker = new Feat();
		skulker.setName("Skulker");

		if (AbilityScores.getDexterity() >= 13) {
			skulker.setMeetPrerequisite(true);
		} else {
			skulker.setMeetPrerequisite(false);
		}

		return skulker;
	}

	public Feat TavernBrawler() {
		Feat tavernBrawler = new Feat();
		tavernBrawler.setName("Tavern Brawler");
		tavernBrawler.setMeetPrerequisite(true);

		int roll = (int) Math.ceil(Math.random() * 2);
		if (roll == 1) {
			AbilityScores.IncreaseStrength(1);
		} else
			AbilityScores.IncreaseConstitution(1);

		return tavernBrawler;
	}
	
	public Feat Tough() {
		Feat tough = new Feat();
		tough.setName("Tough");
		tough.setMeetPrerequisite(true);
		SheetScreen.bonusHitPoints = 2;
		return tough;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getMeetPrerequisite() {
		return meetPrerequisite;
	}

	public void setMeetPrerequisite(boolean meetPrerequisite) {
		this.meetPrerequisite = meetPrerequisite;
	}
}
