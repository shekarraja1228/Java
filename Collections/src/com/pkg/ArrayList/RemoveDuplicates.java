package com.pkg.ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
            List<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Apple");
            fruits.add("grapes");
            fruits.add("Apple");
            System.out.println(fruits);

//            1. 🧹 Using a Set (Simple and Efficient)

/*            LinkedHashSet<String> removeDuplicatesButPreserveInsertionOrder = new LinkedHashSet<>(fruits);
            fruits.clear();
            fruits.addAll(removeDuplicatesButPreserveInsertionOrder);
            System.out.println(fruits);*/

//            2. 🧠 Using Java 8 Streams

/*           List<String> uniqueFruits = fruits.stream().distinct().collect(Collectors.toList());
            System.out.println(uniqueFruits);*/

//            3. 🔁 Manual Check with Loop

            List<String> uniqueFruits = new ArrayList<>();
            for(String fruit : fruits) {
                    if(!uniqueFruits.contains(fruit)) {
                            uniqueFruits.add(fruit);
                    }
            }
            System.out.println(uniqueFruits);

//            Would you like to adapt this for other data types like String or create a reusable method for any list?
    }
}
