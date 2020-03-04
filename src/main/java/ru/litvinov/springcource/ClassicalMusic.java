package ru.litvinov.springcource;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic(){};

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("classical init");
    }

    public void doMyDestroy(){
        System.out.println("destroy");
    }

    @Override
    public String getSong() {
        return "Rapsody";
    }
}
