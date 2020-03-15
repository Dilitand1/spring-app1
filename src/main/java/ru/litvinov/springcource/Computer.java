package ru.litvinov.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    Integer id;
    MusicalPlayer musicalPlayer;

    @Autowired
    public Computer(MusicalPlayer musicalPlayer,Integer id) {
        this.musicalPlayer = musicalPlayer;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicalPlayer= " + //+ musicalPlayer.playMusic() +
                '}';
    }

    public String playMusic(Genre genre) {
        return "Computer{" +
                "id=" + id +
                ", musicalPlayer=" + musicalPlayer.playMusic(genre) +
                ", name =" + musicalPlayer.getName() +
                ", volume =" + musicalPlayer.getVolume() +
                '}';
    }


}
