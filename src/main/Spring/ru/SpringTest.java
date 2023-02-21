package ru;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SpringTest {

    // https://github.com/NeilAlishev/SpringCourse
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer genres = context.getBean("genres", MusicPlayer.class);
        for (int i = 0; i < 10; i++) {
            System.out.println(genres.playMusic());
        }

        context.close();
//        Music music1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
//
//        System.out.println(music1 == music2);

//        MusicPlayer mp = new MusicPlayer();
//        Music classicalMusic = context.getBean("classicalMusic", Music.class);
//        mp.playMusic(classicalMusic);
//        Music rockMusic = context.getBean("rockMusic", Music.class);
//        mp.playMusic(rockMusic);

//        Computer computer = context.getBean("computer", Computer.class);
//        for (int i = 0; i < 5; i++) System.out.println(computer);
//        System.out.println(computer.getMusicPlayer().getName());
//        System.out.println(computer.getMusicPlayer().getVolume());


//        TestBean testBean = context.getBean("TestBean", TestBean.class);
//        System.out.println(testBean.getName());

//        ru.MusicPlayer mp = context.getBean("musicPlayer", ru.MusicPlayer.class);
//        ru.MusicPlayer mp2 = context.getBean("musicPlayer", ru.MusicPlayer.class);
//        System.out.println(mp.equals(mp2));
//        mp.playMusic();
//
//        mp.setVolume(33);
//        System.out.println(mp2.getVolume());
//        EmptyClass emptyClass = new EmptyClass();
//        System.out.println(mp.getName());
//        System.out.println(mp.getVolume());

//        ru.Music music = context.getBean("music", ru.ClassicalMusic.class);
//        System.out.println(music.playMysic());

//        EmptyClass emptyClass = new EmptyClass();
//        List<Integer> list = emptyClass.getList();
//        list.remove(0);
//        list.add(1);
//        System.out.println(emptyClass.getInt());

    }
}
