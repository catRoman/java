package tests;

import application.LabThreeApp;
import application.util.Helper;

public class ApplicationMethodTests {
    public static void main(String[] args){
      chanceTest(0.5f);
      Helper.pressEnterContinue();
      testWait(5);
      chanceTest(0.3f);
      boolean cont = Helper.continueCustom("continue");
      System.out.println("Continue? " + cont);
      cont = Helper.continueCustom("start a new game");
      testWait(2);
      System.out.println("start new game? " + cont);
      LabThreeApp.printTitleScreen();


    }
    public static void chanceTest(float chance){
        int heads = 0, tails = 0;
        for(int i = 0; i < 1000000; i++){
            if(Helper.getRandomChance(chance))
                    heads++;
                else
                    tails++;
        }
        System.out.println("Number of heads @"+ (chance*100) +"%: " + heads);
        System.out.println("Number of tails @"+ (100-chance*100) +"%: " + tails);
        System.out.println();
    }
    public static void testWait(int seconds){
        long startTime = System.currentTimeMillis();
        Helper.wait(seconds);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + " milli seconds");
    }
}
