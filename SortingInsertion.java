import java.util.Scanner;

public class SortingInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input number of elements
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        //initializing array
        int arr1[] = new int[n];
        
        //input array
        System.out.println("Enter the elements of array: ");
        for (int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        //time complexity O(n^2)
        //insertion Sorting
        for (int i=0; i<arr1.length; i++) {
            int current = arr1[i];
            int j = i-1;
            while (j>=0 && current < arr1[j]) {
                arr1[j+1] = arr1[j];
                j--;
            }
            //placement
            arr1[j+1] = current;
        }

        //printing sorted array
        System.out.println("\nSorted array:");
        for (int i=0; i<n; i++) {
            System.out.print(arr1[i]+" ");
        }
        sc.close();
    }
}
