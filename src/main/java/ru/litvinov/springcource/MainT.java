package ru.litvinov.springcource;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MainT {
    public static void main(String[] args) throws InterruptedException {
        final MyClass myClass = new MyClass();
        new Thread(new Runnable() {
            @Override
            public void run() {
                myClass.addA();
            }
        }).start();
        Thread.sleep(1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                myClass.addA2();
            }
        }).start();

        new B().test();
    }
}

class MyClass{
    Integer a = 0;

    public void addA(){
            synchronized (a) {
                System.out.println("a");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(++a);
            }
    }
    public void addA2(){
        synchronized (a) {
            System.out.println("a2");
            System.out.println(++a);
        }
    }
}
class B {
    int x = 0;
    Deque queue = new ArrayDeque();
    void test(){
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        queue.offerFirst(4);
        queue.offerLast(5);
        System.out.println(queue);
    }
}