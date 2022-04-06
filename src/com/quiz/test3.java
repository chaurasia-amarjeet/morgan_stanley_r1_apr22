package com.quiz;

//This was to test the lock pattern for static and instance methods
public class test3 {
    public static void main(String[] args) {

    }

    public synchronized void print(){

    }

    public static synchronized void print2(){

    }

    //2 thread 1 & 2
    //2 objects of test3 o1 & o2

    //thread1 => o1
    //thread2 => o2
}
