package de.mhuether;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SchoolClass
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToMany
    private Set<Student> students;
    
    private String schoolClassName;

    protected SchoolClass()
    {
    }

    public String getSchoolClassName()
    {
        return schoolClassName;
    }
}
