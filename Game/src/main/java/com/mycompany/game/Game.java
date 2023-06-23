package com.mycompany.game;

import java.util.ArrayList;

public class Game {
    private static ArrayList<Survivor> survivors = new ArrayList();
    private static ArrayList<Zombie> zombies = new ArrayList();

    public static void main(String[] args) {
        // Generate random Character list
        generateRandomCharacters();

        // Display statistics for the user
        displayStats();
    }

    // This method will generate a random list of zombies and survivors. The
    // number of characters generated is random, along with the
    // number of zombies and survivors
    private static void generateRandomCharacters() {
        // Get the factories going
        ZombieFactory zombieFactory = new ZombieFactory();
        SurvivorFactory survivorFactory = new SurvivorFactory();
        int characterType;
        Zombie zombie;
        Survivor survivor;

        // Get the total character count
        // Default min is 10 and default max is 30
        int characterCount = RandomUtility.getRandomNumber(10, 30);

        // Generate number of characters equal to characterCount
        for (int i = 0; i < characterCount; i++) {
            // Generate one or two to pick between Survivor and Zombie
            characterType = RandomUtility.getRandomNumber(1, 3);
            switch(characterType) {
                // Survivor case...
                case 1: {
                    // Generate random number for survivor type
                    characterType = RandomUtility.getRandomNumber(1, 4);

                    // Generate and add survivor
                    survivor = survivorFactory.getSurvivorInstance(characterType);

                    // ***************************************
                    // Use weapon factory to get random weapon
                    // ***************************************

                    // **************************************
                    // Use weapon setter to set random weapon
                    // **************************************

                    survivors.add(survivor);
                }
                // Zombie case...
                case 2: {
                    // Generate random number for zombie type
                    characterType = RandomUtility.getRandomNumber(1, 3);

                    // Generate and add zombie
                    zombie = zombieFactory.getZombieInstance(characterType);
                    zombies.add(zombie);
                }
            }
        }
    }

    // This method will contain the main battle logic...
    // Each survivor attacks each zombie, then each zombie attacks
    // each survivor, until either all survivors or all
    // zombies are dead
    private static int battle() {
        ArrayList<Zombie> deadZombies = new ArrayList();
        ArrayList<Survivor> deadSurvivors = new ArrayList();

        // Attack until all survivors or all zombies are dead
        while (survivors.size() != deadSurvivors.size() &&
                zombies.size() != deadZombies.size()) {
            // For each survivor...
            for (Survivor survivor : survivors) {
                // For each zombie...
                for (Zombie zombie : zombies) {
                    // If both zombie and survivor are alive...
                    if (survivor.isAlive() && zombie.isAlive()) {
                        survivor.attack(zombie);
                    }

                    // Check if the zombie was killed by the survivor
                    if (!zombie.isAlive() && !deadZombies.contains(zombie)) {
                        deadZombies.add(zombie);

                        System.out.println(survivor + " killed " + zombie);
                    }
                }
            }

            // For each zombie...
            for (Zombie zombie : zombies) {
                // For each survivor...
                for (Survivor survivor : survivors) {
                    // If both zombie and survivor are alive...
                    if (survivor.isAlive() && zombie.isAlive()) {
                        zombie.attack(survivor);
                    }

                    // Check if the survivor was killed by the zombie
                    if (!survivor.isAlive() && !deadSurvivors.contains(survivor)) {
                        deadSurvivors.add(survivor);

                        System.out.println(zombie + " killed " + survivor);
                    }
                }
            }
        }

        return survivors.size() - deadSurvivors.size();
    }

    // This method will display final game statistics for the user
    private static void displayStats() {
        displaySurvivorMessage();

        displayZombieMessage();

        // Display final survivor count after battle
        int survivorCount = battle();
        if (survivorCount > 0) {
            System.out.println("It seems " + survivorCount + " have made it to safety.");
        } else {
            System.out.println("None of the survivors made it");
        }
    }

    private static void displaySurvivorMessage() {
        String message;

        message = String.format("We have %s survivor(s) trying to make it to safety (%s scientists, %s civilians, %s soldiers)",
        survivors.size(),
        Survivor.countSurvivorType(survivors, "Scientist"),
        Survivor.countSurvivorType(survivors, "Civilian"),
        Survivor.countSurvivorType(survivors, "Soldier"));
        System.out.println(message);
    }

    private static void displayZombieMessage() {
        String message;

        message = String.format("But there are %s zombie(s) waiting for them (%s common infected, %s tanks)",
        zombies.size(),
        Zombie.countZombieType(zombies, "CommonInfected"),
        Zombie.countZombieType(zombies, "Tank"));
        System.out.println(message);
    }
}