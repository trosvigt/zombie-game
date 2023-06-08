/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author Ziqi
 */
public class Survivor extends Character {

    public Survivor(String type, int initialHealth, int attack) {
        super(type, initialHealth, attack);
    }
}

class Scientist extends Survivor {

    public Scientist() {
        super("Scientist", 20, 2);
    }
}

class Civilian extends Survivor {

    public Civilian() {
        super("Civilian", 50, 5);
    }
}

class Soldier extends Survivor {

    public Soldier() {
        super("Soldier", 100, 10);
    }
}