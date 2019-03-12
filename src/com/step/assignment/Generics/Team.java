package com.step.assignment.Generics;

public abstract class Team {
    private String name;
    private int wonMatchPoints;
    private int lostMatchPoints;
    private int drawMatchPoints;


    public Team(String name, int wonMatchPoints, int lostMatchPoints, int drawMatchPoints) {
        this.name = name;
        this.wonMatchPoints = wonMatchPoints;
        this.lostMatchPoints = lostMatchPoints;
        this.drawMatchPoints = drawMatchPoints;
    }



    int getWonMatchPoints() {
        return wonMatchPoints;
    }

    int getLostMatchPoints() {
        return lostMatchPoints;
    }

    int getDrawMatchPoints() {
        return drawMatchPoints;
    }

    public abstract int getPoints();

    String getName() {
        return name;
    }

    int compareTo(Team team){
        int totalPointsOfFirstTeam = this.getPoints();
        int totalPointsOfSecondTeam = team.getPoints();
        if(totalPointsOfFirstTeam < totalPointsOfSecondTeam)
            return -1;
        if(totalPointsOfFirstTeam > totalPointsOfSecondTeam)
            return 1;
        return 0;
    }
}
