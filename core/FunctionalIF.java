@FunctionalInterface  // only 1 method is allowed
interface A{
  void show();
}

class B implements A{
  public void show(){
    System.out.println("in B show");
  }
}

public class FunctionalIF {
  public static void main(String args[]){

    A obj = () -> {    // lambda expressions only work with functional interface
        System.out.println("in A show");
      }
    ;

    obj.show();

  }
}
