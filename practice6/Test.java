package practice6;

public class Test {
  public static void main(String[] args) {
    Student student = new Student("Alisher", 255, "CS");
    Restaraunt restaraunt = new Restaraunt("Dodo pizza");

    restaraunt.servePizza(student);
    System.out.println(student.getMoney());
  }
}
