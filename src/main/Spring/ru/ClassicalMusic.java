package ru;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    public ClassicalMusic() {
        songs.add("classical1");
        songs.add("classical2");
        songs.add("classical3");
    }

    @Override
    public String getMusic() {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }

    @PostConstruct

    public void i() {
        System.out.println("init");
    }

    @PreDestroy
    public void d() {
        System.out.println("destr");
    }
}
