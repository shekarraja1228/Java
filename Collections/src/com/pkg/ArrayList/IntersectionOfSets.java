package com.pkg.ArrayList;

import java.util.*;

public class IntersectionOfSets {

    public static <T> Set<T> intersectAll(List<Set<T>> sets) {
        if(sets == null && sets.isEmpty()) return Collections.emptySet();
        Set<T> result = new HashSet<>(sets.get(0));
        for(int i = 1; i < sets.size(); i++) {
            result.retainAll(sets.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30, 40));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(20, 30, 50));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(30, 20, 60));

//        ✅ Java Program: Intersection of Multiple Sets
/*        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        intersection.retainAll(set3);

        System.out.println(intersection);*/

//        🔄 Bonus: Generic Method for Any Number of Sets
        List<Set<Integer>> allSets = Arrays.asList(set1, set2, set3);
        Set<Integer> intersection = intersectAll(allSets);
        System.out.println(intersection);

//        Would you like to adapt this to work with Set<String> or other data types?
    }
}
