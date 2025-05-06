public class QuickSort {
    public static int partion(int arr[],int si,int ei){
        int pivotelement=arr[si];
        int countpivot=0;
     for (int i = si+1; i <=ei; i++) {
        if (arr[i]<pivotelement) {
            countpivot++;
        }
     }
     //swap
     int temp=arr[si+countpivot];
     arr[si+countpivot]=pivotelement;
     arr[si]=temp;
     //i,j checking
     int i=si,j=ei;
     while (i<j) {
        if (arr[i]<=pivotelement) {
            i++;
        }
        else if(arr[j]>=pivotelement){
            j--;
        }
        else{
            int temp2=arr[i];
            arr[i]=arr[j];
            arr[j]=temp2;
            i++;
            j--;
        }
     }
     return si+countpivot;
    }
    public static void quicksort(int arr[],int si,int ei){
        if (si>=ei) {
            return;
        }
     int partindx=partion(arr,si,ei);//2,4
     quicksort(arr,si,partindx-1);
     quicksort(arr, partindx+1, ei);

    }
public static void main(String[] args) {
    int arr[]={4,5,8,7,9,2};
    quicksort(arr,0,arr.length-1);
    for (int i : arr) {
        System.out.print(i+" ");
    }
   

}
}
