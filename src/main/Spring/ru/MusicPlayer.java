package ru;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private String name;
    private int volume;
    private Music music;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Autowired

    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public MusicPlayer(){}

    String playMusic() {
        return (classicalMusic.getMusic() + " is playing");
    }
}
