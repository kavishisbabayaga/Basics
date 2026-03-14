/*
Question:
You are given an integer array nums.
Your task is to find and return the largest element present in the array.
The array will contain at least one element.

Approach:
1. Assume the first element is the largest.
2. Traverse the array.
3. Update max if a larger value is found.
*/
public class MaxElement{
    public static int findLargest(int[] nums){
        int max = nums[0];
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {12, 45, 7, 89, 23};

        int largest = findLargest(nums);

        System.out.println("Largest element: " + largest);
    }
}