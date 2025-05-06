public class ArraySum {

    public static int sumarray(int arr[], int i) {
        if (i < 0) {//base case
            return 0;
        }
        int ArraySum = sumarray(arr, i - 1);//recrusive function
        int sum = arr[i] + ArraySum;
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 3 };
        int index = arr.length - 1;
        int ans = sumarray(arr, index);
        System.out.println(ans);
    }
}
