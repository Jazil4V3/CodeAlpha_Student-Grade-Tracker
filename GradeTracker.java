import java.util.Scanner;

public class GradeTracker{
  private ArrayList<Student> students;

  public GradeTracker() {
    this.students = new ArrayList<>();
  }

  //Add a new student
  public void addStudent(Student student){
  students.add(student);
  }

  //Display summary
  public void displaySummary(){
    System.out.println("\n@@@ Student Grade Summary @@@");
    for (Student student : students){
    System.out.println("Name: " + student.getName());
    System.out.println("Grades: " + student.getGrades());
    System.out.println("Average: " + student.getAverage());
    System.out.println("Highest: " + student.getHighest());
    System.out.println("Lowest: " + student.getLowest());
    System.out.println("@@@------------------------@@@");
    }
  }
}
