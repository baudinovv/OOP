package practice6;

public class Student implements CanHaveParty, CanHaveRetake, CanHavePizza{
  public String name;
  public int money; 
  public String major;

  public Student(String name, int money, String major){
    this.name = name;
    this.money = money;
    this.major = major;
  }
  
  public void addMoney(int sum){
    this.money += sum;
  }
  public void subtractMoney(int sum){
    this.money -= sum;
  }

  public int getMoney(){
    return this.money;
  }

  @Override
  public void eatPizza(){
    System.out.println(name + " is eating pizza!");
    subtractMoney(10);
  }
  
  @Override
  public void dance(){
    System.out.println(name + " is dancin'");
  }
  
  @Override
  public void grabRetake(){
    System.out.println(name + " got a retake! He's/She's major is " + this.major);
  }

  @Override 
  public void move(){
    System.out.println(name + " is moving!");
  }

}
