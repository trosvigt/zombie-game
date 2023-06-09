/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game.src.main.java.com.mycompany.game;

/**
 *
 * @author Ziqi
 */
public abstract class Zombie extends Character {

    public Zombie(int initialHealth, int attack) {
        super(initialHealth, attack);

    }

    //This method will be used to display information about the type of zombie
    @Override
    public String getType() {
        return "Zombie";
    }

    //The method allows you to count the number of zombies of a specific type
    public static void countZombieType(Zombie[] zombies, String type) {
    int count = 0;

    for (Zombie zombie : zombies) {
        if (zombie.getType().equalsIgnoreCase(type)) {
            count++;
        }
    }

    System.out.println(type + " Count: " + count);
}

}

class CommonInfected extends Zombie {

    public CommonInfected() {
        super(30, 5);
    }

    @Override
    public String getType() {
        return "Common Infected";
    }
}

class Tank extends Zombie {

    public Tank() {
        super(150, 20);
    }

    @Override
    public String getType() {
        return "Tank";
    }
}
