import java.util.Arrays;

import static java.util.Collections.swap;

public class trial {
    public static void main(String[] args) {
        int[] list = {0,0,1,1,1,2,2,3,3,4};
        int k = Duplicates(list);
        System.out.println(k);
    }
    public static void swap(int[] list, int a, int b){
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i + 1] = -9999999;
            }
        }
        int pass = 0;
        while(pass < n){
            for (int i = 0; i<n-1; i++){
                if (nums[i] == -9999999){
                    swap(nums, i, i+1);
                }
            }
        pass++;
        }
        for (int num : nums) {
            if (num != -9999999) {
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
    static int Duplicates(int[] nums){
        int k = 0;
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int i = 1;
        for (int j=1; j<n; j++){
            if (nums[i-1] != nums[j]){
                nums[i] = nums[j];
                i++;
            }
        }
        for (int l = 0; l < n; l++){
            if (nums[l] < nums[l+1]){
                k++;
            }else {
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        return n-k;
    }
}