package MethodAndEncapsucaitons;

public class J11StaticFields {
        /*
         Koala k = new Koala();
         System.out.println(k.count);          // k is a Koala
         k = null;
         System.out.println(k.count);          // k is still a Koala
         */
}

class Koala {
    public static int count = 0;               // static variable
    public static void main(String[] args) {   // static method
        System.out.println(count);
    }
}
