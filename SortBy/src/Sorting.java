/**
 * Created by Dyvak on 20.11.2016.
 */

import java.util.*;

/**
 * Simple class, that sort array by number element's occurrences
 */
public class Sorting {
    public static void main(String[] args) {
        /* Array to sort */
        int[] arr = {9, 4, 3, 3, 7, 8, 8, 8, 4, 12, 2, 2, 1, 3, 3, 4, 5, 6, 7, 8};
        sortingBy(arr);
    }

    private static void sortingBy(int[] array) {
        Map<Integer, Set<Integer>> entryTree = new TreeMap<>();
        Map<Integer, Integer> entryMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (entryMap.containsKey(array[i])) {
                entryMap.replace(array[i], entryMap.get(array[i]),
                        entryMap.get(array[i]) + 1);
            } else {
                entryMap.put(array[i], 1);
            }
        }
        for (Integer elem : entryMap.keySet()) {
            if (!entryTree.containsKey(entryMap.get(elem))) {
                Set<Integer> set = new HashSet<>();
                set.add(elem);
                entryTree.put(entryMap.get(elem), set);
            } else {
                entryTree.get(entryMap.get(elem)).add(elem);
            }
        }
        for (Integer i : entryTree.keySet()) {
            System.out.println(i+"--->"+ entryTree.get(i).toString());
        }
        List<Integer> result = new ArrayList<>();
        for (Integer entryNumber : entryTree.keySet()) {
            for (Integer setElement : entryTree.get(entryNumber)) {
                for (int i = 0; i < entryNumber; i++) {
                    result.add(setElement);
                }
            }
        }
        System.out.println("Result: " + result.toString());
    }
}

