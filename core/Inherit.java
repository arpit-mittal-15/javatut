class Calc{
  public int add(int n1, int n2){
    return n1 + n2;
  }
  public int sub(int n1, int n2){
    return n1 - n2;
  }
}

class AdvCalc extends Calc{
  public int multi(int n1, int n2){
    return n1 * n2;
  }
  public int div(int n1, int n2){
    return n1/n2;
  }
}

public class Inherit {
  public static void main(String args[]){

    AdvCalc obj = new AdvCalc();
    int r1 = obj.add(4,5);
    int r2 = obj.sub(5,3);

    System.out.println(r1 + " " + r2);

  }
}
