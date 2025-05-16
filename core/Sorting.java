import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
  public static void main(String[] args) {

    Comparator<Integer> com = (Integer i, Integer j) -> {
        // if(i%10 > j%10) 
        //   return 1;
        // else 
        //   return -1;
        return i%10 > j%10 ? 1 : -1;
      }
    ;
    
    List<Integer> nums = new ArrayList<>();

    nums.add(43);
    nums.add(21);
    nums.add(92);
    nums.add(54);

    // nums.sort(null);

    Collections.sort(nums, com);

    for(int i: nums){
      System.out.println(i);
    }

  }
}
