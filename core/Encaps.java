class Human{
  private int age;
  private String name;

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }
  
}

public class Encaps {
  public static void main(String args[]){

    Human h1 = new Human();

    h1.setAge(20);
    h1.setName("Arpit");

    System.out.println(h1.getAge());
    System.out.println(h1.getName());

  }
}
