import java.util.Arrays;
import java.util.Scanner;

public class KthMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        
        Arrays.sort(arr);

       
        if (k > 0 && k <= n) {
            int kthMin = arr[k - 1];
            int kthMax = arr[n - k];

            System.out.println("Kth Minimum element: " + kthMin);
            System.out.println("Kth Maximum element: " + kthMax);
        } else {
            System.out.println("Invalid value of K. It should be between 1 and " + n);
        }

        sc.close();
    }
}
