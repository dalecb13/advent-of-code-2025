package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.utils.Utils;
import java.util.List;

public class UtilsTest {
    @Test
    public void testReadFileContents() {
        List<String> contents = Utils.readResource("inputs/test.txt");
        assertEquals(contents.size(), 1);
        assertEquals(contents.get(0), "Hello, World!");
    }
}
