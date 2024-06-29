package collections;

import java.util.Objects;

public class Player {
    private String name;
    private String team;
    private int games;
    private int points;

    public Player(String name, String team, int games, int points) {
        this.name = name;
        this.team = team;
        this.games = games;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getGames() {
        return games;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return games == player.games && points == player.points && Objects.equals(name, player.name) && Objects.equals(team, player.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, team, games, points);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", games=" + games +
                ", points=" + points +
                '}';
    }
}
