package com.chunkofcodes;

public class Fibonacci {

    public static void displayFibonacciSequence(int end){
        System.out.println("Fibonacci (" + end + ")");
        int n1=0,n2=0;
        if (end>=0) {
            System.out.print("0 ");
            n1=0;
            if (end>=1) {
                System.out.print("1 ");
                n2=1;

                for (int i=1; i<=end; i++) {
                    if(i==(n1+n2)) {
                        System.out.print(i + " ");
                        n1=n2;
                        n2=i;
                    }
                }

            }
            System.out.println("");
        }
    }

    public static void displayFibonacciSequence2(int end){
        System.out.println("Fibonacci (" + end + ")");
        int n1=0,n2=0;
        if (end>=0) {
            System.out.print("0 ");
            n1=0;
            if (end>=1) {
                System.out.print("1 1 ");
                n1=n2=1;
                while ((n1+n2)<=end) {
                    int n3 = n1+n2;
                    System.out.print(n3 + " ");
                        n1=n2;
                        n2=n3;
                }

            }
            System.out.println("");
        }
    }


    public static void main(String args[]){

        displayFibonacciSequence(-1);
        displayFibonacciSequence(0);
        displayFibonacciSequence(1);
        displayFibonacciSequence(3);
        displayFibonacciSequence(15000);
        displayFibonacciSequence2(15000);
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946
    }
}
