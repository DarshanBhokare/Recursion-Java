package Arrays;
// Given an array, Find an item in it using linear search
public class LinearSearch {

  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7,8};
    System.out.println(search(arr,5,0));
  }

  static boolean search(int[] arr, int target, int index) {
    if(index==arr.length)
      return false;
//    if(arr[index]==target)
//      return true;
//    return search(arr,target,index+1);
    return arr[index]==target || search(arr, target, index+1);
  }

}
