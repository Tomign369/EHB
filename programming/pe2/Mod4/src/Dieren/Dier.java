package Dieren;

public abstract class Dier {
    private String geboorteDatum;
    public abstract String maakGeluid();

    public Dier(String geboorteDatum){
        this.geboorteDatum = geboorteDatum;
    }

    public String getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum() {
        this.geboorteDatum = geboorteDatum;
    }

    public boolean vlieg(){
        return false;
    }

    public boolean zwem(){
        return false;
    }

    public String kanVliegen() {
        if (vlieg()) {
            return "kan vliegen";
        } else {
            return "kan niet vliegen";
        }
    }

    public String kanZwemmen() {
        if (zwem()) {
            return "kan zwemmen";
        } else {
            return "kan niet zwemmen";
        }
    }

    @Override
    public String toString()  {
        return "Geboortedatum: " + geboorteDatum + "/n";
    }
}
