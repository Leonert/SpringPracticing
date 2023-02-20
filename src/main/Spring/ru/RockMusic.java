package ru;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getMusic() {
        return "Anacondaz";
    }
}
