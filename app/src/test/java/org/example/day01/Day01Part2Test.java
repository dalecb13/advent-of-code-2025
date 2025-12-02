package org.example.day01;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Day01Part2Test {
    @Test
    public void rotateRight() {
        List<String> instructions = List.of("L68", "L30", "R48", "L5", "R60", "L55", "L1", "L99", "R14", "L82");
        int result = Day01Part2.run(instructions, 50);
        assertEquals(result, 6);
    }
}
