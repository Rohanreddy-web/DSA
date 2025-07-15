import java.util.ArrayList;

public class Array6 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
        };
        int top = 0;//start of master array
        int left = 0;//rows
        int right = arr[0].length - 1;//rows
        int bottem = arr.length - 1;//end of the master array
        ArrayList< ArrayList<Integer>> list=new ArrayList<>();
        list.contains(list)

        while (left <= right && top <= bottem) {
            // Print top row
            ArrayList<Integer> inn=new ArrayList<>();
            for (int i = left; i <= right; i++) {
                inn.add(arr[top][i]);
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottem; i++) {
                inn.add(arr[i][right]);
                System.out.print(arr[i][right] + " ");
            }
            right--;
              // bottom row
                for (int i = right; i >= left; i--) {
                    inn.add(arr[bottem][i]);
                    System.out.print(arr[bottem][i] + " ");
                }
            
                bottem--;


                for (int i = bottem; i >= top; i--) {
                  inn.add(  arr[i][left]);
                    System.out.print(arr[i][left] + " ");
                }
            
                left++;
                 list.add(inn);
        }
        System.out.println();
        System.out.println(list);
    }
}
