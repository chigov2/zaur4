package aop;

public class Student {
    private String nameLastname;
    private int course;
    private double avgGrade;

    public Student(String nameLastname, int course, double avgGrade) {
        this.nameLastname = nameLastname;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getNameLastname() {
        return nameLastname;
    }

    public void setNameLastname(String nameLastname) {
        this.nameLastname = nameLastname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameLastname='" + nameLastname + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
