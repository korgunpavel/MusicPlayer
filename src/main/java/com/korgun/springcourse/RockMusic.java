package com.korgun.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        List<String> list = new ArrayList<>();
        Random random = new Random();
        list.add("Gimme Chocolate!!");
        list.add("Throne");
        list.add("Fairly Local");
        return list.get(random.nextInt(list.size()));
    }
}
