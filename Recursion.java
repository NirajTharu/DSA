public class Recursion {
            // Recursion: When a thing is defined in terms of itself.
        // Apply the result of a procedure, to a procedure.
        // A recursion method calls itself. Can be substitute for iteraton.
        // Divide a problem into sub-problems of the same type as original. 
        // Commonly used with advanced sortring algorithms and navigating trees.


        // ADVANTAGES:
        // =========
        // easier to read and write
        // easier to debug

        // DISADVANTAGE:
        // ============
        // sometimes slower
        // uses more memory
    public static void main(String[] args) {
        
        walk(5);
        System.out.println("""
                ======================
                ======================
                """);
        System.out.println("The Factorial is : " + factorial(7));
        System.out.println("""
                ======================
                ======================
                """);
        System.out.println("This vaue is from the power Method: "+power(2,8));
        System.out.println("""
                ======================
                ======================
                """);
        diffIterationAndRecursion();

    }
    private static void walk(int steps)
    {
        if(steps < 1)
        {
            return;
        }
        System.out.println("You take step " + steps);
        walk(steps - 1);

        // for(int i = 1; i <= steps; i++)
        // {
        //     System.out.println("You take step " + i);
        // }
    }
    private static int factorial(int number)
    {
        if(number < 1)
        {
            return 1;
        }
        else{
           return number * factorial(number-1);
        }
    }
    private static int power(int base, int exponent)
    {
        if(exponent < 1)
        {
            return 1; //Base case
        }
        return base * power(base, exponent - 1); // Recursive case
    }
    private static void diffIterationAndRecursion()
    {
        System.out.println("""
        Difference between the iteration and recursion:
=====================================================================
                        |   Iteration           |  Recursion
=====================================================================
    Implementation      |   uses loops          |   calls itself
=====================================================================
    state               |   control index       |   parameter values
                        |   (int steps = 0)     |   walk (int steps)
=====================================================================
    progression         |   moves towards value |   Converge Toward
                        |   in condition        |   Base case
=====================================================================
    termination         |   index satisfies     |   base Case = true
                        |   condition           |
=====================================================================
    size                |   more code           |   less code 
                        |   less memory         |   more memory
=====================================================================
    speed               |   faster              |   slower 
=====================================================================
                """);
    }
}


