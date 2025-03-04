package school;
import java.util.ArrayList;
import java.util.List;

public class Specialisatie {
    private String naam;
    private static List<Specialisatie> specialisaties = new ArrayList<>();

    //Constructor
    public Specialisatie(String naam) {
        this.naam = naam;
    };

    //getter
    public String getNaam(){
        return naam;
    }

    //retrieve exisiting specialization or create a new one
    public static Specialisatie getSpecialisatie(String naam){
        for (Specialisatie spec : specialisaties) {
            if (spec.getNaam().equalsIgnoreCase(naam)) {
                return spec;
            }
        }
        Specialisatie newSpec = new Specialisatie(naam);
        specialisaties.add(newSpec);
        return newSpec;
    }
@Override
    public String toString() {
        return naam;
}

}


