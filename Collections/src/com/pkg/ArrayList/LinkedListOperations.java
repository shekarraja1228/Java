package com.pkg.ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Att");
        list.add("Equifax");
        list.add("Att");
        list.add("Norfolk");
        list.add("unigo");

        Iterator<String> loop = list.iterator();
        while(loop.hasNext()) {
            System.out.println(loop.next());
        }
        list.remove("Att");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.add("Dixen");
        System.out.println(list);
        list.addLast("Dixen");
        System.out.println(list);
        list.addFirst("Att");
        System.out.println(list);

        for (String fru : list) {
            System.out.print(fru + " ");
        }
        System.out.println();
    }

//    Would you like to see how to use a LinkedList with custom objects or sort the list?
}
