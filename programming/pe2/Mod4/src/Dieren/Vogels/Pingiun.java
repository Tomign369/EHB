package Dieren.Vogels;

public class Pingiun extends Vogels {
    public Pingiun(String geboorteDatum) {
        super(geboorteDatum);
    }

    @Override
    public boolean vlieg(){
        return false;
    }

    @Override
    public boolean zwem(){
        return true;
    }

    @Override
    public String maakGeluid() {
        return "ark-ark-ark";


    }

}
