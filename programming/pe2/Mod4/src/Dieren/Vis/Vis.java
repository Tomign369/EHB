package Dieren.Vis;
import Dieren.Dier;

public abstract class Vis extends Dier {

    public Vis(String geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public boolean zwem(){
        return true;
    }


}
