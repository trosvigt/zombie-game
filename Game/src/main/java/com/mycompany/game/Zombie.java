package com.mycompany.game;

import java.util.List;

public abstract class Zombie extends Character {
    public Zombie(int health, int attack) {
        super(health, attack);
    }

    // The method allows you to count the number of zombies of a specific type
    protected static int countZombieType(List<Zombie> zombies, String type) {
        int count = 0;

        // Count the type
        for (Zombie zombie : zombies) {
            if (zombie.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }

        return count;
    }

    protected void attack(Survivor target) {
        target.setHealth(target.getHealth() - this.getAttack());
    }
}

class CommonInfected extends Zombie {
    private static int id = -1;

    public CommonInfected() {
        super(30, 5);

        setId(incrementId());
    }

    // Gets next class id
    private static int incrementId() {
        id++;

        return id;
    }

    @Override
    public String getType() {
        return "CommonInfected";
    }
}

class Tank extends Zombie {
    private static int id = -1;

    public Tank() {
        super(150, 20);

        setId(incrementId());
    }

    // Gets next class id
    private static int incrementId() {
        id++;

        return id;
    }

    @Override
    public String getType() {
        return "Tank";
    }
}