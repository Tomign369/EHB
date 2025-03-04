package school;

import java.util.Objects;

public class Student extends Persoon {
    private int studentNummer;
    private Specialisatie specialisatie;

    public Student(String voornaam,
                   String achternaam,
                   String email,
                   Adres adres,
                   int studentNummer,
                   Specialisatie specialisatie)

    {
    super(voornaam, achternaam, email, adres);
    this.studentNummer = studentNummer;
    this.specialisatie = specialisatie;
    }
    //getters
    public int getStudentNummer(){
        return studentNummer;
    }
    public Specialisatie getSpecialisatie(){
        return specialisatie;
    }
    //setters
    public void setSpecialisatie(Specialisatie specialisatie) {
        this.specialisatie = specialisatie;
    }
    public void setStudentNummer(int studentNummer){
        this.studentNummer = studentNummer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNummer == student.studentNummer && Objects.equals(specialisatie, student.specialisatie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNummer, specialisatie);
    }
    @Override
    public String toString(){
        return super.toString() +
                "StudentNummer: " + studentNummer + "," +
                " specialisatie = " + specialisatie.getNaam();
    }
}
