import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    // https://github.com/NeilAlishev/SpringCourse
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

//        TestBean testBean = context.getBean("TestBean", TestBean.class);
//        System.out.println(testBean.getName());

        context.getBean("musicPlayer", MusicPlayer.class).playMusic();
    }
}
