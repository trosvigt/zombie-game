 package Game.src.main.java.com.mycompany.game;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private static Random random = new Random();
    private ArrayList<Character> characters;
    private static int survivorCount;
    private static int zombieCount;

    public static void main(String[] args) {
        // Generate random Character list
        
        displayStats();

    }

    // This method will contain the main battle logic...
    // Each survivor attacks each zombie, then each zombie attacks
    // each survivor, until either all survivors or all
    // zombies are dead
    public static int battle() {
        return 0;
    }

    // This method will display final game statistics for the user
    private static void displayStats() {
        System.out.println("We have " + survivorCount + " survivors trying to make it to safety.\n");
        System.out.println("But there are " + zombieCount + " zombies waiting for them.\n");
        System.out.println("It seems " + 0 + " have made it to safety.");

    }

}
