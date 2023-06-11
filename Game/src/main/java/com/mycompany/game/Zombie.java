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

class CommonInfected extends Zombie {
    private int initialHealth;
    public CommonInfected() {
        super(30, 5);
    }

    @Override
    public String getType() {
        return "Common Infected";
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

class Tank extends Zombie {
    private int initialHealth;
    public Tank() {
        super(150, 20);
    }

    @Override
    public String getType() {
        return "Tank";
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
