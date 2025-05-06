public class Arrays4 {
    public static  int maxcol(int arr[][],int row,int col,int max,int sum){
        for (int i = 0; i < row; i++) {
            sum=0;
            for (int j = 0; j < col; j++) {
                sum+=arr[j][i];
            }
            max=Math.max(max, sum);
         }
         return max;
    }
    public static int[][] info(){
      int arr[][]={{5,2,1,3},{4,6,8,7},{0,2,9,1},{5,7,6,4}};
      return arr;
    }
    public static int length(int arr[][]){
      int row=arr.length;
      return row;
    }
    public static void main(String[] args) {
    int arr[][]=info();
     int row=length(arr);
     int col=length(arr);
     int sum=0;
     int max=0;
    int ans= maxcol(arr, row,col,max,sum);
    System.out.println(ans);
    }
}
