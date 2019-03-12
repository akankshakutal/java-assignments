package com.step.assignment.Generics;

public class FootballTeam extends Team{

    public FootballTeam(String name, int wonMatchPoints, int lostMatchPoints, int drawMatchPoints) {
        super(name, wonMatchPoints, lostMatchPoints, drawMatchPoints);
    }

    @Override
    public int getPoints(){
        return getLostMatchPoints()*-2+ getWonMatchPoints();
    }

}
