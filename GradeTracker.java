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
  System.out.println("\n@@@ ")
}
