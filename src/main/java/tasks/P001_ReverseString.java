package tasks;

public class P001_ReverseString {

    /*
    Can you create a method  to reverse a string?
     */

    public static void main(String[] args) {

        String str="adam";
       String result= reverseString1(str);
        System.out.println(result);
        String result1= reverseString2(str);
        System.out.println(result1);

    }

    private static String reverseString2(String str) {

        String res="";
        for (int i = str.toCharArray().length - 1; i >= 0; i--) {
            res+=str.charAt(i);
        }
        return res;
    }


    private static String reverseString1(String str) {

       return new StringBuilder(str).reverse().toString();

    }
}
