package model;

public class Student implements Comparable<Student> {
    private String studentID;
    private int studentYears;
    private float studentAVGMark;
    private String studentName;

    public Student(){

    }

    public Student(String studentID){

    }

    public Student(String studentID, int studentYears, float studentAVGMark,
                   String studentName) {
        this.studentID = studentID;
        this.studentYears = studentYears;
        }

//thay đổi nhỏ cho nhánh 2
//test với nhánh 2
  public Student(String studentID, int studentYears, float studentAVGMark,
                   String studentName) {
        this.studentID = studentID;
        this.studentYears = studentYears;
	//thay đổi
        }