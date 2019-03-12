package com.step.assignment.Generics;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        CricketTeam indXiC = new CricketTeam("IND XI C", 1, 2, 3);
        CricketTeam ausXiC = new CricketTeam("AUS XI C", 2, 2, 0);
        CricketTeam rsaXiC = new CricketTeam("RSA XI C", 1, 1, 1);


        LeagueTable<CricketTeam> cricketTeamLeauge = new LeagueTable<>(asList(indXiC, ausXiC, rsaXiC));
        cricketTeamLeauge.showLeagueBoard();

        System.out.println("***************************");
        FootballTeam indXiF = new FootballTeam("IND XI F", 1, 2, 3);
        FootballTeam ausXiF = new FootballTeam("AUS XI F", 2, 2, 0);
        FootballTeam rsaXiF = new FootballTeam("RSA XI F", 1, 1, 1);


        LeagueTable<FootballTeam> footbalTeamLeauge = new LeagueTable<>(asList(indXiF, ausXiF, rsaXiF));
        footbalTeamLeauge.showLeagueBoard();
    }
}
