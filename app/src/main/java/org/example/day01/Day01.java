package org.example.day01;

import java.util.List;

public class Day01 {
    public static int rotateRight(int currentNumber, int steps) {
        int newNumber = currentNumber + steps;
        if (newNumber == 100) {
            newNumber = 0;
        } else if (newNumber > 100) {
            newNumber = newNumber % 100;
        }
        return newNumber;
    }
    public static int rotateLeft(int currentNumber, int steps) {
        int newNumber = currentNumber - steps;
        while (newNumber < 0) {
            newNumber = newNumber + 100;
        }
        return newNumber;
    }
    public static int runPartOne(List<String> instructions, int currentNumber) {
        int numZeroes = 0;
        for (String instruction : instructions) {
            String direction = instruction.substring(0, 1);
            int distance = Integer.parseInt(instruction.substring(1));
            
            if (direction.equals("R")) {
                currentNumber = rotateRight(currentNumber, distance);
            } else if (direction.equals("L")) {
                currentNumber = rotateLeft(currentNumber, distance);
            }

            if (currentNumber == 0) {
                numZeroes++;
            }
        }
        return numZeroes;
    }
}
