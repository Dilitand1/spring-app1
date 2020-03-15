package ru.litvinov.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        return new ArrayList<>(Arrays.asList("Shtil", "Shtil2", "Shtil3"));
    }
}
