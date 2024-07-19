package com.korgun.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements  Music{



    private ClassicalMusic () {}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }


    @Override
    public String getSong() {
        List<String> list = new ArrayList<>();
        Random random = new Random();
        list.add("Hungarian Rhapsody");
        list.add("Ballerina");
        list.add("Una Mattina");
        return list.get(random.nextInt(list.size()));
    }
}
