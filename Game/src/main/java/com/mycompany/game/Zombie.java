/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author Ziqi
 */
class Zombie extends Character {

    public Zombie(String type, int initialHealth, int attack) {
        super(type, initialHealth, attack);
    }
}

class CommonInfected extends Zombie {

    public CommonInfected() {
        super("Common Infected", 30, 5);
    }
}

class Tank extends Zombie {

    public Tank() {
        super("Tank", 150, 20);
    }
}
