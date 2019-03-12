package com.step.assignment.Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeagueTable<T extends Team> {
    private List<T> teams;

    public LeagueTable(List<T> list) {
        this.teams = list;
    }

    public void addTeam(T team){
        teams.add(team);
    }

    public void showLeagueBoard(){
        teams.sort(new Comparator<Team>() {
            @Override
            public int compare(Team o2, Team o1) {
                return o2.compareTo(o1);
            }
        });
        for (Team team :teams) {
            System.out.println("Team Name : " + team.getName());
        }
    }
}
