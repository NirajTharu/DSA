public class InterpolationSearch {
    public static void main(String[] args) {
        /*  interpolation search -> improvement over binary search best for "uniformly" distributed data "guesses"
            where value might be based on calculated probe results.

            If probe is incorrect, search area is narrowed, and a new prob is calculated

            average case: O(log(log(n)))
            worst case: O(n) [Values increases exponentially]
        */
       int[] array = {1, 2, 4, 8, 16, 32, 64, 128};
       int index = interpolationSearch(array, 64);
       if(index != -1)
       {
        System.out.println("Element found at: " + index);
       }
       else{
        System.out.println("Element NOT Found.");
       }
    }
    private static int interpolationSearch(int[] array, int value)
    {
        int high = array.length - 1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high)
        {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("Probe: " + probe);

            if(array[probe] == value)
            {
                return probe;
            }
            else if(array[probe] < value)
            {
                low = probe + 1; 
            }
            else
            {
                high = probe - 1; 
            }
        }
        return -1;
    }
}
