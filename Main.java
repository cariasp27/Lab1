import java.util.stream.IntStream;
/*
 * IT-2660 - Lab 1
 * Student Name: Paul Carias 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    int[] nums = { 5, 9, 3, 12, 7, 3, 11, 5 };
    int i = 0;
    int k = nums.length - 1;
    System.out.println("The array in order is: ");
    while (i < nums.length) {
      System.out.println(nums[i]);
      i++;
    }
    System.out.println("The array in reverse order is: ");
    for (k = k; k > 0; k--) {
      System.out.println(nums[k]);
    }
    System.out.println("The first value of the array is: " + nums[0] + " and the last value of the array is: " + nums[k]);
    System.out.println("The smaller value is: " + lab.min(67, 27));
    System.out.println("The larger value is: " + lab.max(27, 67));
    System.out.println("The sum of all values in the array is: " + lab.sum(nums));
    System.out.println("The average of the array is: " + lab.average(nums));
    System.out.println("The largest value in the array is: " + lab.maxarr(nums));
    System.out.println("The smallest value in the array is: " + lab.minarr(nums));

  }
}

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public int sum(int[] nums) {
    int arrsum = 0;
    for (int i : nums) {
      arrsum = arrsum + i;
    }
    return arrsum;
  }

  public float average(int[] nums) {
    float total = 0;
    for (int i : nums) {
      total = i + total;
    }
    float avg = total / nums.length;
    return avg;
  }

  public int maxarr(int[] nums) {
    int maxval = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > maxval) {
        maxval = nums[i];
      }
    }
    return maxval;
  }

  public int minarr(int[] nums) {
    int minval = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < minval) {
        minval = nums[i];
      }
    }
    return minval;
  };
}