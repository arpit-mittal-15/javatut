public class QuickSorting {

  public static void main(String[] args) {
    
    int arr[] = {5,6,2,3,1,8,4};

    quickSort(arr, 0, arr.length-1);

    for(int num: arr){
      System.out.println(num);
    }

  }

  public static void quickSort(int arr[], int l, int h){

    if(h<=l) return;

    int pi = arr[h];

    int i = l-1;

    for(int j=l; j<h; j++){
      if(arr[j] < pi){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    int temp = arr[i+1];
    arr[i+1] = arr[h];
    arr[h] = temp;

    quickSort(arr, l, i);
    quickSort(arr, i+2, h);

  }
  
}
