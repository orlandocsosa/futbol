package cancha;

import personas.Player;

import java.util.ArrayList;

/**
 * Created by orlando.sosa on 1/10/2017.
 */
public class Cobrador {

    Player player;
    ArrayList<Player> players;
    double monto = 95;

    public Cobrador(Player player) {

        this.player = player;
    }

    public Cobrador(ArrayList<Player> players) {

        this.players = players;
    }

    public void cobroAbonado() {
        if (player.isAbonado()) {
            System.out.println(player.getName() + " Paga 85$ por partido");
        } else System.out.println(player.getName() + " Paga 95$ por partido");
    }

    public void cobroListaAbonados() {
        for (Player player : players) {
            if (player.isAbonado() == true) {
                System.out.println(player.getName() + " Paga 85$ por partido");
            } else System.out.println(player.getName() + " Paga 95$ por partido");
        }
    }
}
