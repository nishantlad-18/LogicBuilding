package LogicBuilding.Array;
import java.util.*;

class sumIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int sum = 0;
        int arr[] = new int[size];

        System.out.println("Enter element in the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Element int the array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " "+i);
            if(i % 2 == 0){
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum of even index elements : "+sum);

        
    }    
}
