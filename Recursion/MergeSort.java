public class MergeSort {
public static void divide(int arr2[]){
    if (arr2.length<=1) {
        return;
    }
    int left[]=new int[arr2.length/2];
    int right[]=new int[arr2.length-left.length];
    for (int i = 0; i < left.length; i++) {
        left[i]=arr2[i];
    }

    for (int i = arr2.length/2; i < arr2.length; i++) {
        right[i-arr2.length/2]=arr2[i];
    }
    divide(left);
    divide(right);
    merge(left,right,arr2);
}
public static void merge(int left[],int right[],int arr[]){
    int i=0,j=0,k=0;
    while (i<left.length && j<right.length) {
        if (left[i]<right[j]) {
            arr[k]=left[i];
            i++; k++;
        }
        else{
            arr[k]=right[j];
            j++; k++;
        }
    }
    while (i<left.length) {
        arr[k] = left[i];
        i++; k++;
    }
    while (j<right.length) {
        arr[k] = right[j];
        j++; k++;
    }
}
public static void main(String[] args) {
    int arr2[]={4,5,2,7,9,3};
    divide(arr2);
    for (int num : arr2) {
        System.out.print(num + " ");
    }
    
}
}
