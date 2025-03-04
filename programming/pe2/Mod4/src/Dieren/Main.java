package Dieren;

import Dieren.Reptielen.Slang;
import Dieren.Vis.NoordZeeZalm;
import Dieren.Vis.Vis;
import Dieren.Vogels.Pingiun;
import Dieren.Zoogdieren.Tijger;
import Dieren.Amfibie.Kikker;

public class Main {
    public static void main(String[] args) {
        Tijger tijger1 = new Tijger("01/03/2025");
        System.out.println(tijger1.getGeboorteDatum());
        System.out.println(tijger1.maakGeluid());
        System.out.println(tijger1.kanZwemmen());
        System.out.println(tijger1.kanVliegen());
        System.out.println("\n");

        Kikker kikker1 = new Kikker("26/02/2025");
        System.out.println(kikker1.getGeboorteDatum());
        System.out.println(kikker1.maakGeluid());
        System.out.println(kikker1.zwem());
        System.out.println("\n");


        Slang slang1 = new Slang("33/01/2025");
        System.out.println(slang1.getGeboorteDatum());
        System.out.println(slang1.maakGeluid());
        System.out.println("\n");

        NoordZeeZalm NoordZeeZalm1 = new NoordZeeZalm ("01/03/2025");
        System.out.println(NoordZeeZalm1.getGeboorteDatum());
        System.out.println(NoordZeeZalm1.maakGeluid());
        System.out.println(NoordZeeZalm1.kanZwemmen());
        System.out.println("\n");

        Pingiun Pingiun1 = new Pingiun ("01/03/2025");
        System.out.println(Pingiun1.getGeboorteDatum());
        System.out.println(Pingiun1.maakGeluid());
        System.out.println(Pingiun1.kanZwemmen());
        System.out.println(Pingiun1.kanVliegen());
        System.out.println("\n");

    }
}
