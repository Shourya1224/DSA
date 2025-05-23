
public class AlternatePositiveNegative {
   
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;

       
        while (i < j) {
            while (i < n && arr[i] > 0) i++;
            while (j >= 0 && arr[j] < 0) j--;
            if (i < j) {
               
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

       
        if (i == 0 || i == n) return; 

       
        int k = 0;
        while (k < n && i < n) {
           
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;
            i++;
            k += 2;
        }
    }

    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -4, -1, 6, -9};
        System.out.println("Original array:");
        printArray(arr);

        rearrange(arr);

        System.out.println("Rearranged array:");
        printArray(arr);
    }
}
