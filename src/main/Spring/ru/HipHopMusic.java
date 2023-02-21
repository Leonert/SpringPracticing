package ru;

import org.springframework.stereotype.Component;

public class HipHopMusic implements Music {
    @Override
    public String getMusic() {
        return "Hip hop";
    }
}
