public class Day3LogicalOperator 
{
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical operations
        System.out.println("x = " + x); // Output: true
        System.out.println("y = " + y); // Output: false
        System.out.println("x && y : " + (x && y)); // Logical AND, Output: false
        System.out.println("x || y : " + (x || y)); // Logical OR, Output: true
        System.out.println("!x     : " + (!x));     // Logical NOT, Output: false
        System.out.println("!y     : " + (!y));     // Logical NOT, Output: true
    }
}
//&& (AND): True only if both operands are true.
//|| OR: True if at least one operand is true.
//!(NOT): Reverses the logical value (true → false, false → true).

