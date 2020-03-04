package ru.litvinov.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("rockMusic",Music.class);
        Music music2 = context.getBean("classicalMusic",Music.class);
        MusicalPlayer mp = new MusicalPlayer(music);
        mp.playMusic();
        MusicalPlayer mp2 = new MusicalPlayer(music2);
        mp2.playMusic();

        context.close();
        /*
        MusicalPlayer testBean = context.getBean("musicPlayer",MusicalPlayer.class);
        testBean.playMusic();
        System.out.println(testBean);
        MusicalPlayer testBean2 = context.getBean("musicPlayer",MusicalPlayer.class);
        System.out.println(testBean2);
        context.close();

         */
    }
}
