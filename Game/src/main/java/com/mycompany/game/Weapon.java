package com.mycompany.game;

public abstract class Weapon {
    private int damage;
    private int accuracy;
    
    public Weapon(int damage, int accuracy) {
        this.damage = damage;
        this.accuracy = accuracy;
    }   

    protected int getDamage() {
        return damage;
    }

    protected int getAccuracy() {
        return accuracy;
    }
    
    public abstract String getType();
}

class Pistol extends Weapon {
    public Pistol() {
        super(20, 80);
    }

    @Override
    public String getType() {
        return "Pistol";
    }
}

class Shotgun extends Weapon {
    public Shotgun() {
        super(70, 60);
    }

    @Override
    public String getType() {
        return "Shotgun";
    }
}

class SubmachineGun extends Weapon {
    public SubmachineGun() {
        super(25, 90);
    }

    @Override
    public String getType() {
        return "Submachine Gun";
    }
}

class AssaultRifle extends Weapon {
    public AssaultRifle() {
        super(30, 80);
    }

    @Override
    public String getType() {
        return "Assault Rifle";
    }
}

class Axe extends Weapon {
    public Axe() {
        super(50, 50);
    }

    @Override
    public String getType() {
        return "Axe";
    }
}

class Crowbar extends Weapon {
    public Crowbar() {
        super(40, 70);
    }

    @Override
    public String getType() {
        return "Crowbar";
    }
}

class FryingPan extends Weapon {
    public FryingPan() {
        super(5, 70);
    }

    @Override
    public String getType() {
        return "Frying Pan";
    }
}