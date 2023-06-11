package Game.src.main.java.com.mycompany.game;

public abstract class Character {
    private int health;
    private int attack;
    private int kills;

    public Character(int health, int attack) {
        this.health = health;
        this.attack = attack;
        this.kills = 0;
    }

    // Getter
    public int getHealth() {
        return health;
    }

    // Setter
    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public int getKills() {
        return kills;
    }

    // To increment the kill count of the character
    public void incrementKills() {
        kills++;
    }

    public abstract String getType();

    public void attack(Character target) {
        target.setHealth(target.getHealth() - attack);
    }
}