package com.pkg.ArrayList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CompareLinkedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 40, 60);
        List<Integer> list2 = Arrays.asList(10, 20, 40, 60);
        List<Integer> list3 = Arrays.asList(10, 20, 40, 70, 80);

//        ✅ Method 1: Using equals() Method
/*        boolean equals1 = list1.equals(list2);
        boolean equals2 = list2.equals(list3);
        System.out.println(equals1);
        System.out.println(equals2);*/

//        ✅ Method 2: Manual Comparison
        boolean isEqual = true;
        if(list1.size() != list3.size()) isEqual = false;
        else {
            for(int i = 1; i < list1.size(); i++) {
                if(!list1.get(i).equals(list2.get(i))) {
                    isEqual = false;
                    break;
                }
            }
        }
        System.out.println(isEqual);

//        ✅ Method 3: Using containsAll() Method
/*        boolean contains1 = list1.containsAll(list2);
        boolean contains2 = list1.containsAll(list3);
        System.out.println(contains1);
        System.out.println(contains2);*/

    }
}
