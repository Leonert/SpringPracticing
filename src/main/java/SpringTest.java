import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

//        TestBean testBean = context.getBean("TestBean", TestBean.class);
//        System.out.println(testBean.getName());

        Music music1 = context.getBean("ClassicalMusic", ClassicalMusic.class);
        Music music2 = context.getBean("RapMusic", RapMusic.class);

        new MusicPlayer(music1).playMusic();
        new MusicPlayer(music2).playMusic();
    }
}
