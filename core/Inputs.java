import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {
  public static void main(String args[]) throws IOException {

    System.out.println("Enter a number");

    // 1st method 

    // int num = System.in.read();  // reads ASCII value for 1st character only.

    // 2nd method

    // InputStreamReader in = new InputStreamReader(System.in);
    // BufferedReader bf = new BufferedReader(in);
    // int num = Integer.parseInt(bf.readLine());
    // System.out.println(num);
    // bf.close();

    // 3rd method

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(num);
    sc.close();
  }
}
