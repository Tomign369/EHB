package school;

import java.util.ArrayList;

public class StudentenLijst {
    private ArrayList<Student> studenten;
    public StudentenLijst() {
        studenten = new ArrayList<>();
    }


    public void AddStudent(Student student) {
        if (!studenten.contains(student)) {
            studenten.add(student);
        }else{
            throw new IllegalArgumentException("Student " + student + " already exists");
        }
    }

    public void RemoveStudent(Student student) {
        if (studenten.contains(student)) {
            studenten.remove(student);
        } else {
            throw new IllegalArgumentException("Student " + student + " does not exist");
        }
    }

    public ArrayList<Student> getStudenten(){
        return new ArrayList<>(studenten);
    }

    public Student getStudent(Student student){
        for (Student s : studenten) {
            if (s.equals(student)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Studentenlijst: " + studenten;
    }
}
