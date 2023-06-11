package Game.src.main.java.com.mycompany.game;

public abstract class Survivor extends Character {
    public Survivor(int health, int attack) {
        super(health, attack);
    }

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

    // This method will check if the survivor is alive
    public boolean isAlive(){
        return getHealth() > 0;
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