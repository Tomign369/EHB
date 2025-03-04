package Dieren.Zoogdieren;

public abstract class Vleermuis extends Zoogdier{
    public Vleermuis(String geboorteDatum){
        super(geboorteDatum);
    }

    @Override
    public String maakGeluid() {
        return "SuperSonicBlast";
    }
}
