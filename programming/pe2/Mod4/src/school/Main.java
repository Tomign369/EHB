package school;

public class Main {
    public static void main(String[] args) {
    Adres adresTom = new Adres("kerkstraat", 1, "402", 3680, "maaseik");

    Specialisatie specialisatieTom = Specialisatie.getSpecialisatie("IT");

    Student studentTom = new Student("tom", "ignoul", "tom@email.com", adresTom, 1, specialisatieTom);
    System.out.println(studentTom);

    }
}
