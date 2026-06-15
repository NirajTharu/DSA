import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // Queue:FIFO data structure. First-In First-Out
        // A collection designed for holding elements prior to processing Linear data structure

        // add(): enqueue, offer()
        // remove():dequeus, poll()

        Queue<String> queue = new LinkedList<String>();
        // To add the elements to the queue
        queue.offer("Glass");
        queue.offer("Plastic");
        queue.offer("Rubber");
        queue.offer("Paper");
    
        // To see the all the elements of the queue
        System.out.println(queue);

        // To see the first element of the queue
        System.out.println(queue.peek());

        // To remove first element from the queue
        queue.poll();
        System.out.println(queue);

        // To see if our queue is empty
        System.out.println(queue.isEmpty());

        // To see the size of the queue
        System.out.println(queue.size());

        // To find out if the element exist in the queue
        System.out.println(queue.contains("Apple"));

        // Uses of the queue:
        // 1. Keyborad Buffer(letters should be appear in the screen in the order they are pressed)
        // 2. Printer queue(Printer job should be completed in the order)
        // 3. Used in LinkedList, Prirority Queues, Breadth-first Search
        
    }
}
