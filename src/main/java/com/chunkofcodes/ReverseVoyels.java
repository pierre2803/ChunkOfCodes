package com.chunkofcodes;

public class ReverseVoyels {

    //Write a function that takes a string as input and reverse only the vowels of a string.
    //
    //Example 1:
    //Given s = "hello", return "holle".
    //
    //Example 2:
    //Given s = "leetcode", return "leotcede".
    //
    //Note:
    //The vowels does not include the letter "y".

    public static void main (String [] args){

        System.out.println(reverseVoyels(""));
        System.out.println(reverseVoyels(null));
        System.out.println(reverseVoyels("ai"));
        System.out.println(reverseVoyels("Hello"));
        System.out.println(reverseVoyels("leetcode"));

    }

    private static String reverseVoyels(String string) {
        if(string==null)
            return null;

        char [] reversed = string.toCharArray();

        int rev=string.length()-1;
        for(int i =0; i<string.length()-1; i++) {
            if(isVowel(string.charAt(i))) {
                for(int j=rev; j>0; j--) {
                    if(isVowel(string.charAt(j))) {
                        reversed[i] = string.charAt(j);
                        reversed[j] = string.charAt(i);
                        rev=j-1;
                        break;
                    }
                }
            }
        }

        return new String(reversed);
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

}
