package LogicBuilding;
import java.util.*;

class Pattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        char arr[] = new char[size];
        int index1 = 0;
        int index2 = 0;

        System.out.println("Enter a alphabet in the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Enter a first alphabet : ");
        char ch1 = sc.next().charAt(0);

        System.out.println("Enter a second alphabet : ");
        char ch2 = sc.next().charAt(0);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ch1){
                index1 = i;
            }else if(arr[i] == ch2){
                index2 = i;
            }
        }
        
        for(int i = index1; i <= index2; i++){
            System.out.println(arr[i]);
        }
    }
}