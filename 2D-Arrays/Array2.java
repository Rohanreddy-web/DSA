public class Array2 {
    public static void row(int arr[][], int cols, int row) {
        for (int i = 0; i < cols; i++) {
            if (arr[row][i] != 0) {
                arr[row][i] = Integer.MIN_VALUE;
            }
        }
    }
    public static void col(int arr[][], int rows, int col) {
        for (int i = 0; i < rows; i++) {
            if (arr[i][col] != 0) {
                arr[i][col] = Integer.MIN_VALUE;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{7, 10, 3}, {4, 21, 0}};
        int N = arr.length; 
        int M = arr[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    row(arr, M, i);
                    col(arr, N, j);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == Integer.MIN_VALUE) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
