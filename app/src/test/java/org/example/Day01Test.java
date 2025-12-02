package org.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Day01Test {
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
        int result = Day01.runSample(instructions);
        assertEquals(result, 3);
    }
}
