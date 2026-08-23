package LogicBuilding.Array;
import java.util.*;

class asciiValue {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter character : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("Character and its Ascii value : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
