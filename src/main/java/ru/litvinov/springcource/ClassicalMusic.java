package ru.litvinov.springcource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    public ClassicalMusic(){};

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("classical init");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("destroy");
    }

    @Override
    public List<String> getSong() {
        return new ArrayList<>(Arrays.asList("Classic1", "Classic2", "Classic3"));
    }
}
