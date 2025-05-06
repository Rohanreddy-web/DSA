public class EquilibriumIndexTwoLoops {
    public static int indexe(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int[] arr = {1 ,-1, 4};
        int index = indexe(arr);
        System.out.println("Equilibrium Index: " + index);
    }
}
