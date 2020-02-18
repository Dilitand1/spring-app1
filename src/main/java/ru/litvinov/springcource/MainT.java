package ru.litvinov.springcource;

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
}