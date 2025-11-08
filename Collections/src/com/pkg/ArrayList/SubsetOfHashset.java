package com.pkg.ArrayList;

import java.awt.datatransfer.StringSelection;
import java.util.*;

public class SubsetOfHashset {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Att", "Equifax", "Att", "norfolk");
        List<String> list2 = Arrays.asList("Att", "Equifax", "Att", "norfolk", "Dexian");
        Set<String> set1 = new HashSet<>(list1);
        Set<String> set2 = new HashSet<>(list2);
        boolean containsAll = set1.containsAll(set2);
        System.out.println(containsAll);
    }
}
