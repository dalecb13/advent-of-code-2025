package org.example.day01;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class Day01Part2 {
    public static Pair<Integer, Integer> rotateRight(int currentNumber, int distance, int numZeroes) {
        for (int i = 0; i < distance; i++) {
            currentNumber++;
            if (currentNumber == 100) {
                currentNumber = 0;
                numZeroes++;
            }
        }
        return Pair.of(currentNumber, numZeroes);
    }

    public static Pair<Integer, Integer> rotateLeft(int currentNumber, int distance, int numZeroes) {
        for (int i = 0; i < distance; i++) {
            currentNumber--;
            if (currentNumber == -1) {
                currentNumber = 99;
                numZeroes++;
            }
        }
        return Pair.of(currentNumber, numZeroes);
    }

    public static int run(List<String> instructions, int currentNumber) {
        int numZeroes = 0;
        for (String instruction : instructions) {
            String direction = instruction.substring(0, 1);
            int distance = Integer.parseInt(instruction.substring(1));

            if (direction.equals("R")) {
                Pair<Integer, Integer> rotateRightResult = rotateRight(currentNumber, distance, numZeroes);
                currentNumber = rotateRightResult.getLeft();
                numZeroes = rotateRightResult.getRight();
            } else if (direction.equals("L")) {
                Pair<Integer, Integer> rotateLeftResult = rotateLeft(currentNumber, distance, numZeroes);
                currentNumber = rotateLeftResult.getLeft();
                numZeroes = rotateLeftResult.getRight();
            }
        }
        return numZeroes;
    }
}
