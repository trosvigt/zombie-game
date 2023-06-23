package com.mycompany.game;

import java.util.Random;

public class RandomUtility {
  private static Random random = new Random();
  
  // This method will return a random int between
  // low (inclusive) and high (exclusive)
  public static int getRandomNumber(int low, int high) {
      return random.nextInt(high - low) + low;
  }
}