package ru.mirea.java.task13;

import java.util.Arrays;

public class Student {

    private String name;
    private int id;
    private int[] marks;
    private double avgScore;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Student(String name, int id, int[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        setAvgScore();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore() {
        double res = 0;
        for (int i : marks) res += i;
        this.avgScore = (double) Math.round((res / marks.length) * 100) / 100;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + Arrays.toString(marks) +
                ", avgScore=" + avgScore +
                '}';
    }
}
