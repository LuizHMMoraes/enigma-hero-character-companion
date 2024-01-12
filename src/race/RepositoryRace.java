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

	public ArrayList<RepositoryRace> RaceList() {
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
//Aqui COMEÇA a metodologia para construção de cada raça de acordo com o Livro do Jogador.
	public RepositoryRace Dwarf() {
		RepositoryRace dwarf = new RepositoryRace();

		dwarf.setName("Dwarf");
		dwarf.setSpeed(7.5);
		dwarf.setSize("Medium");
		dwarf.setAlignment("order");
		dwarf.setRacialTraits(new ArrayList<>());
		dwarf.setSubrace(new ArrayList<>());

		dwarf.getRacialTraits().add("Darkvision");
		dwarf.getRacialTraits().add("Dwarf Resilience");
		dwarf.getRacialTraits().add("Stonecunning");

		dwarf.getSubrace().add("Hill Dwarf");
		dwarf.getSubrace().add("Mountain Dwarf");

		return dwarf;
	}

	public RepositoryRace Elf() {
		RepositoryRace elf = new RepositoryRace();

		elf.setName("Elf");
		elf.setSpeed(9.0);
		elf.setSize("Medium");
		elf.setAlignment("caotic");
		elf.setRacialTraits(new ArrayList<>());
		elf.setSubrace(new ArrayList<>());

		elf.getRacialTraits().add("Darkvision");
		elf.getRacialTraits().add("Keen Senses");
		elf.getRacialTraits().add("Fey Ancestry");
		elf.getRacialTraits().add("Trance");

		elf.getSubrace().add("High Elf");
		elf.getSubrace().add("Wood Elf");
		elf.getSubrace().add("Drow");

		return elf;
	}

	public RepositoryRace Halfling() {
		RepositoryRace halfling = new RepositoryRace();

		halfling.setName("Halfling");
		halfling.setSpeed(7.5);
		halfling.setSize("Small");
		halfling.setAlignment("good");
		halfling.setRacialTraits(new ArrayList<>());
		halfling.setSubrace(new ArrayList<>());

		halfling.getRacialTraits().add("Lucky");
		halfling.getRacialTraits().add("Brave");
		halfling.getRacialTraits().add("Halfling Nimbleness");

		halfling.getSubrace().add("Light Foot");
		halfling.getSubrace().add("Stout");

		return halfling;
	}

	public RepositoryRace Human() {
		RepositoryRace human = new RepositoryRace();

		human.setName("Human");
		human.setSpeed(9.0);
		human.setSize("Medium");
		human.setAlignment("None");
		human.setRacialTraits(new ArrayList<>());
		human.setSubrace(new ArrayList<>());

		human.getRacialTraits().add("None");

		human.getSubrace().add("None");

		return human;
	}

	public RepositoryRace Dragonborne() {
		RepositoryRace dragonborne = new RepositoryRace();

		dragonborne.setName("Dragonborne");
		dragonborne.setSpeed(9.0);
		dragonborne.setSize("Medium");
		dragonborne.setAlignment("None");
		dragonborne.setRacialTraits(new ArrayList<>());
		dragonborne.setSubrace(new ArrayList<>());

		dragonborne.getRacialTraits().add("Breath Weapon");
		dragonborne.getRacialTraits().add("Damage Resistance");

		dragonborne.getSubrace().add("Black");
		dragonborne.getSubrace().add("Blue");
		dragonborne.getSubrace().add("Brass");
		dragonborne.getSubrace().add("Bronze");
		dragonborne.getSubrace().add("Copper");
		dragonborne.getSubrace().add("Gold");
		dragonborne.getSubrace().add("Green");
		dragonborne.getSubrace().add("Red");
		dragonborne.getSubrace().add("Silver");
		dragonborne.getSubrace().add("White");

		return dragonborne;
	}

	public RepositoryRace Gnome() {
		RepositoryRace gnome = new RepositoryRace();

		gnome.setName("Gnome");
		gnome.setSpeed(7.5);
		gnome.setSize("Small");
		gnome.setAlignment("good");
		gnome.setRacialTraits(new ArrayList<>());
		gnome.setSubrace(new ArrayList<>());

		gnome.getRacialTraits().add("Darkvision");
		gnome.getRacialTraits().add("Gnome Cunning");

		gnome.getSubrace().add("Forest Gnome");
		gnome.getSubrace().add("Rock Gnome");

		return gnome;
	}

	public RepositoryRace HalfElf() {
		RepositoryRace halfElf = new RepositoryRace();

		halfElf.setName("Half-Elf");
		halfElf.setSpeed(9.0);
		halfElf.setSize("Medium");
		halfElf.setAlignment("caotic");
		halfElf.setRacialTraits(new ArrayList<>());
		halfElf.setSubrace(new ArrayList<>());

		halfElf.getRacialTraits().add("Darkvision");
		halfElf.getRacialTraits().add("Fey Ancestry");
		halfElf.getRacialTraits().add("Skill Versatility");

		halfElf.getSubrace().add("None");

		return halfElf;
	}

	public RepositoryRace HalfOrc() {
		RepositoryRace halfOrc = new RepositoryRace();

		halfOrc.setName("Half-Orc");
		halfOrc.setSpeed(9.0);
		halfOrc.setSize("Medium");
		halfOrc.setAlignment("caotic");
		halfOrc.setRacialTraits(new ArrayList<>());
		halfOrc.setSubrace(new ArrayList<>());

		halfOrc.getRacialTraits().add("Darkvision");
		halfOrc.getRacialTraits().add("Menacing");
		halfOrc.getRacialTraits().add("Relentless Endurance");
		halfOrc.getRacialTraits().add("Savage Attacks");

		halfOrc.getSubrace().add("None");

		return halfOrc;
	}

	public RepositoryRace Tiefling() {
		RepositoryRace tiefling = new RepositoryRace();

		tiefling.setName("Tiefling");
		tiefling.setSpeed(9.0);
		tiefling.setSize("Medium");
		tiefling.setAlignment("evil");
		tiefling.setRacialTraits(new ArrayList<>());
		tiefling.setSubrace(new ArrayList<>());

		tiefling.getRacialTraits().add("Darkvision");
		tiefling.getRacialTraits().add("Hellish Resistance");
		tiefling.getRacialTraits().add("Infernal Legacy");

		tiefling.getSubrace().add("None");

		return tiefling;
	}
//Aqui TERMINA a metodologia para construção de cada raça de acordo com o Livro do Jogador.

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
