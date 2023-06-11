package Game.src.main.java.com.mycompany.game;

public abstract class Character {
    private int health;
    private int attack;
    private int instance_id;

    public Character(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getId() {
        return instance_id;
    }

    public abstract String getType();

    public void setHealth(int health) {
        this.health = health;
    }

    public void setId(int id) {
        this.instance_id = id;
    }

    public void attack(Character target) {
        target.setHealth(target.getHealth() - attack);
    }

    @Override
    public String toString() {
        return String.format("Type: %s, Health: %s, Damage: %s",
            getType(), getHealth(), getAttack());
    }
}