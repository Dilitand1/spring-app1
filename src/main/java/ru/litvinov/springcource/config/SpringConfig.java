package ru.litvinov.springcource.config;

import org.springframework.context.annotation.*;
import ru.litvinov.springcource.ClassicalMusic;
import ru.litvinov.springcource.Computer;
import ru.litvinov.springcource.MusicalPlayer;
import ru.litvinov.springcource.RockMusic;

import java.util.Random;

@Configuration
@PropertySource("myProperties.properties")
@ComponentScan("ru.litvinov.springcource")
public class SpringConfig {

    @Bean
    @Scope("singleton")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public MusicalPlayer musicalPlayer(){
        return new MusicalPlayer(rockMusic(),classicalMusic());
    }

    @Bean
    Computer computer(){
        return new Computer(musicalPlayer(),new Random().nextInt());
    }
}
