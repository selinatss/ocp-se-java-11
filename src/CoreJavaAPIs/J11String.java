package CoreJavaAPIs;

//String class is special and doesn’t need to be instantiated with new.


public class J11String {
    public static void main(java.lang.String args[]){
        concatenation();
        stringsMethods();
    }

    public static void concatenation(){
        //If both operands are numeric, + means numeric addition.
        //If either operand is a String, + means concatenation.
        // The expression is evaluated left to right.

        System.out.println(1 + 2);           // 3
        System.out.println("a" + "b");       // ab
        System.out.println("a" + "b" + 3);   // ab3
        System.out.println(1 + 2 + "c");     // 3c
        System.out.println("c" + 1 + 2);     // c12
    }

    public static void immutability(){
       //String is immutable
        java.lang.String s1 = "1";
        java.lang.String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }

    public static void stringsMethods(){
        //length()
        String a = "animals";
        System.out.println(a.length());

        //charAt()
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        //System.out.println(a.charAt(7)); //throws exception: java.lang.StringIndexOutOfBoundsException

        //indexOf()
        //Unlike charAt(), the indexOf() method doesn’t throw an exception if it can’t find a match. indexOf() returns –1 when no match is found.
        System.out.println(a.indexOf('a'));         // 0
        System.out.println(a.indexOf("al"));        // 4
        System.out.println(a.indexOf('a', 4));      // 4
        System.out.println(a.indexOf("al", 5));     // -1

        //subString()
        String string = "animals";
        System.out.println(string.substring(3));                   // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4));                // m
        System.out.println(string.substring(3, 7));                // mals
        System.out.println(string.substring(3, 3)); // empty string
        System.out.println(string.substring(3, 2));  // throws exception: java.lang.StringIndexOutOfBoundsException
        System.out.println(string.substring(3, 8)); // throws exception: java.lang.StringIndexOutOfBoundsException

        //toLowerCase() and toUpperCase()
        System.out.println(a.toUpperCase());  // ANIMALS
        System.out.println("Abc123".toLowerCase());  // abc123

        //equals() and equalsIgnoreCase()
        //equals() takes an Object rather than a String. This is because the method is the same for all objects.
        //If you pass in something that isn’t a String, it will just return false.
        //By contrast, the equalsIgnoreCase method only applies to String objects so it can take the more specific type as the parameter.
        System.out.println("abc".equals("ABC"));  // false
        System.out.println("ABC".equals("ABC"));  // true
        System.out.println("abc".equalsIgnoreCase("ABC"));  // true


        //startsWith() and endsWith()
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        //replace()
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        //contains()
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        //trim(), strip(), stripLeading(), and stripTrailing()
        //The strip() and trim() methods remove whitespace from the beginning and end of a String.
        // In terms of the exam, whitespace consists of spaces along with the \t (tab) and \n (newline) characters.
        // Other characters, such as \r (carriage return), are also included in what gets trimmed.
        // The strip() method is new in Java 11.
        System.out.println("abc".strip());                 // abc
        System.out.println("\t   a b c\n".strip());        // a b c

        String text = " abc\t ";
        System.out.println(text.trim().length());         // 3
        System.out.println(text.strip().length());        // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length());// 4
    }
}

