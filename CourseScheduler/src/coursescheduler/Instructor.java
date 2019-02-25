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
public class Instructor {
    private String firstName;
    private String lastName;
    private String officeBuilding;
    private int roomNum;
    
    public Instructor() {
        firstName = "Abert";
        lastName = "Einstein";
        officeBuilding = "McNair";
        roomNum = 420;
    }
    
    public Instructor (String firstName, String lastName, String officeBuilding, int roomNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeBuilding = officeBuilding;
        this.roomNum = roomNum;
    }
    
    public String toString() {
        return firstName + "*" + lastName + "*" + officeBuilding + "*" + roomNum;
    }
}
