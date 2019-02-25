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
public class CourseScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instructor instructor1 = new Instructor();
        Instructor instructor2 = new Instructor("Brian", "Turman", "Crosby", 209);
        System.out.println(instructor1);
        System.out.println(instructor2.toString());
        
        Textbook text1 = new Textbook();
        Textbook text2 = new Textbook("The Big ol Book of Nothing", "Knot Reel Publishers", 3);
        System.out.println(text1);
        System.out.println(text2.toString());
    }
    
}
