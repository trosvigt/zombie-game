package Game.src.main.java.com.mycompany.game;

import java.util.List;

public abstract class Survivor extends Character {
    public Survivor(int health, int attack) {
        super(health, attack);
    }

    // To count the number of survivor of a specific type
    public static int countSurvivorType(List<Survivor> survivors, String type) {
        int count = 0;

        // Count the type
        for (Survivor survivor : survivors) {
            if (survivor.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }

        return count;
    }
}

class Scientist extends Survivor {
    private static int id;

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
    private static int id;

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
    private static int id;

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