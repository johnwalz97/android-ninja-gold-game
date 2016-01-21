package com.johnwwalz.ninjagold;

import java.util.Random;

/**
 * Created by john on 1/15/2016.
 */
public class NinjaGoldGame {
    private int totalGold;
    public NinjaGoldGame() {
        this.totalGold = 0;
    }
    public String gameTurnWith(String choice) {
        int gold;
        if(choice.equals("FARM")) {
            gold = new Random().nextInt(11) + 10;
        } else if (choice.equals("CAVE")) {
            gold = new Random().nextInt(6) + 5;
        } else if (choice.equals("HOUSE")) {
            gold = new Random().nextInt(4) + 2;
        } else if (choice.equals("CASINO")) {
            int coinFlip = new Random().nextInt(2);
            gold = new Random().nextInt(50);
            if(coinFlip == 0) {
                gold *= -1;
            }
        } else {
            gold = 0;
        }
        String result;
        if(gold > 0) {
            result = "You chose " + choice + " and earned " + gold;
        } else if(gold < 0) {
            result = "You chose " + choice + " and lost " + gold;
        } else {
            result = "You chose " + choice + " and didn't earn anything";
        }
        totalGold += gold;
        return result;
    }
    public String totalGold() {
        return "" + totalGold;
    }
}