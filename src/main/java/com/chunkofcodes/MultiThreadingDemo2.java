package com.chunkofcodes;

public class MultiThreadingDemo2 implements Runnable {

    // Creating a thread in Java
    // By implementing Runnable interface.

    public void run(){
        System.out.println("I'm currently in running state.");
    }

    public static void main(String args[]){
        MultiThreadingDemo2 obj=new MultiThreadingDemo2();
        Thread tobj =new Thread(obj);
        tobj.start();
    }

}
