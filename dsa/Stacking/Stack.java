public class Stack {

  int stack[] = new int[5];
  int top = 0;

  public void push(int data){
    stack[top++] = data;
  }

  public int pop(){
    int data;
    data = stack[top-1];
    top--;
    return data;
  }

  public void show(){
    for(int n: stack){
      System.out.print(n + " ");
    }
  }
}
