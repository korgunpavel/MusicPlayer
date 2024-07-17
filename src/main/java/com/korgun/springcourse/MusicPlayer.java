package com.korgun.springcourse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();


    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public MusicPlayer(){}

//    public void setMusic(Music music){
//        this.music = music;
//    }

    public void setMusicList(List<Music> musicList) {
    this.musicList = musicList;
}
//    public void playMusic(){
//        System.out.println("Playing: " + music.getSong());
//    }

    public void playMusicList(){

        for (Music o:musicList){
            System.out.println("Playing: " +o.getSong());
        }
    }
}
