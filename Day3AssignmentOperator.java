public class Day3AssignmentOperator 
{

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Initial value of a: " + a); // Output: 10
        // Basic assignment
        a = 5;
        System.out.println("After a = 5       : " + a); // Output: 5
        // Add and assign
        a += 3; // a = a + 3
        System.out.println("After a += 3      : " + a); // Output: 8
        // Subtract and assign
        a -= 2; // a = a - 2
        System.out.println("After a -= 2      : " + a); // Output: 6
        // Multiply and assign
        a *= 4; // a = a * 4
        System.out.println("After a *= 4      : " + a); // Output: 24
        // Divide and assign
        a /= 3; // a = a / 3
        System.out.println("After a /= 3      : " + a); // Output: 8
        // Modulus and assign
        a %= 2; // a = a % 2
        System.out.println("After a %= 2      : " + a); // Output: 0
    }
}


