package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        int[] res = new int[input.length];
        int low = 0;
        int high = input.length - 1;

        for (int i = input.length - 1; i >= 0; i--) {
            if (Math.abs(input[low]) >= Math.abs(input[high])) {
                res[i] = input[low] * input[low];
                low++;
            } else {
                res[i] = input[high] * input[high];
                high--;
            }
        }
        return res;
    }
}
