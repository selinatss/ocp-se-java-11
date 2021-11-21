package CoreJavaAPIs;

import java.util.Arrays;

public class J11Array {
    public static void main(String args[]){
        usingArray();
        sortingArray();
    }


    void definitionOfArray(){
        int[] numbers1 = new int[3]; //3 = Size of array
        int[] numbers2 = new int[] {42, 55, 99};
        int[] numbers3 = {42, 55, 99};
        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];

        int[] ids, types;  //two of them are array
        int ids1[], types1;  // one of them array, one of them int value


        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias));     // true
        Arrays.toString(bugs); //return values
    }

    void casting(){
        String[] strings = {"stringValue"};
        Object[] objects =strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); DOES NOT COMPILE
    }

   static void usingArray(){
        int[] numbers = new int[10];
        for(int i=0; i < numbers.length; i++){
            numbers[i] = i+5;
            System.out.println(numbers[i]);
        }

       //numbers[10] = 3;  ArrayIndexOutOfBoundsException
       //numbers[numbers.length] = 5;
       for (int i = 0; i < numbers.length; i++) numbers[i] = i + 5;
    }

    static void sortingArray(){
        int[] numbers =  {6,9,1};
        Arrays.sort(numbers);
        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }

        //Sorting String: String sorts in alphabetic order, and 1 sorts before 9. (Numbers sort before letters, and uppercase sorts before lowercase
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
    }

    static void binarySearch(){
        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1  0-1 = -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2  -1-1 = -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5  -4-1 = -5

        //This array unsorted and result is unpredictable so, first one give result 1 but second one is unpredictable
        int[] numbersUnsorted = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbersUnsorted, 2));
        System.out.println(Arrays.binarySearch(numbersUnsorted, 3));
    }

    static void compareArray(){
        /*
        If both arrays are the same length and have the same values in each spot in the same order, return zero.
        If all the elements are the same but the second array has extra elements at the end, return a negative number.
        If all the elements are the same but the first array has extra elements at the end, return a positive number.
        If the first element that differs is smaller in the first array, return a negative number.
        If the first element that differs is larger in the first array, return a positive number.
         */

        /*
        null is smaller than any other value.
        For numbers, normal numeric order applies.
        For strings, one is smaller if it is a prefix of another.
        For strings/characters, numbers are smaller than letters.
        For strings/characters, uppercase is smaller than lowercase.
         */

        /*System.out.println(Arrays.compare(
                new int[] {1}, new String[] {"a"}));    DOES NOT COMPILE TYPES ARE DIFFERENT*/
    }

    static void mismatchArray(){
        //If the arrays are equal, mismatch() returns -1
        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));  //-1
        System.out.println(Arrays.mismatch(new String[] {"a"},
                new String[] {"A"}));   // First element mismatch return 0
        System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1}));  //second element mismatch return 1
    }

    static void multiDimentionalArray(){
        int[][] vars1;          // 2D array
        int vars2 [][];         // 2D array
        int[] vars3[];          // 2D array
        int[] vars4 [], space [][];  // a 2D AND a 3D array
    }
}
