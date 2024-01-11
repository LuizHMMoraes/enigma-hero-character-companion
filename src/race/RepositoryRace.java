package race;

import java.util.ArrayList;

public class RepositoryRace {

	private String name;
	private Double speed;
	private String size;
	private String alignment;
	private ArrayList<String> racialTraits;
	private ArrayList<String> subrace;

	public RepositoryRace() {

	}

	public static RepositoryRace Dwarf() {
		RepositoryRace dwarf = new RepositoryRace();

		dwarf.setName("Dwarf");
		dwarf.setSpeed(7.5);
		dwarf.setSize("Medium");
		dwarf.setAlignment("order");
		dwarf.setRacialTraits(new ArrayList<>());
		dwarf.setSubrace(new ArrayList<>());

		dwarf.racialTraits.add("Darkvision");
		dwarf.racialTraits.add("Dwarf Resilience");
		dwarf.racialTraits.add("Stonecunning");

		dwarf.subrace.add("Hill Dwarf");
		dwarf.subrace.add("Mountain Dwarf");

		return dwarf;
	}

	public static RepositoryRace Elf() {
		RepositoryRace elf = new RepositoryRace();

		elf.setName("Elf");
		elf.setSpeed(9.0);
		elf.setSize("Medium");
		elf.setAlignment("caotic");
		elf.setRacialTraits(new ArrayList<>());
		elf.setSubrace(new ArrayList<>());

		elf.racialTraits.add("Darkvision");
		elf.racialTraits.add("Keen Senses");
		elf.racialTraits.add("Fey Ancestry");
		elf.racialTraits.add("Trance");

		elf.subrace.add("High Elf");
		elf.subrace.add("Wood Elf");
		elf.subrace.add("Drow");

		return elf;
	}

	public static RepositoryRace Halfling() {
		RepositoryRace halfling = new RepositoryRace();

		halfling.setName("Halfling");
		halfling.setSpeed(7.5);
		halfling.setSize("Small");
		halfling.setAlignment("good");
		halfling.setRacialTraits(new ArrayList<>());
		halfling.setSubrace(new ArrayList<>());

		halfling.racialTraits.add("Lucky");
		halfling.racialTraits.add("Brave");
		halfling.racialTraits.add("Halfling Nimbleness");

		halfling.subrace.add("Light Foot");
		halfling.subrace.add("Stout");

		return halfling;
	}

	public static RepositoryRace Human() {
		RepositoryRace human = new RepositoryRace();

		human.setName("Human");
		human.setSpeed(9.0);
		human.setSize("Medium");
		human.setAlignment("None");
		human.setRacialTraits(new ArrayList<>());
		human.setSubrace(new ArrayList<>());

		human.racialTraits.add("None");

		human.subrace.add("None");

		return human;
	}

	public static RepositoryRace Dragonborne() {
		RepositoryRace dragonborne = new RepositoryRace();

		dragonborne.setName("Dragonborne");
		dragonborne.setSpeed(9.0);
		dragonborne.setSize("Medium");
		dragonborne.setAlignment("None");
		dragonborne.setRacialTraits(new ArrayList<>());
		dragonborne.setSubrace(new ArrayList<>());

		dragonborne.racialTraits.add("Breath Weapon");
		dragonborne.racialTraits.add("Damage Resistance");
		
		dragonborne.subrace.add("Black");
		dragonborne.subrace.add("Blue");
		dragonborne.subrace.add("Brass");
		dragonborne.subrace.add("Bronze");
		dragonborne.subrace.add("Copper");
		dragonborne.subrace.add("Gold");
		dragonborne.subrace.add("Green");
		dragonborne.subrace.add("Red");
		dragonborne.subrace.add("Silver");
		dragonborne.subrace.add("White");

		return dragonborne;
	}
	
	public static RepositoryRace Gnome() {
		RepositoryRace gnome = new RepositoryRace();

		gnome.setName("Gnome");
		gnome.setSpeed(7.5);
		gnome.setSize("Small");
		gnome.setAlignment("good");
		gnome.setRacialTraits(new ArrayList<>());
		gnome.setSubrace(new ArrayList<>());

		gnome.racialTraits.add("Darkvision");
		gnome.racialTraits.add("Gnome Cunning");

		gnome.subrace.add("Forest Gnome");
		gnome.subrace.add("Rock Gnome");

		return gnome;
	}
	
	public static RepositoryRace HalfElf() {
		RepositoryRace halfElf = new RepositoryRace();

		halfElf.setName("Half-Elf");
		halfElf.setSpeed(9.0);
		halfElf.setSize("Medium");
		halfElf.setAlignment("caotic");
		halfElf.setRacialTraits(new ArrayList<>());
		halfElf.setSubrace(new ArrayList<>());

		halfElf.racialTraits.add("Darkvision");
		halfElf.racialTraits.add("Fey Ancestry");
		halfElf.racialTraits.add("Skill Versatility");

		halfElf.subrace.add("None");

		return halfElf;
	}
	
	public static RepositoryRace HalfOrc() {
		RepositoryRace halfOrc = new RepositoryRace();

		halfOrc.setName("Half-Orc");
		halfOrc.setSpeed(9.0);
		halfOrc.setSize("Medium");
		halfOrc.setAlignment("caotic");
		halfOrc.setRacialTraits(new ArrayList<>());
		halfOrc.setSubrace(new ArrayList<>());

		halfOrc.racialTraits.add("Darkvision");
		halfOrc.racialTraits.add("Menacing");
		halfOrc.racialTraits.add("Relentless Endurance");
		halfOrc.racialTraits.add("Savage Attacks");

		halfOrc.subrace.add("None");

		return halfOrc;
	}
	
	public static RepositoryRace Tiefling() {
		RepositoryRace tiefling = new RepositoryRace();

		tiefling.setName("Tiefling");
		tiefling.setSpeed(9.0);
		tiefling.setSize("Medium");
		tiefling.setAlignment("evil");
		tiefling.setRacialTraits(new ArrayList<>());
		tiefling.setSubrace(new ArrayList<>());

		tiefling.racialTraits.add("Darkvision");
		tiefling.racialTraits.add("Hellish Resistance");
		tiefling.racialTraits.add("Infernal Legacy");

		tiefling.subrace.add("None");

		return tiefling;
	}

	static public ArrayList<RepositoryRace> RaceList() {
		ArrayList<RepositoryRace> raceList = new ArrayList<>();

		raceList.add(Dwarf());
		raceList.add(Elf());
		raceList.add(Halfling());
		raceList.add(Human());
		raceList.add(Dragonborne());
		raceList.add(Gnome());
		raceList.add(HalfElf());
		raceList.add(HalfOrc());
		raceList.add(Tiefling());
		
		return raceList;
	}

	public String getName() {
		return name;
	}

	public Double getSpeed() {
		return speed;
	}

	public String getSize() {
		return size;
	}

	public String getAlignment() {
		return alignment;
	}

	public ArrayList<String> getRacialTraits() {
		return racialTraits;
	}

	public ArrayList<String> getSubrace() {
		return subrace;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public void setRacialTraits(ArrayList<String> racialTraits) {
		this.racialTraits = racialTraits;
	}

	public void setSubrace(ArrayList<String> subrace) {
		this.subrace = subrace;
	}

}
