package LinkedList;
import java.util.ArrayList;
public class List {
    public static ArrayList<Integer> remove(int arr[]){
      ArrayList<Integer> newArray=new ArrayList<>();
      newArray.add(arr[0]);
      for (int i = 1; i < arr.length; i++) {
         if (arr[i]!=arr[i-1]) {
            newArray.add(arr[i]);
         }
      }
      return newArray;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        // System.out.println(arr);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.size();
        System.out.println(arr.get(1));
        arr.add(2,60);
        int index=arr.indexOf(20);
        arr.set(index,100);
        Integer i=arr.get(2);//it is object 
        arr.remove(i);
        arr.remove(2);
        System.out.println(arr.size());
        int arr1[]={10,10,20,20,30,40,50};
        ArrayList<Integer> result=remove(arr1);
        System.out.println(result);
       
    }
}

