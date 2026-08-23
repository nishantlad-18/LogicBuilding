package LogicBuilding.Array;
import java.util.*;

class alternativeArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size in the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements in the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in the array : ");
        for(int i = 0; i < arr.length; i++){
            if(size % 2 == 0){
                System.out.println(arr[i]);
                i++;
            }else{
                System.out.println(arr[i]);
            }
        }

    }    
}
