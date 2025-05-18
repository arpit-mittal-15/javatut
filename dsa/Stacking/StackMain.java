public class StackMain {
  public static void main(String[] args) {
    
    Stack nums = new Stack();
    nums.push(5);
    nums.push(15);
    nums.push(10);

    nums.show();
    System.out.println();

    System.out.println(nums.pop());

    nums.show();

  }
}
