package com.mycompany.game;

public class ZombieFactory {
  public Zombie returnInstance = null;

  // This method will return a random instance of Zombie
  public Zombie getZombieInstance(int zombie) {
    // Depending on zombie...
    switch (zombie) {
      // Common infected case
      case 1: {
          // Create common infected
          returnInstance = new CommonInfected();
          break;
      }
      // Tank case
      case 2: {
          // Create tank
          returnInstance = new Tank();
          break;
      }
      default: {
          System.out.println("Unable to create Zombie...");
          break;
      }
    }

    return returnInstance;
  }
}