package ru.litvinov.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");
        Music testBean = context.getBean("myMusicBean",Music.class);
        context.close();
    }
}
