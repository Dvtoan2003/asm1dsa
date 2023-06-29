/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demosinglylinked1;

/**
 *
 * @author Admin
 */
public class Student {
    private int StudentId;
    private String StudentName;
    private int StudentAge;

    public Student(int StudentId, String StudentName, int StudentAge) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.StudentAge = StudentAge;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int StudentAge) {
        this.StudentAge = StudentAge;
    }
   
    public void printInfo(){
        System.out.println("\n ID: " + this.StudentId);
        System.out.println("\n Name: " + this.StudentName);
        System.out.println("\n Age: " + this.StudentAge);
    }
   
}
