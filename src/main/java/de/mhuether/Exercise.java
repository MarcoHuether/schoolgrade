package de.mhuether;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exercise
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    public String exerciseName;
    
    protected Exercise()
    {
        
    }

    public String getExerciseName()
    {
        return exerciseName;
    }
}
