public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 5, 1, 4, 2 };
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j <=arr.length-1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
