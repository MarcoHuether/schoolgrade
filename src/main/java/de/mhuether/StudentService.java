package de.mhuether;

import java.util.List;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StudentService
{

    private Logger logger = Logger.getLogger(GradleList.class.getName());

    @PersistenceContext(name = "schoolgrade")
    EntityManager entityManager;

    @PostConstruct
    public void load()
    {
        logger.info("PostConstruct StudentService");
    }

    @PreDestroy
    public void destroy()
    {
        logger.info("PreDestroy StudentService");
    }

    public List<Student> getAllStudents()
    {
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    public void addStudent(Student student)
    {
        entityManager.persist(student);
    }

}
