/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

/**
 *
 * @author patte
 */
public class Course {
    private String name;
    private String semester;
    private Instructor instructor;
    private Textbook textbook;
    
    public Course () {
        name = null;
        semester = null;
        instructor = null;
        textbook = null;
    }
    
    public Course (String name, String semester, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.semester = semester;
        this.instructor = instructor;
        this.textbook = textbook;
    }
    
    public String toString () {
        return name + ", " + semester + System.getProperty("line.separator") + instructor.toString() + System.getProperty("line.separator") + textbook;
    }
}
