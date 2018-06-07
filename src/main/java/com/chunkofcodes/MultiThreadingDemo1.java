package com.chunkofcodes;

public class MultiThreadingDemo1 extends Thread {

    // Creating a thread in Java
    // By extending Thread class.

    public void run(){
        System.out.println(this.getName() + " with ID=" + this.getId() + " is alive=" + this.isAlive());
        System.out.println("I'm currently in running state.");
    }

    public static void main(String args[]){
        MultiThreadingDemo1 obj=new MultiThreadingDemo1();
        obj.start();
    }

}
