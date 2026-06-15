import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        
        // LinkedList: Stores node in 2 parts (data + address) Nodes are in non-consecutive locations. Elements are linked using pointer.

        /*  """
             Node              Node             Node            
        [address|data] -> [address|data] -> [address|data]
                        Doubly Linked List
                Node                        Node
        [address|data|address] <-> [address|data|address]
            """;
        */ 
        /* Advantages: 
            1. Dynamic Data Structure(allocates needed memory while needed)
            2. Insertion and deletion of node easily. O(1)
            3. No/low Memeory waste  
        */ 

        /* DisAdvantage: 
            1. Grater memory usages(additional pointer)
            2. No random access of element(No index[i])
            3. Accessing and searching element is more time consuming. O(n)
        */ 
        /* Usage:
            1.implement stack and queue
            2. GPS nativation
            3. music playlist
        */    
        LinkedList<String> linkedList1  = new LinkedList<String>();
        LinkedList<String> linkedList2  = new LinkedList<String>();
        
        // To make behave like stack use  push() and pop()
        System.out.println("This is working as a stack: ");
        linkedList1.push("A");
        linkedList1.push("B"); 
        linkedList1.push("C");
        linkedList1.push("D");
        linkedList1.push("E");
        linkedList1.push("F");
        System.out.println(linkedList1);
        System.out.println("After removing an element: ");
        linkedList1.pop();
        System.out.println(linkedList1);

        // To make behave like queue use offer() and poll()
        System.out.println("This is working as the queue: ");
        linkedList2.offer("G");
        linkedList2.offer("H");
        linkedList2.offer("I");
        linkedList2.offer("J");
        linkedList2.offer("K");
        linkedList2.offer("L");
        System.out.println(linkedList2);
        System.out.println("After removing an element: ");
        linkedList2.poll();
        System.out.println(linkedList2);
        System.out.println("Adding an element to linked List: ");
        linkedList2.add(3, "KK");
        System.out.println(linkedList2);
        System.out.println("After removing an element called 'KK': ");
        linkedList2.remove("KK");
        System.out.println(linkedList2);

        System.out.println(linkedList1.peekFirst());
        System.out.println(linkedList2.peekLast());

        linkedList1.addFirst("A+");
        linkedList2.addLast("L+");
        
        System.out.println(linkedList1);

        System.out.println(linkedList2);
    }
}
