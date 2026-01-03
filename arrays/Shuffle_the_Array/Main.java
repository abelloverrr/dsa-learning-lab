package arrays.Shuffle_the_Array;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] shuffledArray = solution.shuffle(nums, n);
        
        // Print the shuffled array
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}
