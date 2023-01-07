package org.example.game;

import lombok.ToString;


import java.util.Comparator;
import java.util.UUID;


@ToString
public class Player implements Comparable<Player> {
    private String name;
    private int age;
    private UUID playerid;
    private Ligue ligue;
    private int matchPoint;
    private int allGamePoint;

    public Player(String name, int age, UUID playerid, Ligue ligue) {
        this.name = name;
        this.age = age;
        this.playerid = playerid;
        this.ligue = ligue;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public UUID getPlayerid() {
        return playerid;
    }

    public Ligue getLigue() {
        return ligue;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerid(UUID playerid) {
        this.playerid = playerid;
    }

    public void setLigue(Ligue ligue) {
        this.ligue = ligue;
    }

    public int getMatchPoint() {
        return matchPoint;
    }

    public void setMatchPoint(int matchPoint) {
        this.matchPoint = matchPoint;
    }

    public int getAllGamePoint() {
        return allGamePoint;
    }

    public void setAllGamePoint(int allGamePoint) {
        this.allGamePoint = allGamePoint;
    }

    @Override
    public int compareTo(Player o) {
        return this.getMatchPoint() - o.getMatchPoint();
    }

}
