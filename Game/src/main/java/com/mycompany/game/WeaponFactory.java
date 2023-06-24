package com.mycompany.game;

public class WeaponFactory {
  public Weapon returnInstance = null;

  // This method will return a random instance of weapon
  public Weapon getWeaponInstance(int weapon) {
    // Depending on the weapon...
    switch (weapon) {
        case 1: {
            // Create Pistol
            returnInstance = new Pistol();
            break;
        }
        case 2: {
            // Create Shotgun
            returnInstance = new Shotgun();
            break;
        }
        case 3: {
            // Create Submachine Gun
            returnInstance = new SubmachineGun();
            break;
        }
        case 4: {
            // Create Assult Rifle
            returnInstance = new AssaultRifle ();
            break;
        }
        case 5: {
            // Create Axe
            returnInstance = new Axe();
            break;
        }
        case 6: {
            // Create Crowbar
            returnInstance = new Crowbar();
            break;
        }
        case 7: {
            // Create Frying Pan
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