package org.example;

import java.util.List;

import org.example.utils.Utils;

public class Day01 {
    public static int runSample(List<String> instructions) {
        int numZeroes = 0;
        int currentNumber = 50;
        for (String instruction : instructions) {
            String direction = instruction.substring(0, 1);
            int steps = Integer.parseInt(instruction.substring(1));
            
            if (direction.equals("R")) {
                currentNumber += steps;
                if (currentNumber > 100) {
                    currentNumber = currentNumber - 100;
                }
            } else if (direction.equals("L")) {
                currentNumber -= steps;
                if (currentNumber < 0) {
                    currentNumber = 100 + currentNumber;
                }
            }

            if (currentNumber == 100) {
                currentNumber = 0;
            }

            if (currentNumber == 0) {
                numZeroes++;
            }
        }
        return numZeroes;
    }

    public static void runPart1() {
        List<String> contents = Utils.readResource("inputs/day1.txt");
    }
}
