class Calculator{
  int a;
  public int add(int n1, int n2){
    int r = n1 + n2;
    return r;
  }
}

class Obj{
  public static void main(String args[]){

    int num1 = 4;
    int num2 = 5;

    Calculator calc = new Calculator();

    int result = calc.add(4,5);

    System.out.println(result);
  }
}