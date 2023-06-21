package com.mycompany.game;

public class WeaponFactory {
  public Survivor returnInstance = null;

  // This method will return a random instance of weapon
  public Survivor getSurvivorInstance(int weapon) {
    // Depending on the weapon...
    switch (weapon) {
      case 1: {
          // ...

          break;
      }
      default: {
          System.out.println("Unable to create Weapon...");
          break;
      }
    }

    return returnInstance;
  }
}