package ru.litvinov.springcource;

public class MusicalPlayer {
    private Music music;

    //IoC
    public MusicalPlayer(Music music){
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
