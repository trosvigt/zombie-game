package com.mycompany.game;

import java.util.List;

public abstract class Survivor extends Character {

    private Weapon weapon;
    private Zombie killedZombie;

    public Survivor(int health, int attack) {
        super(health, attack);
    }

    protected Weapon getWeapon() {
        return weapon;
    }

    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    protected Zombie getKilledZombie() {
        return killedZombie;
    }

    protected void setKilledZombie(Zombie zombie) {
        this.killedZombie = zombie;
    }

    // To count the number of survivor of a specific type
    protected static int countSurvivorType(List<Survivor> survivors, String type) {
        int count = 0;

        // Count the type
        for (Survivor survivor : survivors) {
            if (survivor.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }

        return count;
    }
    
    protected void attack(Zombie target) {
        // Random int that will determine hit or miss
        // Example: generated 78 with accuracy of 70 is a miss,
        // because generated > accuracy                 
        int accuracyRoll = RandomUtility.getRandomNumber(1, 101);
        
        if (accuracyRoll <= weapon.getAccuracy()) {
            // Attack hits, reduce the target's health by the survivor's attack damage
            target.setHealth(target.getHealth() - this.getAttack());

            // Display the weapon used to kill the zombie
            System.out.println("Survivor used " + weapon.getType() + " to kill the zombie.");
        } else {
            // Attack misses
            System.out.println("Survivor missed the attack.");
        }    
}
}

class Scientist extends Survivor {

    private static int id = -1;

    public Scientist() {
        super(20, 2);

        setId(incrementId());
    }

    // Gets next class id
    private static int incrementId() {
        id++;

        return id;
    }

    @Override
    public String getType() {
        return "Scientist";
    }
}

class Civilian extends Survivor {

    private static int id = -1;

    public Civilian() {
        super(50, 5);

        setId(incrementId());
    }

    // Gets next class id
    private static int incrementId() {
        id++;

        return id;
    }

    @Override
    public String getType() {
        return "Civilian";
    }
}

class Soldier extends Survivor {

    private static int id = -1;

    public Soldier() {
        super(100, 10);

        setId(incrementId());
    }

    // Gets next class id
    private static int incrementId() {
        id++;

        return id;
    }

    @Override
    public String getType() {
        return "Soldier";
    }
}
