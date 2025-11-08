package com.pkg.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(100);
        list.add(60);

//        1. 🔁 Using a Loop (No Sorting)
/*        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println(largest);
        System.out.println(secondLargest);
        for(int number : list) {
            if(number > largest) {
                secondLargest = largest;
                largest = number;
            } else if(number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        System.out.println(secondLargest);*/

//        2. 🧮 Using Sorting
/*        list.sort(Comparator.reverseOrder());
        System.out.println(list.get(1));*/

//        3. 🧠 Using Java 8 Streams
        List<Integer> sorted = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        if(sorted.size() >= 2) {
            System.out.println(sorted.get(1));
        } else {
            System.out.println("size of list is less than 2");
        }

//        Would you like to handle edge cases like duplicates or empty lists more robustly? I can help you wrap this into a reusable method too.
    }
}
