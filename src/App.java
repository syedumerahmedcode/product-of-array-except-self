
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given an integer array 'nums', return an array 'answer' such that answer[i]
         * is equal to the product of all the elements of 'nums' except nums[i].
         * 
         * The product of any prefix or suffix of nums is guranteed to fit in a 32-bit
         * integer
         * 
         * You must write an algorithm that runs in O(n) time and without using the
         * division operator.
         * 
         * Input:[1,2,3,4]
         * Output:[24,12,8,6]
         * 
         * Input:[-1,1,0,,-3,3]
         * Output:[0,0,9,0,0]
         * 
         */
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        int[] input = { 1, 2, 3, 4 };
        int[] result = solution.productExceptSelf(input);
        System.out.println("The given input is :" + Arrays.toString(input)
                + " and the answer after doing 'product exceptSelf' is:" + Arrays.toString(result));

        int[] anotherInput = { -1, 1, 0, -3, 3 };
        result = solution.productExceptSelf(anotherInput);
        System.out.println("The given input is :" + Arrays.toString(
                anotherInput)
                + " and the answer after doing 'product exceptSelf' is:" + Arrays.toString(result));
    }
}
