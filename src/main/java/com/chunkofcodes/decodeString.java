package com.chunkofcodes;

public class decodeString {

    public static void main(String args[]){

        // original string: abbbababbbababbbab
        //                  abababaabababaabababa
        // encoded string : "3[a3[b]1[ab]]".

        System.out.println(decode("3[ba]"));

        System.out.println(decode("a3[b]"));
        System.out.println(decode("3[b2[ca]]"));
        System.out.println(decode("3[a3[b]1[ab]]"));
    }

    public static int indexOfLastBlock(String string){
        int ignoreBlock = 0;
        int i = 0;
        for(i=0; i<string.length(); i++){
            char c = string.charAt(i);
            if(ignoreBlock==1 && c==']')
                return i;
            else if (c==']')
                ignoreBlock--;
            else if(c=='[')
                ignoreBlock++;
        }
        return i;
    }

    public static String decode (String string){

        for(int i=0; i<string.length(); i++){
            char c = string.charAt(i);
            if (Character.isDigit(c) &&  string.charAt(i+1)=='['){
                int indexOfLastBlock = indexOfLastBlock(string);
                String tmp = decode(string.substring(2, indexOfLastBlock));
                String res = "";
                for(int k=0; k<Integer.decode(c+""); k++){
                    res += tmp;
                }
                return res + decode(string.substring(indexOfLastBlock,string.length()-1));
            } else if (Character.isLetter(c)){
                int start = i;
                while(i<string.length() && Character.isLetter(string.charAt(i))){
                    i++;
                }
                // return char accumulated + decode remaining string
                return string.substring(start,i) + decode(string.substring(i));
            } else if (string.charAt(i)==']')
                return "";
        }

        return string;
    }


}
