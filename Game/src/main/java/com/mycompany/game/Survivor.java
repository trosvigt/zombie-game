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
    public abstract int getHealth(); 
    public abstract void setHealth(int initialHealth);
    //This method will check if the survivor is alive
    public boolean isAlive(){
        return getHealth()>0;
    }
    //This method will deccrease their health when zommbies attack
    public void takeDamage(int attack){
        setHealth(getHealth()-attack);
    
    }
    
}

class Scientist extends Survivor {
    private int initialHealth;
    public Scientist() {
        super(20, 2);
    }

    @Override
    public String getType() {
        return "Scientist";
    }
    @Override
    public int getHealth(){
        return initialHealth;
    }
    @Override 
    public void setHealth(int initialHealth){
        this.initialHealth=initialHealth;
    }
}

class Civilian extends Survivor {
    private int initialHealth;
    public Civilian() {
        super(50, 5);
    }

    @Override
    public String getType() {
        return "Civilian";
    }
    public int getHealth(){
        return initialHealth;
    }
    @Override 
    public void setHealth(int initialHealth){
        this.initialHealth=initialHealth;
    }
}

class Soldier extends Survivor {
    private int initialHealth;
    public Soldier() {
        super(100, 10);
    }

    @Override
    public String getType() {
        return "Soldier";
    }
    public int getHealth(){
        return initialHealth;
    }
    @Override 
    public void setHealth(int initialHealth){
        this.initialHealth=initialHealth;
    }
}
