package school;

public class School {
  public static void main(String[] args) {
    Student rafael = new Student();

    rafael.setName("Rafael Mercer");
    rafael.setAge(27);

    System.out.println("Student name " + rafael.getName() + " and age " + rafael.getAge());

  }
}
