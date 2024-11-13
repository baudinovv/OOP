package practice6;

public class Cat implements CanHavePizza {
  public String name;
  public double age;

  public Cat(String name, double age){
    this.name = name;
    this.age = age;
  }

  @Override
  public void eatPizza(){
    System.out.println("Kitty " + name + " is eating pizza!");
  }
}
