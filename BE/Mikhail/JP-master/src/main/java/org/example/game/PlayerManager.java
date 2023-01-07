package org.example.game;

import com.github.javafaker.Faker;

import java.util.*;

public class PlayerManager {
    private List<Player> playersFirst = new ArrayList<>();
    private List<Player> playersSecond = new ArrayList<>();
    private List<Player> playersGold = new ArrayList<>();

    protected List<Player> makeTeam(Ligue lig) {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < random.nextInt(26, 50); i++) {
            switch (lig) {
                case GOLD -> this.playersGold.add(new Player(faker.name().lastName(), random.nextInt(35,40), UUID.randomUUID(), Ligue.GOLD));
                case FIRST -> this.playersFirst.add(new Player(faker.name().lastName(), random.nextInt(15,18), UUID.randomUUID(), Ligue.FIRST));
                case SECOND -> this.playersSecond.add(new Player(faker.name().lastName(), random.nextInt(18,35), UUID.randomUUID(), Ligue.SECOND));
            }
        }
        return switch (lig) {
            case FIRST -> getPlayersFirst();
            case GOLD -> getPlayersGold();
            case SECOND -> getPlayersSecond();
        };
    }

    protected void playerUp (Player player) {
        switch (player.getLigue()) {
            case FIRST -> {
                player.setLigue(Ligue.SECOND);
                System.out.println("ligue up: " + player);
                playersSecond.add(player);
                playersFirst.remove(player);
            }
            case SECOND -> {
                player.setLigue(Ligue.GOLD);
                System.out.println("lig up: " + player);
                playersGold.add(player);
                playersSecond.remove(player);
            }
        }
    }

    protected void playersZeroPoint(List<Player> list){
        for (Player player :list) {
            player.setMatchPoint(0);
        }
    }

    protected void playerDown (Player player) {
        switch (player.getLigue()) {
            case GOLD -> {
                player.setLigue(Ligue.SECOND);
                System.out.println("ligue down: " + player);
                playersGold.remove(player);
                playersSecond.add(player);
            }
            case SECOND -> {
                player.setLigue(Ligue.FIRST);
                System.out.println("ligue down: " + player);
                playersSecond.remove(player);
                playersFirst.add(player);
            }
        }
    }

    public List<Player> getPlayersFirst() {
        return playersFirst;
    }

    public List<Player> getPlayersSecond() {
        return playersSecond;
    }

    public List<Player> getPlayersGold() {
        return playersGold;
    }

}
