import java.util.ArrayList;
import java.util.LinkedList;

public class TestArrayLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList  = new LinkedList<>();
        ArrayList<Integer> arraylist = new ArrayList<>();

        Long startTime, endTime, elapsedTime;

        for(int i = 0; i < 1000000; i++)
        {
            linkedList.add(i);
            arraylist.add(i);
        }

        // ********* Linked List **********
        startTime = System.nanoTime();

        // Do Something
        // -> find the element
        // linkedList.get(0);
        // linkedList.get(50000);
        // linkedList.get(999999);

        // -> To remove element 
        // linkedList.remove(0);
        // linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + "ns");



        // ********* Array List ***********
        startTime = System.nanoTime();
        // Do Something
        // -> find the element
        // arraylist.get(0);
        // arraylist.get(0);
        // arraylist.get(999999);

        // -> To remove element
        // arraylist.remove(0);
        // arraylist.remove(500000);
        arraylist.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + "ns");
        
    }
}
