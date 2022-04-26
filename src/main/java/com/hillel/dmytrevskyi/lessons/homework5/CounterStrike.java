package com.hillel.dmytrevskyi.lessons.homework5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String team1 = getTeamName(scanner);
        System.out.println("Team 1 name : " + team1);
        String team2 = getTeamName(scanner);
        System.out.println("Team 2 name : " + team2);

        int player1Team1, player2Team1, player3Team1, player4Team1, player5Team1,
                player1Team2, player2Team2, player3Team2, player4Team2, player5Team2;


        player1Team1 = getFrags(scanner);
        System.out.println("player1Team1 " + player1Team1);
        player2Team1 = getFrags(scanner);
        System.out.println("player2Team1 " + player2Team1);
        player3Team1 = getFrags(scanner);
        System.out.println("player3Team1 " + player3Team1);
        player4Team1 = getFrags(scanner);
        System.out.println("player4Team1 " + player4Team1);
        player5Team1 = getFrags(scanner);
        System.out.println("player5Team1 " + player5Team1);

        player1Team2 = getFrags(scanner);
        System.out.println("player1Team2 " + player1Team2);
        player2Team2 = getFrags(scanner);
        System.out.println("player2Team2 " + player2Team2);
        player3Team2 = getFrags(scanner);
        System.out.println("player3Team2 " + player3Team2);
        player4Team2 = getFrags(scanner);
        System.out.println("player4Team2 " + player4Team2);
        player5Team2 = getFrags(scanner);
        System.out.println("player5Team2 " + player5Team2);

        double averageTeam1 = (double) (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1) / 5;
        System.out.println(averageTeam1);
        double averageTeam2 = (double) (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2) / 5;
        System.out.println(averageTeam2);
        if (averageTeam1 > averageTeam2) {
            System.out.println("Team1 - winner");
        }
        else {
            System.out.println("Team2 - winner");
        }
    }

    public static String getTeamName(Scanner scanner) {
        String name = scanner.nextLine();
        return name;
    }


    public static int getFrags(Scanner scanner) {
        int result = 0;
        if (scanner.hasNextInt()) {
            result = scanner.nextInt();
        } else {
            System.out.println("Wrong input");
            System.out.println("Run program again");
            System.exit(0);
        }
        return result;


    }

}


