package Game.src.main.java.com.mycompany.game;

public abstract class Survivor extends Character {
    public Survivor(int health, int attack) {
        super(health, attack);
    }

    // This method will be used to display information about the type of zombie
    public abstract String getType();

    // To count the number of survivor of a specific type
    public static int countSurvivorType(Survivor[] survivors, String type) {
        int count = 0;

        // Count the type
        for (Survivor survivor : survivors) {
            if (survivor.getType().equalsIgnoreCase(type)) {
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
        setHealth(getHealth() - attack);
    }
}

class Scientist extends Survivor {
    private int health;

    public Scientist() {
        super(20, 2);
    }

    @Override
    public String getType() {
        return "Scientist";
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

class Civilian extends Survivor {
    private int health;

    public Civilian() {
        super(50, 5);
    }

    @Override
    public String getType() {
        return "Civilian";
    }

    public int getHealth(){
        return health;
    }

    @Override 
    public void setHealth(int health){
        this.health = health;
    }
}

class Soldier extends Survivor {
    private int health;

    public Soldier() {
        super(100, 10);
    }

    @Override
    public String getType() {
        return "Soldier";
    }

    public int getHealth(){
        return health;
    }

    @Override 
    public void setHealth(int health){
        this.health = health;
    }
}