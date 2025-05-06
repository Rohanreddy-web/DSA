public class Array3 {
    public static String sqrMat(int [][]mat, int n, int m,int diag[]) {
        int count=0;
        if (n==m) {
            while (count<mat.length) {
                diag[count]=mat[count][count];
                count++;
            }
            for (int i : diag) {
                System.out.print(i+" ");
            }
            System.out.println();
            return "YES";
        }
        return "no";

    }
    public static void main(String[] args) {
        int mat[][]={{1,2},{4,5}};
        int diag[]=new int[mat.length];
        int n=mat.length;
        int m=mat[0].length;
       System.out.println( sqrMat(mat, n, m, diag));

    }
}
