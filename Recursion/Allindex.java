public class Allindex {
public static void ALLIndex(int i,int arr[],int n,int key,int count){
 if (i==n) {
    helper(count, arr,key);
    return;
 }
 if (arr[i]==key) {
     count++;
 }
ALLIndex(i+1, arr, n, key,count);

}
public static void helper(int count,int arr[],int key){
    int matchindex[]=new int[count];
    int idx=0;
   for (int j = 0; j < arr.length; j++) {
     if (arr[j]==key) {
        matchindex[idx]=j;
        idx++;
     }
   }
   System.out.print("[");   
   for (int j : matchindex) {
     System.out.print(j+" ");
   }
   System.out.print("]");
   
}

public static void main(String[] args) {
    int arr[]={9, 8, 10 ,8, 8};
    int index=0,len=arr.length ,key=8,count=0;
    ALLIndex(index, arr, len,key ,count);

}
}
