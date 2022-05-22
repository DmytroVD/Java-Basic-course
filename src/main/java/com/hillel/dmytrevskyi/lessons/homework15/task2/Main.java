package com.hillel.dmytrevskyi.lessons.homework15.task2;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] arrayMusic = new MusicStyles[] {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };
        for (MusicStyles musicStyles : arrayMusic) {
            musicStyles.playMusic();
        }

    }
}
