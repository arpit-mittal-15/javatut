public class MergeSorting {
  public static void main(String[] args) {
    
    int arr[] = {7,6,5,4,3,2};

    mergeSort(arr, 0, arr.length-1);

    for(int n: arr){
      System.out.print(n + " ");
    }

  }

  public static void mergeSort(int[] arr, int low, int high) {
    
    if(low >= high) return;

    int mid = (high + low)/2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid+1, high);

    int n1 = mid-low+1;
    int n2 = high-mid;

    int[] lArr = new int[n1];
    int[] rArr = new int[n2];

    for(int x=0; x<n1; x++){
      lArr[x] = arr[low+x];
    }
    for(int x=0; x<n2; x++){
      rArr[x] = arr[mid+1+x];
    }

    int i = 0;
    int j = 0;
    int index = low;

    while(i < n1 && j < n2){
      if(lArr[i] < rArr[j]){
        arr[index++] = lArr[i++];
      }
      else{
        arr[index++] = rArr[j++];
      }
    }

    while(i<n1){
      arr[index++] = lArr[i++];
    }
    while(j<n2){
      arr[index++] = rArr[j++];
    }

  }
}
