package Dieren.Vogels;

public class Eend extends Vogels {
    public Eend(String geboorteDatum){
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
        return "kwak";
    }
}
