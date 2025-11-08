import java.util.ArrayList;
import java.util.Collections;

public class ShuffleList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(30);
        Collections.shuffle(list);
        System.out.println(list);

//      Would you like to shuffle a list of custom objects or see how to implement your own shuffle algorithm manually?
    }
}
