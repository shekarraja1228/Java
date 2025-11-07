import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }
}

public class SortStrings {
    public static void main(String[] args) {
//      1. Write a program to sort an ArrayList of Strings alphabetically.
        List<String> alphabets = new ArrayList<>();
        alphabets.add("Z");
        alphabets.add("C");
        alphabets.add("A");
/*//      ✅ 1. Using Collections.sort()
        Collections.sort(alphabets);
        System.out.println(alphabets);*/

//        ✅ 2. Using list.sort() with Comparator
/*        alphabets.sort(Comparator.naturalOrder());
        System.out.println(alphabets);*/

/*        alphabets.sort((a,b) -> a.compareTo(b));
        System.out.println(alphabets);*/

/*//        ✅ 3. Using Streams (creates a new list)
        List<String> sortedList = alphabets.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);*/

//        ✅ 4. Reverse Alphabetical Order
        alphabets.add("P");
/*        alphabets.sort(Comparator.reverseOrder());
        System.out.println(alphabets);*/

/*        Collections.sort(alphabets, Comparator.reverseOrder());
        System.out.println(alphabets);*/

//        ✅ 5. Case-Insensitive Sort (if you had mixed case)
/*        alphabets.add("b");
        alphabets.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(alphabets);*/

/*        alphabets.add("b");
        alphabets.sort((a,b) -> a.compareToIgnoreCase(b));
        System.out.println(alphabets);*/

//        ✅ 6. Using TreeSet (removes duplicates, auto-sorts)
        Set<String> list = new TreeSet<>(alphabets);
        System.out.println(list);




//        List<String> sortedAlphas1 = alphabets.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedAlphas1);
//        List<String> sortedAlphas2 = alphabets.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(sortedAlphas2);
//        alphabets.add("P");
//        Collections.sort(alphabets);
//        System.out.println(alphabets);
//        alphabets.add("B");
//        alphabets.sort(String::compareTo);
    }
}