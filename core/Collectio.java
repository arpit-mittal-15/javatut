import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collectio {
  public static void main(String[] args) {
    
    Collection<Integer> nums = new ArrayList<Integer>();

    nums.add(6);
    nums.add(5);
    nums.add(3);
    nums.add(9);

    Iterator<Integer> values = nums.iterator();

    while(values.hasNext()){
      System.out.println(values.next());
    }

    for(int n: nums){
      System.out.println(n);
    }

  }
}
