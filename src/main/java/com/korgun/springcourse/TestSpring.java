package com.korgun.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        Music musicClassical = context.getBean("classicalMusic", ClassicalMusic.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(musicClassical);
//        classicalMusicPlayer.playMusic();
//
//        Music musicRock = context.getBean("rockMusic", RockMusic.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(musicRock);
//        rockMusicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);




        context.close();
    }
}
