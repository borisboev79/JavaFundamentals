package models;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    String name;
    double avgGrade;

    public Student(String name, double avgGrade) {
        this.name = name;
        this.avgGrade = avgGrade;
    }
}
