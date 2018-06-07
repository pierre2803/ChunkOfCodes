package com.chunkofcodes;

public class decodeString {

    public static void main(String args[]){

        // original string: abbbababbbababbbab
        //                  abababaabababaabababa
        // encoded string : "3[a3[b]1[ab]]".

        //System.out.println(decode("a3[b]"));
        //System.out.println(decode("3[b2[ca]]"));
        System.out.println(decode("3[a3[b]1[ab]]"));
    }

    public static String decode (String string){

        System.out.println("Decoding (" + string + ") " + string.length());

        if (string == "" || string.length()==0)
            return "";

        char c = string.charAt(0);
        if (Character.isDigit(c)) {
            int nbOccurences = Integer.decode(c+"");
            String res = "";
            String dec = decode(string.substring(2,string.length()-1));
            for(int i=0; i<nbOccurences; i++) {
                res = res + dec;
            }
            return res;
        } else if(c=='['){
            return decode(string.substring(1,string.indexOf("]")))
                    + decode(string.substring(string.indexOf("]")+1));
        } else if(c==']'){
            return decode(string.substring(1));
        } else if (Character.isLetter(c)) {
            return c + decode(string.substring(1));
        }

        return "-OOPS-";

    }




}
