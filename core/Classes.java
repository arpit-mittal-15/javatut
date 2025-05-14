class Mobile{
  String brand;
  int price;
  static String name;

  public void show(){
    System.out.println(brand + " : " + price + " : " + name);
  }

  public static void show1(Mobile obj){
    System.out.println(obj.brand + " : " + obj.price + " : " + name);
  }
}

public class Classes {
  public static void main(String args[]){

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1500;
    Mobile.name = "Smartphone";

  }
}
