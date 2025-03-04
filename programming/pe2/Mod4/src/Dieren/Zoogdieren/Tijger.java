package Dieren.Zoogdieren;

public class Tijger extends Zoogdier {
    
    public Tijger(String geboorteDatum){
        super(geboorteDatum);
    }
    
    @Override
    public String maakGeluid(){
        return "Roar";
    }

}