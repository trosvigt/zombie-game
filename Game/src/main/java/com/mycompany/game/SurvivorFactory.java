package com.mycompany.game;

public class SurvivorFactory {
  public Survivor returnInstance = null;

  public Survivor getSurvivorInstance(int survivor) {
    // Depending on the survivor...
    switch (survivor) {
      case 1: {
          // Create civilian
          returnInstance = new Civilian();
          break;
      }
      case 2: {
          // Create scientist
          returnInstance = new Scientist();
          break;
      }
      case 3: {
          // Create soldier
          returnInstance = new Soldier();
          break;
      }
      default: {
          System.out.println("Unable to create Survivor...");
          break;
      }
    }

    return returnInstance;
  }
}