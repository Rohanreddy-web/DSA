public class Array1 {
public static void main(String[] args) {
int arr[][]={{1,2,3},{4,5,6}};
int a[]=new int[6];
int r=arr.length;
int c=arr[0].length;
int count=0;
for (int i = 0; i <r; i++) {
    for (int j = 0; j <c; j++) {
        a[count]=arr[i][j];
        count++;
    }
    System.out.println();
}
for (int i : a) {
    System.out.print(i +" ");
}

}
}
// Given array is square Matrix