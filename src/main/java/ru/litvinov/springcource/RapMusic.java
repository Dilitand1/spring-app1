package ru.litvinov.springcource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RapMusic implements Music {
    @Override
    public List<String> getSong() {
        return new ArrayList<>(Arrays.asList("RAP1", "R2", "R3"));
    }
}
