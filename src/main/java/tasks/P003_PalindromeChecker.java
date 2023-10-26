package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P003_PalindromeChecker {

    /*
    Develop a program named `PalindromeChecker` that will determine if a given input sentence is palindromic.
     */
    public static void main(String[] args) {
        String sentence = "me I I me";
        boolean res = palindromeChecker(sentence);
        System.out.println(res);
        boolean res1 = palindromeChecker1(sentence);
        System.out.println(res1);
    }

    private static boolean palindromeChecker1(String sentence) {
        boolean res=true;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length/2; i++) {
            String wordFromBegin = words[i];
            String wordFromEnd = words[words.length-1-i];
            if (!wordFromBegin.equals(wordFromEnd)){
                res=false;
                break;
            }


        }
        return res;
    }

    private static boolean palindromeChecker(String sentence) {
        String[] words = sentence.split(" ");
        ArrayList<String> original = new ArrayList<>(Arrays.asList(words));
        ArrayList<String> reversed = new ArrayList<>(Arrays.asList(words));
        Collections.reverse(reversed);
        return original.equals(reversed);

    }
}
