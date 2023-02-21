package ru;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("rock1");
        songs.add("rock2");
        songs.add("rock3");
    }

    @Override
    public String getMusic() {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}
