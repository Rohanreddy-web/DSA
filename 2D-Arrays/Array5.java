public class Array5 {
public static  int[] maxrow(int arr[][]){
    int max=Integer.MIN_VALUE;
    int index=-1;
    for (int i = 0; i < arr.length; i++) {
        int maxrow=0;
        for (int j = 0; j < arr[0].length; j++) {
            maxrow+=arr[i][j];

        }
        if (maxrow > max) {
            max=maxrow;
            index=i;
        }
    }
    int ans[]={max,index};
    return ans;
}
public static int[] maxcol(int arr[][]){
    int max=Integer.MIN_VALUE;
    int index=-1;
    for (int i = 0; i < arr[0].length; i++) {
        int maxcol=0;
        for (int j = 0; j < arr.length; j++) {
            maxcol+=arr[j][i];

        }
        if (maxcol > max) {
            max=maxcol;
            index=i;
        }
    }
    int ans[]={max,index};
    return ans;
}
public static void main(String[] args) {
    int[][] arr = {{6, 9, 8, 5}, {9, 2, 4, 1},{8, 3, 9, 3},{8, 7, 8, 6}};
    if (arr.length==0) {
        System.out.println("row 0"+" " + Integer.MIN_VALUE);
        return;
    }
   int row[]= maxrow(arr);
   int col[]=maxcol(arr);
   if (row[0]>col[0]) {
    System.out.print("Row" + " "+row[1]+" "+ row[0]);
   }
   else{
    System.out.print("column" + " "+col[1]+" " + col[0]);
   }

}
}
