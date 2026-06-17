import java.util.Hashtable;

public class HashTable {
    /*
        Hash Table: A data structure that stores unique keys to values  ex.<Integer, String>
        Each key value pair is known as entry.
        FAST insertion, look up, deletion of key value pairs
        Not ideal for small data sets, great with large data sets

        // Hashing: takes a key and compute an integer(Formula will vary based on ley & data type)
        In a hash table, We use the hash % capacity to calculate an index number
        key.hashCode() % Capacity = index
    
        // Bucket: an indexed storage location for one or more Entries
        can store multiple entries in case of collision(linked similarly a linkedList)

        // Collision: Hash function generates the same index for more than one key 
        less collision = more efficiency

        // Runtime Complexity: Best case O(1)
        Wrost Case O(n)
        
    */ 
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Nikita");
        table.put(102, "Namrata");
        table.put(103, "Nirma");
        table.put(104, "Nirmala");
        table.put(105, "Nisma");
        
        System.out.println(table.get(100));
        
        for(Integer key : table.keySet())
        {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}
