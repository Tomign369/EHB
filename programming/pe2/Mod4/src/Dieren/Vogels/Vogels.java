package Dieren.Vogels;
import Dieren.Dier;
public abstract class Vogels extends Dier{
    public Vogels(String geboorteDatum){
        super(geboorteDatum);
    }

    @Override
    public boolean vlieg() {
        return true;
    }
}
