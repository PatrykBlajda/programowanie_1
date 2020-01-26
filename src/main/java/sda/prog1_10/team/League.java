package sda.prog1_10.team;

import sda.prog1_10.methods.person.Person;
import sda.prog1_10.methods.person.Race;
import java.util.Collections;

import java.util.*;

public class League {

    private String name;
    private List<Team> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<Team>();


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addTeam(Team team) {

        if(!teams.contains(team)){
            System.out.println("Adding " + team.getName() + " to " + name);
            return teams.add(team);
        }

        System.out.println("Team " + team.getName() + "allready in league");
        return false;


    }
    public void printTable() {
        Collections.sort(teams);
        System.out.println(name + "table:");
        for (Team team : teams){
            System.out.println(team.getName() + " " +team.getPoints());
        }

    }
}