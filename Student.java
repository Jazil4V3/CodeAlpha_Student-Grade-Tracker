import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {   //constructor
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() { //getter method
        return name;
    }

    public void addGrade(int grade) {   //method to add a grade
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0; 

        for (int grade : grades) {//for loop to calculate the average
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public int getHighest() {
        if (grades.isEmpty()) {
            return 0;
        }

        int max = grades.get(0); //Set first index as max 
        
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }

        return max;
    }

    public int getLowest() {
        if (grades.isEmpty()) {
            return 0;
        }

        int min = grades.get(0);
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }

        return min;
    }
}




