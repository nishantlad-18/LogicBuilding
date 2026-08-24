package LogicBuilding.Array.MultidimensionalArray;
import java.util.*;

class UserJagged {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a row : ");
        int row = sc.nextInt();

        int arr[][] = new int[row][];
        System.out.println("Enter a size of a column : ");
        for(int i = 0; i < arr.length; i++){
            int colSize = sc.nextInt();
            arr[i] = new int[colSize];
        }
        System.out.println("Enter element in the array :");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Element in the array :");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }    
}
