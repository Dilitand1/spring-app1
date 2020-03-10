package ru.litvinov.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    int id;
    MusicalPlayer musicalPlayer;

    @Autowired
    public Computer(MusicalPlayer musicalPlayer) {
        this.musicalPlayer = musicalPlayer;
        id = 1;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicalPlayer=" + musicalPlayer.playMusic() +
                '}';
    }


}
