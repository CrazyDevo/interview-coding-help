package tasks;

import java.util.*;

public class P020_CountDistinctSubStrings {
/*
"Count of substrings having all distinct characters
Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct) that consists of distinct characters only.
Examples:
Input: Str = “gffg”
Output: 6
Explanation:
All possible substrings from the given string are,
( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.
Input: str = “gfg”
Output: 5
Explanation:
All possible substrings from the given string are,
( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only. "
 */

    public static void main(String[] args) {

        String str = "gfg";
      countSubs2(str);


    }


    private static void countSubs2(String str) {

         List<String> subs=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (!substring.isEmpty()){
                boolean isValid=    check(substring);
                if (isValid)
                    subs.add(substring);
                }

            }
        }
        System.out.println(subs.size());

        System.out.println("subs = " + subs);
    }

    private static boolean check(String substring) {
        boolean isValid=true;
        char[] chars = substring.toCharArray();
        ArrayList<Character> characters=new ArrayList<>();
        for (char aChar : chars) {
            characters.add(aChar);
        }
        for (Character character : characters) {
            if (Collections.frequency(characters,character)>1){
                isValid=false;
                break;
            }

        }
return isValid;
    }


}
