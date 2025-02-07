import java.util.*;

class S {
    static int a;      // Default value is 0
    static float b;    // Default value is 0.0f
    static char c;     // Default value is '\u0000' (null character)
    static boolean d;  // Default value is false

    public static void main(String[] args) {
        System.out.println("Integer a: " + a);
        System.out.println("Float b: " + b);
        System.out.println("Character c: " + c);
        System.out.println("Boolean d: " + d);
    }
}