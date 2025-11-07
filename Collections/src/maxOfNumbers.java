import java.util.*;

public class maxOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(2);
        numbers.add(4);

//        1. 🧰 Using Collections.max()
/*        int maxNumber = Collections.max(numbers);
        System.out.println(maxNumber);*/

//        2. 🧮 Using a Simple Loop
/*        int max = numbers.get(0);
        for(int number : numbers) {
            if(number > max) {
                max = number;
            }
        }
        System.out.println(max);*/

//        3. 🔁 Using Java 8 Streams
/*        OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
        max.ifPresent(System.out::println);*/

/*        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);*/

//        4. 🧠 Using reduce() with Streams
/*        int max =numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(max);*/

        /*⚠️ Edge Case
        If numbers is empty, the result will be Integer.MIN_VALUE, which might not be meaningful. In such cases, consider using:

        java
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        This returns an Optional<Integer> that you can check for presence before using.*/

//        5. 🧪 Using Comparator with Streams
        int max = numbers.stream().max(Comparator.naturalOrder()).orElseThrow();
        System.out.println(max);

/*
        Would you like to see how to handle edge cases like empty lists or null values? Or maybe convert this into a reusable method?
*/

    }
}
