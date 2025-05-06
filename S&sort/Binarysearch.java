import java.util.Scanner;
public class Binarysearch {
    public static int binarysearch(int arr[], int key) {
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                L = mid + 1;
            } else if (arr[mid] > key) {
                R = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        System.out.print("Enter the element to find");
        int key = sc.nextInt();
        System.out.println("Element found at index"+"  "+binarysearch(arr, key));
    }
}