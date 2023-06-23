package com.mycompany.game;

public class WeaponFactory {
  public Weapon returnInstance = null;

  // This method will return a random instance of weapon
  public Weapon getSurvivorInstance(int weapon) {
    // Depending on the weapon...
    switch (weapon) {
        case 1: {
            // Create civilian
            returnInstance = new Pistol();
            break;
        }
        case 2: {
            // Create scientist
            returnInstance = new Shotgun();
            break;
        }
        case 3: {
            // Create soldier
            returnInstance = new SubmachineGun();
            break;
        }
        case 4: {
            // Create soldier
            returnInstance = new AssaultRifle ();
            break;
        }
        case 5: {
            // Create civilian
            returnInstance = new Axe();
            break;
        }
        case 6: {
            // Create scientist
            returnInstance = new Crowbar();
            break;
        }
        case 7: {
            // Create soldier
            returnInstance = new FryingPan();
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