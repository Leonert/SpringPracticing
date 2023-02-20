import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    // https://github.com/NeilAlishev/SpringCourse
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

//        TestBean testBean = context.getBean("TestBean", TestBean.class);
//        System.out.println(testBean.getName());

        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer mp2 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(mp.equals(mp2));
        mp.playMusic();

        mp.setVolume(33);
        System.out.println(mp2.getVolume());
//        System.out.println(mp.getName());
//        System.out.println(mp.getVolume());

        context.close();
    }
}
