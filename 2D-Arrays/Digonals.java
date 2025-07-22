public class Digonals {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8,9},{9,10,11,12},{13,14,15,16}};
        int size=matrix.length-1;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][size-i]+" ");
        }
    }
}
