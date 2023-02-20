import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class SpringTest {
    // https://github.com/NeilAlishev/SpringCourse
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

//        TestBean testBean = context.getBean("TestBean", TestBean.class);
//        System.out.println(testBean.getName());

//        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer mp2 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(mp.equals(mp2));
//        mp.playMusic();
//
//        mp.setVolume(33);
//        System.out.println(mp2.getVolume());
//        EmptyClass emptyClass = new EmptyClass();
//        System.out.println(mp.getName());
//        System.out.println(mp.getVolume());

        Music music = context.getBean("music", ClassicalMusic.class);
        System.out.println(music.playMysic());

//        EmptyClass emptyClass = new EmptyClass();
//        List<Integer> list = emptyClass.getList();
//        list.remove(0);
//        list.add(1);
//        System.out.println(emptyClass.getInt());

        context.close();
    }
}
