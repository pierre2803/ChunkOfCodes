package com.chunkofcodes;

public class ConsecutiveString {

    public static void main(String args[]){

        System.out.println(match("I.B.M.", "International Business Machine")); // 3
        System.out.println(match("Microsoft Inc.", "Microsoft Corporation")); // 9
        System.out.println(match("The Society for Creative Anachronism", "Creative Agency Inc.")); // 9
        System.out.println(match("Statcan", "Statistic Canada")); // 7
    }

    // I B M 3
    // M i c r o s o f t 9
    // 0
    // S t a t c a n 7

    public static int match (String name1, String name2){
        int res=0;
        int index=0;
        boolean found=false;
        for(int i=0; i<name1.length(); i++) {
            if(Character.isLetter(name1.charAt(i))){
                found=false;
                for(int j=index; j<name2.length();j++) {
                    if(Character.isLetter(name2.charAt(j))){
                        if(name1.charAt(i)==name2.charAt(j)){
                            index=j+1;
                            res++;
                            System.out.print(name1.charAt(i) + " ");
                            found=true;
                            break;
                        }

                    }
                }
            }
            if(!found){
                break;
            }
        }

        return res;
    }


    public static int match0 (String name1, String name2){
        int index = 0;
        int count = 0;

        // while ...

        return count;
    }

}
