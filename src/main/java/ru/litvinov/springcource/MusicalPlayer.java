package ru.litvinov.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicalPlayer {

    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicalPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }


    public String playMusic() {
        return classicalMusic.getSong();
    }
}
