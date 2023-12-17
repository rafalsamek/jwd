package mysandbox.chatgpt;

public class ReverseArrayExample {
    public static void main(String[] args) {
        int n = 5; // You can change the value of n as needed

        // Initialize the array
        int[] arr = new int[n];

        // Fill the array with values from 1 to n
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // Display the original array
        System.out.println("Original Array:");
        displayArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Display the reversed array
        System.out.println("\nReversed Array:");
        displayArray(arr);
    }

    // Method to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    // Method to display the contents of the array
    private static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

