package lesson4;

import java.util.ArrayList;

public class SelfTraining {
    public static void main(String[] args) {

    }

    //Given an array of ints, return true if the array contains no 1's and no 3's.
    //lucky13([0, 2, 4]) → true
    //lucky13([1, 2, 3]) → false
    //lucky13([1, 2, 4]) → false
    public boolean lucky13(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 1 || nums[i] == 3)
                result = false;
        return result;

    }

    // Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    public boolean has22(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && i > 0 && nums[i - 1] == 2) {
                result = true;
            }
            if (nums[i] == 2 && i < nums.length - 1 && nums[i + 1] == 2) {
                result = true;
            }
        }
        return result;
    }

    //Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
    public boolean arrayFourNine(int[] nums) {
        int len = nums.length;

        if (len <= 4){
            for (int i = 0; i < len; i++){
                if (nums[i] == 9)
                return true;
      else;}
        }
        else {
            for (int j = 0; j < 4; j++) {
                if (nums[j] == 9)
                return true;
        else;
            }
        }

        return false;
    }
    //Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.
    //maxTriple([1, 2, 3]) → 3
    //maxTriple([1, 5, 3]) → 5
    //maxTriple([5, 2, 3]) → 5
   // public int maxTriple(int[] nums){
   //     int result = 0;
  //      int a = nums[0];
  //      int b =
  //  }

}
