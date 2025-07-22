import java.util.Arrays;

public class Array1 {
public static void main(String[] args) {
 int[][] arr = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };
int a[]=new int[2];
boolean flag=false;
int r=arr.length;
int c=arr[0].length;
int targ=18;
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      if(arr[i][j]==targ){
        a[0]=i;
        a[1]=j;
        flag=true;
      }
    }
}
if (!flag) {
    System.out.println("element not found -1, -1");
}
else{
System.out.println(Arrays.toString(a));
}

// int rowcount=0;
// int colomcount=0;
// for (int i = 0; i <r; i++) {
//     int rowcount=0;
//     int max=Integer.MIN_VALUE;
//     for (int j = 0; j <c; j++) {
//         rowcount+=arr[i][j];
//         max=Math.max(rowcount, max);
//     }
//     System.out.println("rowsum"+i+" "+rowcount);
    
// }
// for (int i = 0; i <r; i++) {
//     int colomcount=0;
//     for (int j = 0; j <c; j++) {
//         colomcount+=arr[j][i];
//     }
//      System.out.println("colomsum"+i+" "+colomcount);
// }

// // for (int i : a) {
// //     System.out.print(i +" ");
// // }
// System.out.println();
// for (int elemrnt[] : arr) {
//     for (int i : elemrnt) {
//         System.out.print(i);
//     }
//     System.out.println();
// }

}
}
// Given array is square Matrix