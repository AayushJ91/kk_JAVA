import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){
        int[] list = {-24,-19,5,6,45,56,78};
        int[] sorted = InsertionSort(list);
        System.out.println(Arrays.toString(sorted));
    }
    public static void swap(int[] list, int a, int b){
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
    static int[] BubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }
    static int[] InsertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i <= n-2; i++){
            for (int j = i+1; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    static int SelectionSort(int[] arr){
        return 5;
    }
}
