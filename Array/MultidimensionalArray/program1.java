package LogicBuilding.Array.MultidimensionalArray;
import java.util.*;

class program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row and column in the array : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

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
