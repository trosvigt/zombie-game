/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game.src.main.java.com.mycompany.game;

/**
 *
 * @author Ziqi
 */
public abstract class Character {
    //Represents the initial health of the character.
    private int initialHealth;
    //Represents the current health of the character.
    private int currentHealth;
    private int attack;
    //Represents the number of kills.
    private int kills;

    public Character(int initialHealth, int attack) {
        this.initialHealth = initialHealth;
        this.currentHealth = initialHealth;
        this.attack = attack;
        this.kills = 0;
    }

    //getter
    public int getInitialHealth() {
        return initialHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    //setter
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getKills() {
        return kills;
    }

    //To increment the kill count of the character
    public void incrementKills() {
        kills++;
    }

    public abstract String getType();

    public void attack(Character target) {
        target.setCurrentHealth(target.getCurrentHealth() - attack);
    }
}
