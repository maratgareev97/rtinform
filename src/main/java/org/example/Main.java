package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static <T> Map<T, Integer> countElements(List<T> list) {
        return list.stream()
                .collect(Collectors.toMap(
                        element -> element,
                        element -> 1,
                        Integer::sum
                ));
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> result = countElements(list);
        System.out.println(result);
    }
}


