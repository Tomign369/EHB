package Dieren.Reptielen;

import Dieren.Dier;

public class Slang extends Reptiel{
    public Slang(String geboorteDatum){
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
        return "SSssSS";
    }
}
