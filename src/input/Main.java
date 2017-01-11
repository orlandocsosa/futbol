package input;
import cancha.*;
import personas.Player;

import java.util.ArrayList;

/**
 * Created by orlando.sosa on 1/6/2017.
 */
public class Main {

    public static void main(String[] args){

        Partido partido = new Partido();
        ArrayList<Player> players = partido.getPlayers();
        Player orlando = new Player("Orlando", true);
        partido.addPlayer(orlando);
        Player martin = new Player("Martin", false);
        partido.addPlayer(martin);
        Player firstAbonado = players.get(0);
        Cobrador cobrador = new Cobrador(orlando);
        Cobrador cobradorlista = new Cobrador(players);

        System.out.println(firstAbonado.getName());
        System.out.println("Lista de Players: ");
        partido.getPlayers(players);
        cobradorlista.cobroListaAbonados();
        partido.removePlayer(orlando);
        System.out.println("Lista de Players after removal: ");
        partido.getPlayers(players);
        cobrador.cobroAbonado();

    }
}
