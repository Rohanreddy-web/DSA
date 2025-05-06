public class binarySearchrec {
    public static int Bsearch(int s,int e ,int arr[],int x){
        if (s>e) {
            return-1;
        }
        int mid=(s+e)/2;
        if (arr[mid]==x) {
            return mid;
        }
        else if (arr[mid]<x) {
            int smalloutput=Bsearch(mid+1, e, arr, x);
            return smalloutput;
        }
        else{
            int smalloutput=Bsearch(s, mid-1, arr, x);
            return smalloutput;
        }
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    System.out.println(Bsearch(0, arr.length-1, arr, 3));

}
}
