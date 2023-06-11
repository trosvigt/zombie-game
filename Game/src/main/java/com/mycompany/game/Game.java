package Game.src.main.java.com.mycompany.game;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private static Random random = new Random();
    private static ArrayList<Survivor> survivors = new ArrayList();
    private static ArrayList<Zombie> zombies = new ArrayList();

    public static void main(String[] args) {
        // Generate random Character list
        //generateRandomCharacters();

        // Test data
        survivors.add(new Civilian());
        survivors.add(new Soldier());

        zombies.add(new CommonInfected());
        zombies.add(new CommonInfected());

        for (Zombie zombie : zombies) {
            System.out.println(zombie);
        }

        for (Survivor survivor : survivors) {
            System.out.println(survivor);
        }

        // Display statistics for the user
        //displayStats();
    }

    // This method will generate a random list of zombies and survivors. The
    // number of characters generated is random, along with the
    // number of zombies and survivors
    private static void generateRandomCharacters() {
        // Declarations for random generation
        int characterType;
        int zombie;
        int survivor;

        // Get the total character count
        // Default min is 10 and default max is 30
        int characterCount = getRandomNumber(2, 6);

        // Generate number of characters equal to characterCount
        for (int i = 0; i < characterCount; i++) {
            // Generate one or two to pick between Survivor and Zombie
            characterType = getRandomNumber(1, 3);

            // Depending on the type...
            switch (characterType) {
                // Zombie case
                case 1: {
                    // Generate one or two to pick between common
                    // infected and tank, respectively
                    zombie = getRandomNumber(1, 3);

                    // Depending on zombie...
                    switch (zombie) {
                        // Common infected case
                        case 1: {
                            // Create common infected
                            zombies.add(new CommonInfected());
                            break;
                        }
                        // Tank case
                        case 2: {
                            // Create tank
                            zombies.add(new Tank());
                            break;
                        }
                        default: {
                            System.out.println("Unable to create Zombie...");
                            break;
                        }
                    }
                    break;
                }
                // Survivor case
                case 2: {
                    // Generate one, two, or three to pick between civilian,
                    // scientist, and soldier, respectively
                    survivor = getRandomNumber(1, 4);

                    // Depending on the survivor...
                    switch (survivor) {
                        case 1: {
                            // Create civilian
                            survivors.add(new Civilian());
                            break;
                        }
                        case 2: {
                            // Create scientist
                            survivors.add(new Scientist());
                            break;
                        }
                        case 3: {
                            // Create soldier
                            survivors.add(new Soldier());
                            break;
                        }
                        default: {
                            System.out.println("Unable to create Survivor...");
                            break;
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Unable to create Character...");
                    break;
                }
            }
        }
    }

    // This method will return a random int between
    // low (inclusive) and high (exclusive)
    private static int getRandomNumber(int low, int high) {
        return random.nextInt(high - low) + low;
    }

    // This method will contain the main battle logic...
    // Each survivor attacks each zombie, then each zombie attacks
    // each survivor, until either all survivors or all
    // zombies are dead
    public static int battle() {
        ArrayList<Zombie> deadZombies = new ArrayList();
        ArrayList<Survivor> deadSurvivors = new ArrayList();

        // Attack until all survivors or all zombies are dead
        while (survivors.size() != deadSurvivors.size() || 
                zombies.size() != deadZombies.size()) {
            // For each survivor...
            for (Survivor survivor : survivors) {
                // For each zombie...
                for (Zombie zombie : zombies) {
                    // If neither the zombie nor survivor are dead,
                    // deal damage
                    if (!survivor.isAlive() || !zombie.isAlive()) {
                        zombie.takeDamage(survivor.getAttack());
                        //survivor.attack(zombie);
                    }

                    String message = String.format("Survivor dealing %s damage",
                        survivor.getAttack());
                    System.out.println(message);

                    // Check if the zombie was killed by the survivor
                    if (!zombie.isAlive() && !deadZombies.contains(zombie)) {
                        deadZombies.add(zombie);
                        System.out.println("Dead zombie...");
                    }
                }
            }

            // For each zombie...
            for (Zombie zombie : zombies) {
                // For each survivor...
                for (Survivor survivor : survivors) {
                    // If neither the zombie nor survivor are dead,
                    // deal damage
                    if (!survivor.isAlive() || !zombie.isAlive()) {
                        survivor.takeDamage(zombie.getAttack());
                        //zombie.attack(survivor);
                    }

                    String message = String.format("Zombie dealing %s damage",
                        zombie.getAttack());
                    System.out.println(message);

                    // Check if the survivor was killed by the zombie
                    if (!survivor.isAlive() && !deadSurvivors.contains(survivor)) {
                        deadSurvivors.add(survivor);
                        System.out.println("Dead survivor...");
                    }
                }
            }
        }

        return survivors.size() - deadSurvivors.size();
    }

    // This method will display final game statistics for the user
    private static void displayStats() {
        // Display initial numbers
        System.out.println("We have " + survivors.size() + " survivors trying to make it to safety.\n");
        System.out.println("But there are " + zombies.size() + " zombies waiting for them.\n");

        // Display final survivor count after battle
        int survivorCount = battle();
        System.out.println("It seems " + survivorCount + " have made it to safety.");
    }
}