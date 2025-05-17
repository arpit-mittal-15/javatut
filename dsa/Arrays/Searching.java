public class Searching {
  public static void main(String[] args) {
    
    int nums[] = {5,7,9,11,13};
    int target = 11;

    int result = linearSearch(nums, target);
    int result2 = binarySearch(nums, target);

    if(result != -1)
      System.out.println("Element found at Index " + result);
    else
      System.out.println("result not found");

    if(result2 != -1)
      System.out.println("Element found at Index " + result2);
    else
      System.out.println("result not found");

  }

  public static int linearSearch(int[] nums, int target) {
  
    for(int i=0; i<nums.length; i++){
      if(nums[i] == target) return i;
    }
    return -1;

  }

  public static int binarySearch(int[] nums, int target){

    int s = 0;
    int e = nums.length - 1;

    while(s<=e){
      int mid = s + (e-s)/2;

      if(nums[mid] == target){
        return mid;
      }
      else if(nums[mid] < target){
        s = mid + 1;
      } 
      else {
        e = mid - 1;
      }
    }

    return -1;

  }
}
