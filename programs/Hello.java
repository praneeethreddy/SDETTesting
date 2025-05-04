public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        stringMethods();
        stringBufferMethods();
        arthematicOperators();
        relationalOperators();
    }


    public static void stringMethods() {
        String str = "Hello, World!";
        System.out.println("Length of string: " + str.length());
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());
        System.out.println("String contains 'World': " + str.contains("World"));
    }
    public static void stringBufferMethods() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", World!");
        System.out.println("StringBuffer: " + sb);
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);
        sb.delete(5, 15);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
    // arthematic operators
    // +, -, *, /, %, ++, --
    // +, -, *, /, % are binary operators
    // ++, -- are unary operators

    public static void arthematicOperators() {
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
    }
    // relational operators

    public static void relationalOperators() {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
    }
}
