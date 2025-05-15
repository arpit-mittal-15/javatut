public class HandleException {
  public static void main(String args[]){

    int i = 0;
    int j = 0;

    try{
      j = 18/i;  // dividing by 0 throws error

      if(j == 0)
        throw new ArithmeticException("i dont want to print zero");
    }
    catch(ArithmeticException e){
      System.out.println("cannot divide by 0");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("stay in your limit");
    }
    catch(Exception e){
      System.out.println("Something went wrong " + e);
    }

    System.out.println(j);

    System.out.println("bye");

  }
}
