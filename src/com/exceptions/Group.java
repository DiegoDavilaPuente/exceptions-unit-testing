package com.exceptions;

import java.util.*;

public class Group {
    private int maxOccupancy;
    private Set<Student> students;

    public Group(int maxOccupancy){
        this.maxOccupancy = maxOccupancy;
        students = new TreeSet<>();
    }

    public int getMaxOccupancy(){
        return maxOccupancy;
    }

    public void add(Student student) throws GroupOccupancyExceededException{
        if(students.contains(student)){
            return;
        }
        if(students.size() < maxOccupancy){
            students.add(student);
        } else {
            throw new GroupOccupancyExceededException();
        }
    }

    public List<Student> getStudents(){
        return new ArrayList<>(students);
    }

    public int availability(){
        return maxOccupancy - students.size();
    }

    public double getAverage(){
        double sum = 0;
        for(Student student : students) {
            if(student.getGrade() == null){
                throw new MissedGradeException();
            }
            sum += student.getGrade();
        }
        return sum / students.size();
    }
}
