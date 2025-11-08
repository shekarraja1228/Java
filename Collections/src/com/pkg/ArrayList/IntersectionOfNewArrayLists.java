package com.pkg.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfNewArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);

//        ✅ Method 1: Using retainAll()
/*        ArrayList<Integer> commonNumbers = new ArrayList<>(list1);
        commonNumbers.retainAll(list2);
        System.out.println(commonNumbers);*/

//        ✅ Method 2: Using Java 8 Streams
/*        List<Integer> commonNumbers = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(commonNumbers);*/

//        ✅ Method 3: Using Set for Better Performance
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        System.out.println(set1);

//        Would you like to see how to find the union or difference of two lists as well?
    }
}
