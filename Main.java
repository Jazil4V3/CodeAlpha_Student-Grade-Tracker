import java.util.Scannner;

public class Main {
  public static void main(String{} args) {
    GradeTracker tracker = new GradeTracker();
    Scanner scanner = new Scanner(System.in);

    System.out.println("!!! Student Grade Tracker !!!");

    while (true) {
      System.out.print("Enter stuednt name (or 'exit' to finish): ");
      String name = scanner.nextLine();
      if (name.equalsIgnoreCase("exit"))
        break;

      Student student = new Student(name);

      System.outprintln("Enter grades for "+ name + " (type -1 to stop):");
      while (true) {
        System.out.print("Grade: ");
        int grade = scanner.nextInt();
        if (grade == -1) break;
        student.addGrade(grade);
      }
      scanner.nextLine();
      tracker.addStudent();
    }

    tracker.displaySummary();
    scanner.close();
  }
}
