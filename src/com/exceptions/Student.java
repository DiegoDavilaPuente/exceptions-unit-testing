package com.exceptions;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private Integer grade;
    private String name;
    private String id;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public void setGrade(Integer grade){
        this.grade = grade;
    }

    public Integer getGrade(){
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return id.compareTo(o.id);
    }
}
