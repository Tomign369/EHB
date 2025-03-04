package Dieren.Vogels;

public class Arend extends Vogels {
    public Arend(String geboorteDatum) {
        super(geboorteDatum);
    }


    @Override
    public String maakGeluid(){
        return "iii";
    }
}
