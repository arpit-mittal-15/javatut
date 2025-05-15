class A extends Object{  // every class extends Object if there is nothing else.
  public A(){
    super();
    System.out.println("in A");
  }
  public A(int n){
    super();
    System.out.println("in A int");
  }
}

class B extends A{
  public B(){
    super();   // super is present in every constructor whether we mention it or not.
    System.out.println("in B");
  }
  public B(int n){
    this();    // this calls the constructor of its own object. here it calls B();
    System.out.println("in B int");
  }
}

public class Super {
  public static void main(String args[]){

    B obj = new B(5);

  }
}
