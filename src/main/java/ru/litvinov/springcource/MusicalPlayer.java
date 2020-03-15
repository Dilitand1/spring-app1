package ru.litvinov.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicalPlayer {

    @Value("${musicPlayer.playerName}")
    String name;
    @Value("${musicPlayer.volume}")
    Integer volume;

    Music music;
    Music music2;

    //@Autowired
    public MusicalPlayer(@Qualifier("rockMusic") Music music,@Qualifier("classicalMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public String playMusic(Genre genre) {
        switch (genre){
            case ROCK:
                return music.getSong().get((int) (Math.random()*3));
            case CLASSIC:
                return music2.getSong().get((int) (Math.random()*3));
            default:
                return "0";
        }
    }

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }
}
