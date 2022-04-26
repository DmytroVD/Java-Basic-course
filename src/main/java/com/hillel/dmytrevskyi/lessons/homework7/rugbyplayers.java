package com.hillel.dmytrevskyi.lessons.homework7;

import java.util.Arrays;

public class rugbyplayers {
    public static void main(String[] args) {
        rugby();


    }

    public static void rugby() {

        final int COUNT_PLAYERS = 25;

        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];
        int sumTeam1 = 0;
        int sumTeam2 = 0;
        int ageMin = 18;
        int ageMax = 40;

        for (int i = 0; i < COUNT_PLAYERS; i++) {
            team1[i] = ageMin + (int) (Math.random() * (ageMax + 1 - ageMin));
            team2[i] = ageMin + (int) (Math.random() * (ageMax + 1 - ageMin));

            sumTeam1 += team1[i];
            sumTeam2 += team2[i];

        }
        System.out.println("Team 1" + Arrays.toString(team1));
        System.out.println("Team 2" + Arrays.toString(team2));
        System.out.println("aveTeam 1" + " " + sumTeam1 / COUNT_PLAYERS);
        System.out.println("aveTeam 2" + " " + sumTeam2 / COUNT_PLAYERS);

        }


    }



