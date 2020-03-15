package ru.litvinov.springcource;

import ru.litvinov.springcource.config.SpringConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringClassConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer = context.getBean("computer",Computer.class);

        System.out.println(computer.playMusic(Genre.ROCK));

        context.close();
    }
}
