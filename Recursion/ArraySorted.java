public class ArraySorted {
    public static boolean Check(int arr[], int index, int n) {
        if (index == n - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        boolean smallinput = Check(arr, index + 1, n);

        return smallinput;
    }

    public static int index(int[] arr, int i, int x) {
        if (i == arr.length) {
            return -1;
        }
        int ans = index(arr, i + 1, x);
        if (ans != -1) {//not overide it
            return ans;
        }
        if (arr[i] == x) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 5 };
        int index = 0;
        int n = arr.length;
        System.out.println(Check(arr, index, n));
        System.out.println(index(arr, 0, 5));

    }
}
