public class CloseIndex {
public static void main(String[] args) {
int arr[]={23, 24, 25, 36, 47};
int L=0,R=arr.length-1;
int low=0,high=arr.length-1;
int key=35;
while (L <= R) {
    int mid = (L + R) / 2;
    if (arr[mid] == key) {
        System.out.println(mid);
        break;
    } else if (arr[mid] < key) {
        L = mid + 1;
        low=mid;
    } else if (arr[mid] > key) {
        R = mid - 1;
        high=mid;
    }
}
System.out.println(arr[low]+"  "+arr[high]);
if (Math.abs(arr[low]-key)<Math.abs(key-arr[high])) {
    System.out.println(low);
    System.out.println(arr[low]);
}
else{
    System.out.println(high);
    System.out.println(arr[high]);
}

}
}

