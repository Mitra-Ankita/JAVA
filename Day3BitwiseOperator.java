public class Day3BitwiseOperator
 {
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011
        
        System.out.println("a = " + a); // Output: 5
        System.out.println("b = " + b); // Output: 3
        System.out.println("a & b  : " + (a & b));  // AND, Output: 1 (Binary 0001)
        System.out.println("a | b  : " + (a | b));  // OR, Output: 7 (Binary 0111)
        System.out.println("a ^ b  : " + (a ^ b));  // XOR, Output: 6 (Binary 0110)
        System.out.println("~a     : " + (~a));     // NOT, Output: -6 (Binary 2's complement)
        System.out.println("a << 1 : " + (a << 1)); // Left shift, Output: 10 (Binary 1010)
        System.out.println("a >> 1 : " + (a >> 1)); // Right shift, Output: 2 (Binary 0010)
    }
}
 

