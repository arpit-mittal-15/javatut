interface Computer{
  void code();
}

class Laptop implements Computer{
  public void code(){
    System.out.println("code, compile, run");
  }
}

class Desktop implements Computer{
  public void code(){
    System.out.println("code, compile, run: faster");
  }
}

class Developer{
  public void devApp(Computer comp){
    comp.code();
  }
}

public class Interfaces {
  public static void main(String[] args) {
    
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    lap.code();

  }
}
