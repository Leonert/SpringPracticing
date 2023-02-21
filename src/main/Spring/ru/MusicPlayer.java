package ru;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> genres;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    String playMusic() {
        Random random = new Random();
        return genres.get(random.nextInt(genres.size())).getMusic();
    }
}
