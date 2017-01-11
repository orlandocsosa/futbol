package personas;

/**
 * Created by orlando.sosa on 1/6/2017.
 */
public class Player {

    String name;

    boolean isAbonado;

    public boolean isAbonado() {
        return isAbonado;
    }

    public String getName() {
        return name;
    }

    public Player(String name, boolean isAbonado){
        this.name = name;
        this.isAbonado = isAbonado;
    }


}
