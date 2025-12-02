package org.example;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;
import org.example.day01.Day01;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Day01Test {
    @Test
    public void rotateRight() {
        List<Pair<Pair<Integer, Integer>, Integer>> testCases = List.of(
            Pair.of(Pair.of(50, 50), 0),
            Pair.of(Pair.of(50, 1), 51),
            Pair.of(Pair.of(50, 49), 99),
            Pair.of(Pair.of(50, 51), 1),
            Pair.of(Pair.of(50, 99), 49),
            Pair.of(Pair.of(0, 99), 99),
            Pair.of(Pair.of(99, 1), 0),
            Pair.of(Pair.of(99, 99), 98),
            Pair.of(Pair.of(0, 1), 1),
            Pair.of(Pair.of(11, 8), 19),
            Pair.of(Pair.of(5, 10), 15),
            Pair.of(Pair.of(95, 5), 0)
        );

        for (Pair<Pair<Integer, Integer>, Integer> testCase : testCases) {
            int currentNumber = testCase.getLeft().getLeft();
            int steps = testCase.getLeft().getRight();
            int result = Day01.rotateRight(currentNumber, steps);
            int expectedResult = testCase.getRight();
            assertEquals(result, expectedResult);
        }
    }

    @Test
    public void rotateLeft() {
        List<Pair<Pair<Integer, Integer>, Integer>> testCases = List.of(
            Pair.of(Pair.of(50, 50), 0),
            Pair.of(Pair.of(50, 1), 49),
            Pair.of(Pair.of(50, 49), 1),
            Pair.of(Pair.of(50, 51), 99),
            Pair.of(Pair.of(99, 1), 98),
            Pair.of(Pair.of(99, 2), 97),
            Pair.of(Pair.of(99, 99), 0),
            Pair.of(Pair.of(99, 98), 1),
            Pair.of(Pair.of(0, 1), 99),
            Pair.of(Pair.of(0, 2), 98),
            Pair.of(Pair.of(0, 99), 1),
            Pair.of(Pair.of(0, 98), 2),
            Pair.of(Pair.of(19, 19), 0),
            Pair.of(Pair.of(5, 10), 95)
        );

        for (Pair<Pair<Integer, Integer>, Integer> testCase : testCases) {
            int currentNumber = testCase.getLeft().getLeft();
            int steps = testCase.getLeft().getRight();
            int result = Day01.rotateLeft(currentNumber, steps);
            int expectedResult = testCase.getRight();
            assertEquals(result, expectedResult);
        }
    }

    @Test
    public void runSample() {
        List<String> instructions = List.of("L68",
            "L30",
            "R48",
            "L5",
            "R60",
            "L55",      
            "L1",
            "L99",
            "R14",
            "L82");
        int result = Day01.runPartOne(instructions, 50);
        assertEquals(result, 3);
    }

    @Test
    public void runSample2() {
        List<String> instructions = List.of("R27",
            "R47",
            "R21",
            "L37",
            "R5",
            "L48",      
            "R16",
            "L21",
            "R34",
            "R28",
            "R12",
            "L34",
            "R45",
            "R12",
            "L39",
            "R36",
            "L25",
            "R16",
            "R43",
            "R18",
            "L27",
            "R12",
            "R48",
            "L50",
            "L25",
            "R24",
            "L30",
            "L47",
            "R12",
            "R1",
            "R38",
            "R21",
            "R1",
            "L39",
            "L15",
            "L27",
            "L26",
            "L20",
            "L47",
            "L41",
            "R23",
            "R30",
            "L11",
            "L31",
            "L5",
            "L3",
            "L16");
        int result = Day01.runPartOne(instructions, 50);
        assertEquals(result, 1);
    }

    @Test
    public void runManual() {
        List<Triple<Pair<Integer, Integer>, String, Integer>> testCases = List.of(
            Triple.of(Pair.of(50, 68), "left", 82),
            Triple.of(Pair.of(82, 30), "left", 52),
            Triple.of(Pair.of(52, 48), "right", 0),
            Triple.of(Pair.of(0, 5), "left", 95),
            Triple.of(Pair.of(95, 60), "right", 55),
            Triple.of(Pair.of(55, 55), "left", 0),
            Triple.of(Pair.of(0, 1), "left", 99),
            Triple.of(Pair.of(99, 99), "left", 0),
            Triple.of(Pair.of(0, 14), "right", 14),
            Triple.of(Pair.of(14, 82), "left", 32)
        );

        for (Triple<Pair<Integer, Integer>, String, Integer> testCase : testCases) {
            int currentNumber = testCase.getLeft().getLeft();
            int steps = testCase.getLeft().getRight();
            String direction = testCase.getMiddle();
            if (direction.equals("left")) {
                currentNumber = Day01.rotateLeft(currentNumber, steps);
            } else if (direction.equals("right")) {
                currentNumber = Day01.rotateRight(currentNumber, steps);
            }
            int expectedResult = testCase.getRight();
            assertEquals(currentNumber, expectedResult);
        }
    }
}
