import java.util.HashMap;
import java.util.Map;

public class Mapping {
  public static void main(String[] args) {
    
    Map<String, Integer> students = new HashMap<>();

    students.put("Navin", 34);
    students.put("Arpit", 43);
    students.put("Harsh", 23);
    students.put("Piku", 65);
    students.put("Kiran", 76);

    System.out.println(students.get("Harsh"));

    for(String key: students.keySet()){
      System.out.println(key + " : " + students.get(key));
    }

  }
}
