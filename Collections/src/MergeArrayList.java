import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeArrayList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(20, 30, 50, 80);
        List<Integer> list2 = Arrays.asList(10, 40, 60, 70);

//        1. 🔁 Using a Loop
/*        ArrayList<Integer> merged = new ArrayList<>(list1);
        for(int list : list2) {
            merged.add(list);
        }
        System.out.println(merged);*/

//        2. 🧠 Using Java 8 Streams
/*        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(mergedList);*/

//        3. 🧹 Merge Without Duplicates Using Set
/*        Set<Integer> mergedSet = new HashSet<>();
        mergedSet.addAll(list1);
        mergedSet.addAll(list2);

        List<Integer> mergedList = new ArrayList<>(mergedSet);
        System.out.println(mergedList);*/

//        4. 🧪 Using Collections.addAll()
        List<Integer> list = new ArrayList<>(list1);
        Collections.addAll(list, list2.toArray(new Integer[0]));
        System.out.println(list);

//        Would you like to sort the merged list, merge custom objects, or write a reusable method for merging any type of list?
    }

}
