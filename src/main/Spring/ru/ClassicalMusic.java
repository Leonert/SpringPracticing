package ru;

import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music{
    public static ClassicalMusic getInstance() {
        System.out.println("factory method is working");
        return new ClassicalMusic();
    }
    @Override
    public String getMusic() {
        return "Shopen";
    }

    public void doMyInit() {
        System.out.println("init");
    }
    public void doMyDestroy(){
        System.out.println("destroy");
    }
}
