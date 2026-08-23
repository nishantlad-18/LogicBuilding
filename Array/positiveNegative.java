package LogicBuilding.Array;
import java.util.*;

class positiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter numbers in the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in the array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = arr[i] * (-1);
            }
        }

        System.out.println("Array converting after negative to positive : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }    
}
