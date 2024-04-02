import java.util.HashMap;

public class AddNumer_Target {


    public static void main(String[] args) {
        // Example usage:
        int[] nums = {2, 7, 11, 15};
        int target = 22;
        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No such pair found.");
        }
    }


    public static int[] twoSum ( int[] nums, int target){
        // Create a HashMap to store the complement of each element and its index
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current element
            int complement = target - nums[i];

            // Check if the complement is already in the HashMap
            if (numMap.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[]{numMap.get(complement), i};
            }

            // If the complement is not in the HashMap, add the current element and its index
            numMap.put(nums[i], i);
        }

        // If no such pair is found
        return null;
    }


}
