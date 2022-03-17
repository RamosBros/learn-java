package algorithms;

public class MaxContiguousSubarray {

    // For a given array of ints find the max contiguous sub array
    // Here is the solution to that problem
    // Here is a paper explanation for it
    // https://cse.hkust.edu.hk/mjg_lib/Classes/COMP3711H_Fall16/lectures/L01b_Max_Contig_Subarray.pdf

    // Runtime = O(n) Space = 1
    public static int findMaxContiguousSubarray(int[] array) {

        int max = array[0];
        int currentMax = array[0];

        for (int i = 0; i < array.length; i++) {
            currentMax = Math.max(currentMax + array[i], array[i]);
            max = Math.max(max, currentMax);
        }

        return max;
    }

    // Lets try to make it generic

    // public static <T> T findMaxContiguousSubarray(T[] array) {

    // T max = array[0];
    // T currentMax = array[0];

    // for(int i = 0; i < array.length; i++) {
    // currentMax = Math.max(currentMax + array[i], array[i]);
    // max = Math.max(max, currentMax);
    // }

    // return max;
    // }
}