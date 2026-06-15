public class DynamicArrayImp {
    public static void main(String[] args) {
    
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.insert(0, "55");
        dynamicArray.delete("A");
        System.out.println("Element found at: " + dynamicArray.search("C"));
        System.out.println(dynamicArray);
        System.out.println("size: "+dynamicArray.size);
        System.out.println("Capacity: "+dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());
     
    }
   
}
