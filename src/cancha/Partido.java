package cancha;

import personas.Player;

import java.util.ArrayList;

/**
 * Created by orlando.sosa on 1/6/2017.
 */
public class Partido {

    private ArrayList<Player> players = new ArrayList<Player>();

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void getPlayers(ArrayList<Player> players) {
        for (Player player : players){
            System.out.println(player.getName());
        }
    }

    public void removePlayer(Player player){
        players.remove(player);
    }

    public void addPlayer(Player player){
        if (players.size() < 10) {
            players.add(player);
        }
        else System.out.println("there's no more room");
    }
}
