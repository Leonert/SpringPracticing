public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getInstance() {
        System.out.println("factory method is working");
        return new ClassicalMusic();
    }
    @Override
    public String playMysic() {
        return "Shopen";
    }

    public void doMyInit() {
        System.out.println("init");
    }
    public void doMyDestroy(){
        System.out.println("destroy");
    }
}
