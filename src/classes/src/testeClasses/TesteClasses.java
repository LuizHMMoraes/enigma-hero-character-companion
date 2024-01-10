package testeClasses;

import classes.Classes;

public class TesteClasses {
    public static void main(String[] args) {
        int characterLevel = 10;

        Classes randomCharacter = Classes.createRandomClass(characterLevel);
        System.out.println("Class: " + randomCharacter.className);
        System.out.println("Fighting Style: " + randomCharacter.fightingStyle);
        System.out.println("Specialization: " + randomCharacter.specialization);
        System.out.println("Hit Points: " + randomCharacter.hitPoints);
        System.out.println("Abilities: " + randomCharacter.abilities);
    }
}
