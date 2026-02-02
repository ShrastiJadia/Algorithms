package Questions;


public class SlidingWindow 
{
    static int maxSumSubarray(int arr[], int k) 
    {
        int n = arr.length;
        if (n < k)
        {
            System.out.println("Window size greater than array size");
            return -1;
        }

        // Step 1: Compute sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++)
            windowSum += arr[i];

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++)
        {
            windowSum += arr[i] - arr[i - k]; // add next element, remove previous
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSumSubarray(arr, k));
    }

}


	




