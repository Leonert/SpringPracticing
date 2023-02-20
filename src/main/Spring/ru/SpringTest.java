package ru;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    // https://github.com/NeilAlishev/SpringCourse
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
//        MusicPlayer mp = new MusicPlayer();
//        Music classicalMusic = context.getBean("classicalMusic", Music.class);
//        mp.playMusic(classicalMusic);
//        Music rockMusic = context.getBean("rockMusic", Music.class);
//        mp.playMusic(rockMusic);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);


        context.close();
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
