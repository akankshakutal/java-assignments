package com.step.assignment.Generics;

public class CricketTeam extends Team {

    public CricketTeam(String name, int wonMatchPoints, int lostMatchPoints, int drawMatchPoints) {
        super(name, wonMatchPoints*2, lostMatchPoints*0, drawMatchPoints*1);
    }

    @Override
    public int getPoints(){
        return getWonMatchPoints()*2 + getDrawMatchPoints();
    }

}
