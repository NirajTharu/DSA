import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        // Stack: A LIFO data structure. Last In First Out stores objects into a sort of "vertical tower" 
        // push(): to add to the top
        // Pop(): to remove from the top
        
        Stack<String> stack = new Stack<>();
        // To check that out stack is empty or not
        System.out.println(stack.empty());

        stack.push("Pencil");
        stack.push("table");
        stack.push("chair");

        System.out.println(stack.empty());
        System.out.println(stack);

        // To see the first last element of the stack
        System.out.println(stack.peek());

        // To see the position of a element in the stack
        System.out.println(stack.search("Pencil"));

        // Uses of the stack
        // 1. undo/redo features in the text editor
        // 2. moving back/froward through browsing history
        // 3. backtracking algorithms (maze, filedirection)
        // 4. calling functions(call stack)
    } 
}