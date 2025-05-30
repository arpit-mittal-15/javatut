import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
// import java.util.stream.Stream;

public class ArrayMethods {
  public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

    // Consumer<Integer> con = (Integer n) -> {
    //     System.out.println(n);
    //   }
    // ;

    // Stream<Integer> s1 = nums.stream(); // can be used only once
    // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
    // Stream<Integer> s3 = s2.map(n -> n*2);
    // int result = s2.reduce(0, (c,e) -> c+e);

    //in one line

    int result = nums.stream()
      .filter(n -> n%2 == 0)
      .map(n -> n*2)
      .reduce(0, (c,e) -> c+e);


    System.out.println(result);
    // s2.forEach(n -> System.out.println(n));

  }
}
