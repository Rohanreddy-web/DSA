public class MergeTwosortArrays {
public static void main(String[] args) {
    int A[]={1,2,3,4,5,6};
    int B[]={2,5,6};
    int m=0;
    int n=0;
    // for (int i = 0; i < A.length; i++) {
    //     if (A[i]!=0) {
    //         m++;
    //     }
    // }
    // for (int i = 0; i < B.length; i++) {
    //     if (B[i]!=0) {
    //         n++;
    //     }
    // }
    int size=m+n;
    int C[]=new int[size];
    int i=0,j=0,k=0;
    while (i<m && j<n) {
        if (A[i]<B[j]) {
            C[k]=A[i];
            i++; k++;
        }
        else{
            C[k]=B[j];
            j++; k++;
        }
    }
    while (i<m && k<size) {
        C[k]=A[i];
        i++; k++;
    }
    while (j<n && k<size) {
        C[k]=B[j];
        j++; k++;
    }

    for (int l : C) {
        System.out.print(l+" ");
    }
    
}
}
