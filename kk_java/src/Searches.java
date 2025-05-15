import java.util.Scanner;

public class Searches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the targeted number: ");
        int target = input.nextInt();
        int[] list = {-24,-19,5,6,45,56,78};
        System.out.println(LinearSearch(list, target));
    }
    static int LinearSearch(int[] arr, int target){
        int out = -1;
      for(int i = 0; i < arr.length; i++){
          if(arr[i] == target){
              out = i;
              return out;
          }
      }
      return out;
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int last = arr.length;
        while(start <= last) {
            int mid = start + ((last - start) / 2);
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid;
            } else if (target < arr[mid]) {
                last = mid - 1;
            }
        }
        return -1;
    }
}