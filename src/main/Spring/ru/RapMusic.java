package ru;

import org.springframework.stereotype.Component;

public class RapMusic implements Music {
    @Override
    public String getMusic() {
        return "Eminem";
    }
}
