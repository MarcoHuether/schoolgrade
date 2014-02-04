package de.mhuether;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class GradleList
{
    private Logger logger = Logger.getLogger(GradleList.class.getName());

    @Inject
    StudentService studentService;

    private List<Student> students = new ArrayList<Student>();

    @PostConstruct
    public void initDatabase()
    {
        logger.info("PostConstruct GradleList");
        studentService.addStudent(new Student("Marco", "Hüther"));
        studentService.addStudent(new Student("Janina", "Hüther-Georgi"));
    }
    
    @PreDestroy
    public void destroy()
    {
        logger.info("PreDestroy GradleList");
    }

    public List<Student> getStudents()
    {
        students.addAll(studentService.getAllStudents());
        return students;
    }
}
