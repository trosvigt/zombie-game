/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game.src.main.java.com.mycompany.game;

/**
 *
 * @author Ziqi
 */
//Abstract classes allow we to define common behaviors
public abstract class Survivor extends Character {

    public Survivor(int initialHealth, int attack) {
        super(initialHealth, attack);
    }

    //This method will be used to display information about the type of zombie
    public abstract String getType();

    //To count the number of survivor of a specific type
    public static void countSurvivorType(Survivor[] survivors, String type) {
        int count = 0;

        for (Survivor survivor : survivors) {
            if (survivor.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }

        System.out.println(type + " Count: " + count);
    }
}

class Scientist extends Survivor {
    public Scientist() {
        super(20, 2);
    }

    @Override
    public String getType() {
        return "Scientist";
    }
}

class Civilian extends Survivor {
    public Civilian() {
        super(50, 5);
    }

    @Override
    public String getType() {
        return "Civilian";
    }
}

class Soldier extends Survivor {
    public Soldier() {
        super(100, 10);
    }

    @Override
    public String getType() {
        return "Soldier";
    }
}
