package ru.litvinov.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer.playMusic(Genre.CLASSIC));

        ClassicalMusic c1 = context.getBean("classicalMusic",ClassicalMusic.class);

        context.close();
    }
}
