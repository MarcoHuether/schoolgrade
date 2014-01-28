package de.mhuether;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Model;

@Model
public class GradleList {
    private List<Student> students = new ArrayList<Student>();

    public GradleList() {
        students.add(new Student("Marco", "Hüther"));
        students.add(new Student("Janina", "Hüther-Georgi"));
    }

    public List<Student> getStudents() {
        return students;
    }
}
