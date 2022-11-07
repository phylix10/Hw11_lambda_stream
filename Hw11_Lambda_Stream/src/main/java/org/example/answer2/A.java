package org.example.answer2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen");
        Map<Integer,List<String>> map= string.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map.values());
    }
}
