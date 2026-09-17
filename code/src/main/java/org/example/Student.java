package org.example;

public class Student extends Person implements Comparable<Student> {

    private String studentNumber = "Not Assigned";

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, String studentNumber) {
        super(name, age);
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        String rslt = super.toString();
        rslt += " [stu#: " + studentNumber + "]";
        return rslt;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        else if (obj instanceof Student) {
            return studentNumber.equals(((Student) obj).studentNumber);
        }
        return false;
    }

    @Override
    public int compareTo(Student o) {
        return studentNumber.compareTo(o.studentNumber);
    }
}