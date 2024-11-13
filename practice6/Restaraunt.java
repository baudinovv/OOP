package practice6;

public class Restaraunt {
  public String name;

  public Restaraunt(String name){
    this.name = name;
  }

  public boolean servePizza(CanHavePizza eater){
    
    System.out.println(this.name +  " served pizza");
    
    eater.eatPizza();

    return true;
  }

  public boolean servePizza(Student eater){
    if(eater.getMoney() - 10 >= 0){
      System.out.println(this.name +  " served pizza for " + eater.name);
      eater.subtractMoney(10);
      return true;
    }
    System.out.println("Sorry " + eater.name +  ", not enough money for pizza :(");
    return false;
  }

}