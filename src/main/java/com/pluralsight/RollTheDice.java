package com.pluralsight;

public class RollTheDice {

    // Class to simulate a dice roll
    static class Dice {
        // Method that returns a random number between 1 and 6
        public int roll() {
            return (int)(Math.random() * 6) + 1;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Dice class
        Dice dice = new Dice();

        // Variables to store the dice rolls
        int roll1, roll2;

        // Counters to count how many times the sums 2, 4, 6, and 7 are rolled
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        // Loop to roll the dice 20 times
        for (int i = 0; i < 20; i++) {
            // Roll the dice twice
            roll1 = dice.roll();
            roll2 = dice.roll();

            // Calculate the sum of the two rolls
            int sum = roll1 + roll2;

            // Print the result of each roll and the sum
            System.out.println("Roll " + (i+1) + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            // Check if the sum is 2, 4, 6, or 7 and update the corresponding counters
            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }

        // After the loop, display the number of times 2, 4, 6, and 7 were rolled
        System.out.println("Number of times sum is 2: " + twoCounter);
        System.out.println("Number of times sum is 4: " + fourCounter);
        System.out.println("Number of times sum is 6: " + sixCounter);
        System.out.println("Number of times sum is 7: " + sevenCounter);
        
    }

}
