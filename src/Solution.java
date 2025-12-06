import java.util.Arrays;

public class Solution {

    public int[] productExceptSelf(int[] input) {
        // the result array will have the same length as the input
        int[] result = new int[input.length];
        // Setting everything as 1 by default
        Arrays.fill(result, 1);
        // Assigning values of 1 for both prefix and postfix variables
        int prefix = 1, postfix = 1;
        // first for loop--> left to right --> iterating and updating prefix values
        for (int i = 0; i < input.length; i++) {
            result[i] = prefix;
            prefix = input[i] * prefix;
        }
        // second for loop--> right to left --> iterating and updating postfix values
        for (int i = input.length - 1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix = postfix * input[i];
        }
        return result;
    }

}
