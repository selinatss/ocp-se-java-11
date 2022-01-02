package CoreJavaAPIs;

//Unlike the String class, StringBuilder is not immutable.

public class J11StringBuilder {
    public static void main(String args[]){
       stringsImmutabilityExample();
       mutabilityAndChaining();
    }

    static void stringsImmutabilityExample(){
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);  //because the String object is immutable, a new String object is assigned to alpha, and the "" object becomes eligible for garbage collection.

        StringBuilder alpha2 = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alpha2.append(current);
        System.out.println(alpha2);
    }

    static void mutabilityAndChaining(){
        //String Builder Creation
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");                      // sb = "start+middle"
        StringBuilder same = sb.append("+end");    // "start+middle+end"

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    static void stringBuildersMethods(){
        //charAt(), indexOf(), length(), and substring()
        //This method usages are the same String

        //append()
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb);      // 1c-true

        //insert()
        StringBuilder sb1 = new StringBuilder("animals");
        sb1.insert(7, "-");                   // sb = animals-
        sb1.insert(0, "-");                   // sb = -animals-
        sb1.insert(4, "-");                   // sb = -ani-mals-
        System.out.println(sb1);

        //delete() and deleteCharAt()
        StringBuilder sb3 = new StringBuilder("abcdef");
        sb3.delete(1, 3);                  // sb = adef
        sb3.deleteCharAt(5);               // throws an exception: StringIndexOutOfBoundsException

        //replace()
        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder);  // pigsty dirty

        StringBuilder builder2 = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "");
        System.out.println(builder); //This code prints "pig"

        //reverse()
        StringBuilder reverse = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(reverse);  //CBA

        //toString
        StringBuilder sb4 = new StringBuilder("ABC");
        String s = sb4.toString();




    }



}
