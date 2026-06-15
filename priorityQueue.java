import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        
        // PriorityQueue: A FIFO data structure that serves elements with the highest priorities before elements with lower priority.

        //Queue<Double> queue = new PriorityQueue<>(); Collections.reverseOrder() if not added then is in ascending order

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(3.3);
        queue.offer(4.0);
        queue.offer(3.7);
        queue.offer(3.37);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
