import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Result array to store the product except self
        int[] res = new int[n];
        int prod = 1;

        // Left product calculation
        for (int i = 0; i < n; i++) {
            res[i] = prod;
            prod *= nums[i];
        }

        // Reset prod for right product calculation
        prod = 1;

        // Right product calculation
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= prod;
            prod *= nums[i];
        }

        // Output the result
        for (int x : res) {
            System.out.print(x + ",");
        }
    }
}
