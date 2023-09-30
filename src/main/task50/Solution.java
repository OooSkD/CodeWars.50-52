package task50;

/*
DESCRIPTION:
    A format for expressing an ordered list of integers is to use a comma separated
    list of either
        - individual integers
        - or a range of integers denoted by the starting integer separated from the end integer
          in the range by a dash, '-'. The range includes all integers in the interval including both
          endpoints. It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"

    Complete the solution so that it takes a list of integers in increasing order and returns a
    correctly formatted string in the range format.
    Example:
    Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9,
    10, 11, 14, 15, 17, 18, 19, 20})
    # returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
 */

public class Solution {
    public static String rangeExtraction(int[] arr) {
        String result = "";
        int index_beginning = 0, index_end = 0;
        while (index_beginning < arr.length) {
            while (++index_end < arr.length && arr[index_end] - arr[index_end - 1] == 1) ;
            if (index_end - index_beginning > 2) {
                result += arr[index_beginning] + "-" + arr[index_end - 1] + ",";
                index_beginning = index_end;
            } else {
                for (; index_beginning < index_end; index_beginning++)
                    result += arr[index_beginning] + ",";
            }
        }
        return result.substring(0,result.length()-1);
    }
}
