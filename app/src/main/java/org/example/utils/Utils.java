package org.example.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static List<String> readResource(String resourcePath) {
        try (InputStream is = Utils.class.getClassLoader().getResourceAsStream(resourcePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            return reader.lines().collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Failed to read resource: " + resourcePath, e);
        }
    }
}
