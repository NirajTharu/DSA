// Big O notation -> How code slows when the data grows
/*
1. Describes the performance of an algorithm as the data increases.
2. Machine Independent(number of steps to completion)
3. Ignore Smaller Operations O(n + 1) -> O(n)
examples:  n is amount of data we are passing in 
O(1) ->  constant Time
O(n) -> liner Time
O(log n) ->  logarithmic time
O(n log n) ->  quasilinear time
O(n^2) -> quadratic time
O(n!) -> factorial time
*/


// About Linear Search
// Linear Search: Iterate through a collection one element at a time
/* Runtime Complexity: O(n)
   Disadvantage: Slow for large data set
   Advantages: 
   Fast for searches of small to medium data sets
   Does not need to sorted
   Usefull for the data structures that do not have random access(linked List)
*/ 
public class linearSearch{
    public static void main(String[] args) {
        int[] array = {91, 12, 3, 8, 37 , 7, 33, 23, 89 , 88 , 77};
        int index = linearSearch(array, 77);

        if(index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else
        {
            System.out.println("Element not Found.");
        }
    }
    private static int linearSearch(int[]array, int value)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == value)
            {
                return i;
            }
        }
        return -1;
    }
    
}
