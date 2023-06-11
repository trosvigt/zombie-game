package Game.src.main.java.com.mycompany.game;

public abstract class Character {
    private int health;
    private int attack;
    private int instance_id;

    public Character(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    protected int getHealth() {
        return health;
    }

    protected int getAttack() {
        return attack;
    }

    protected int getId() {
        return instance_id;
    }

    protected abstract String getType();

    protected void setHealth(int health) {
        this.health = health;
    }

    protected void setId(int id) {
        this.instance_id = id;
    }

    protected void attack(Character target) {
        target.setHealth(target.getHealth() - attack);
    }

    // This method will check if the survivor is alive
    protected boolean isAlive(){
        return getHealth() > 0;
    }

    @Override
    public String toString() {
        return String.format("%s %s",
            getType(), getId());
    }
}