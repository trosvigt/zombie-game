package Game.src.main.java.com.mycompany.game;

public abstract class Zombie extends Character {
    public Zombie(int health, int attack) {
        super(health, attack);
    }

    // The method allows you to count the number of zombies of a specific type
    public static int countZombieType(Zombie[] zombies, String type) {
        int count = 0;

        // Count the type
        for (Zombie zombie : zombies) {
            if (zombie.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }

        return count;
    }

    // This method will check if the survivor is alive
    public boolean isAlive(){
        return getHealth() > 0;
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