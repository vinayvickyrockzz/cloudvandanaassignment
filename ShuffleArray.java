
//JAVA
//1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
//A:
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        
        Collections.shuffle(arrayList);

        
        Integer[] shuffledArray = arrayList.toArray(new Integer[0]);

        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
//output:4 6 1 7 2 5 3