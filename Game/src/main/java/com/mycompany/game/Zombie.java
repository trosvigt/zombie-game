package Game.src.main.java.com.mycompany.game;

public abstract class Zombie extends Character {
    public Zombie(int health, int attack) {
        super(health, attack);
    }

    // This method will be used to display information about the type of zombie
    @Override
    public String getType() {
        return "Zombie";
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

    public abstract int getHealth();

    public abstract void setHealth(int health);

    // This method will check if the survivor is alive
    public boolean isAlive(){
        return getHealth() > 0;
    }

    // This method will deccrease their health when zommbies attack
    public void takeDamage(int attack){
        setHealth(getHealth()-attack);
    
    }

}

class CommonInfected extends Zombie {
    private int health;

    public CommonInfected() {
        super(30, 5);
    }

    @Override
    public String getType() {
        return "Common Infected";
    }

    @Override
    public int getHealth(){
        return health;
    }

    @Override 
    public void setHealth(int health){
        this.health = health;
    }
}

class Tank extends Zombie {
    private int health;

    public Tank() {
        super(150, 20);
    }

    @Override
    public String getType() {
        return "Tank";
    }

    @Override
    public int getHealth(){
        return health;
    }

    @Override 
    public void setHealth(int health){
        this.health = health;
    }
}