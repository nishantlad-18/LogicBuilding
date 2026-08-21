package LogicBuilding.Array;
import java.util.*;

class search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array :");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter element in the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element which is search : ");
        int ser = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ser){
                System.out.println(ser + " element found at the index  "+ i);
            }
        }
    }    
}
