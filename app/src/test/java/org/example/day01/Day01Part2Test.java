package org.example.day01;

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Day01Part2Test {
    class Part2TestCase {
        int startPosition;
        int distance;
        int expectedNumZeroes;
        int expectedFinalPosition;

        public Part2TestCase(int startPosition, int distance, int expectedNumZeroes, int expectedFinalPosition) {
            this.startPosition = startPosition;
            this.distance = distance;
            this.expectedNumZeroes = expectedNumZeroes;
            this.expectedFinalPosition = expectedFinalPosition;
        }

        public int getStartPosition() {
            return startPosition;
        }

        public int getDistance() {
            return distance;
        }

        public int getExpectedNumZeroes() {
            return expectedNumZeroes;
        }

        public int getExpectedFinalPosition() {
            return expectedFinalPosition;
        }
    }

    @Test
    public void rotateRight() {
        List<String> instructions = List.of("L68", "L30", "R48", "L5", "R60", "L55", "L1", "L99", "R14", "L82");
        int result = Day01Part2.run(instructions, 50);
        assertEquals(result, 6);
    }

    @Test
    public void rotateRightLarge() {
        List<Part2TestCase> testCases = List.of(
            new Part2TestCase(50, 200, 2, 50),
            new Part2TestCase(50, 250, 3, 0),
            new Part2TestCase(0, 233, 2, 33),
            new Part2TestCase(99, 233, 3, 32),
            new Part2TestCase(69, 331, 4, 0)
        );

        for (Part2TestCase testCase : testCases) {
            int startPosition = testCase.getStartPosition();
            int distance = testCase.getDistance();
            int expectedNumZeroes = testCase.getExpectedNumZeroes();
            int expectedFinalPosition = testCase.getExpectedFinalPosition();

            Pair<Integer, Integer> result = Day01Part2.rotateRight(startPosition, distance, 0);
            int actualNumZeroes = result.getRight();
            int actualFinalPosition = result.getLeft();
            assertEquals(expectedNumZeroes, actualNumZeroes);
            assertEquals(expectedFinalPosition, actualFinalPosition);
        }
    }

    @Test
    public void rotateLeftLarge() {
        List<Part2TestCase> testCases = List.of(
            new Part2TestCase(1, 1, 1, 0),
            new Part2TestCase(1, 101, 2, 0),
            new Part2TestCase(50, 250, 3, 0),
            new Part2TestCase(0, 233, 2, 67),
            new Part2TestCase(50, 200, 2, 50),
            new Part2TestCase(99, 233, 2, 66),
            new Part2TestCase(69, 331, 3, 38)
        );

        for (Part2TestCase testCase : testCases) {
            int startPosition = testCase.getStartPosition();
            int distance = testCase.getDistance();
            int expectedNumZeroes = testCase.getExpectedNumZeroes();
            int expectedFinalPosition = testCase.getExpectedFinalPosition();

            Pair<Integer, Integer> result = Day01Part2.rotateLeft(startPosition, distance, 0);
            int actualNumZeroes = result.getRight();
            int actualFinalPosition = result.getLeft();
            assertEquals(expectedNumZeroes, actualNumZeroes);
            assertEquals(expectedFinalPosition, actualFinalPosition);
        }
    }
}
