/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patte
 */
public class CourseScheduler {
    private static ArrayList<Course> courses;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instructor instructor1 = new Instructor();
        Instructor instructor2 = new Instructor("Brian", "Turman", "Crosby", 209);
        // System.out.println(instructor1);
        // System.out.println(instructor2.toString());
        
        Textbook text1 = new Textbook();
        Textbook text2 = new Textbook("The Big ol Book of Nothing", "Knot Reel Publishers", 3);
        // System.out.println(text1);
        // System.out.println(text2.toString());
        
        Course course1 = new Course("Comp Sci", "2", instructor1, text1);
        Course course2 = new Course("English", "1", instructor2, text2);
        System.out.println(course1);
        System.out.println(course2.toString());
        
        courses = new ArrayList <>();
        readCourseData(courses, args[0]);
        
    }
    
    public static void readCourseData(ArrayList courses, String filename) {
        try {
            Scanner read = new Scanner(new File(filename));
            while (read.hasNext()) {
                Course c = new Course();
                c.setName(read.nextLine());
                c.setSemester(read.nextLine());
                //gonna come back to this 
                c.setInstructor(read.nextLine(instructor1));
                c.setTextbook(text1);
                courses.add(c);
            }
        }
        catch(java.io.FileNotFoundException ex) {
            System.err.println("Input file not found");
            System.exit(-1);
        }
        
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }
}
