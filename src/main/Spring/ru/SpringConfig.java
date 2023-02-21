package ru;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration

@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    HipHopMusic hipHopMusic() {
        return new HipHopMusic();
    }

    @Bean
    RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    MusicPlayer genres() {
        List<Music> genres = new ArrayList<>();
        genres.add(classicalMusic());
        genres.add(rapMusic());
        genres.add(rockMusic());
        genres.add(hipHopMusic());
        return new MusicPlayer(genres);
    }

}
