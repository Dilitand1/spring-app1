package ru.litvinov.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicalPlayer testBean = context.getBean("musicPlayer",MusicalPlayer.class);
        testBean.playMusic();

        System.out.println(testBean);

        MusicalPlayer testBean2 = context.getBean("musicPlayer",MusicalPlayer.class);
        System.out.println(testBean2);
        context.close();
    }
}
