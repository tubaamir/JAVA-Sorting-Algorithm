import java.util.Scanner;

public class SoringBubble {
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
        //Bubble Sorting
        for (int i=0; i<arr1.length -1; i++) {
            for (int j=0; j<arr1.length - i -1; j++) {
                if (arr1[j] > arr1[j+1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp; 
                }
            }
        }

        //printing sorted array
        System.out.println("\nSorted array:");
        for (int i=0; i<n; i++) {
            System.out.print(arr1[i]+" ");
        }
        sc.close();
    }
}