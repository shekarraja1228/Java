import java.util.*;

public class FindKthSmallestElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 40, 80, 30, 90);
        int k = 3;

//        ✅ Method 1: Using Sorting
/*        if(k <= list.size()) {
            list.sort(Comparator.naturalOrder());
            System.out.println(list.get(k - 1));
        } else {
            System.out.println("Invalid number");
        }*/

//        ✅ Method 2: Using Min-Heap (PriorityQueue)
        if(k <= list.size()) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(list);
            for(int i = 1; i < k; i++) {
                queue.poll();
            }
            System.out.println(queue.peek());
        } else {
            System.out.println("Invalid value of k");
        }

//        Would you like to see how to find the kth largest element or handle duplicates and edge cases?
    }
}
