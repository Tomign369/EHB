package Dieren.Zoogdieren;

import Dieren.Dier;

public abstract class Zoogdier extends Dier {

    public Zoogdier(String geboorteDatum){
        super(geboorteDatum);
    }

    @Override
    public boolean zwem(){
        return true;
    }

}
