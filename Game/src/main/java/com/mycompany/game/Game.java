/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.game;

import java.util.Random;

/**
 *
 * @author Ziqi
 */
public class Game {

    private static Random random = new Random();

    public static void main(String[] args) {
        //to create an array of characters representing the survivors
        Character[] survivors = generateRandomCharacters(17, "survivor");
        Character[] zombies = generateRandomCharacters(8, "zombie");

        //for cauculate how many survivors made it in displayStsts() method.
        int survivorsMadeIt = battle(survivors, zombies);
        displayStats(survivors, zombies, survivorsMadeIt);

    }

    public static Character[] generateRandomCharacters(int count, String type) {

    }

    public static Survivor getRandomSurvivor() {

    }

    public static Zombie getRandomZombie() {

    }

    public static int battle(Character[] survivors, Character[] zombies) {
        //return survivorsMadeIt
    }

    public static void survivorAttack(Character[] survivors, Character[] zombies) {

    }

    public static void zombieAttack(Character[] zombies, Character[] survivors) {

    }

    //This method checks if all the survivors in the game are dead
    public static boolean areAllSurvivorsDead(Character[] survivors) {

    }

    public static boolean areAllZombiesDead(Character[] zombies) {

    }

    public static void displayStats(Character[] survivors, Character[] zombies, int survivorsMadeIt) {
        System.out.println("We have " + survivors.length + " survivors trying to make it to safety.\n");
        System.out.println("But there are " + zombies.length + " zombies waiting for them.\n");
        System.out.println("It seems " + survivorsMadeIt + " have made it to safety.");

    }

}
