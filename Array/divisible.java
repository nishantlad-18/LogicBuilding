package LogicBuilding.Array;
import java.util.*;

class divisible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array :");
        int size = sc.nextInt();

        int count = 0;
        int arrEle[] = new int[size];

        System.out.println("Enter element of array : ");
        for(int i = 0; i < arrEle.length; i++){
            arrEle[i] = sc.nextInt();
        }

        for(int i = 0; i < arrEle.length; i++){
            if(arrEle[i] % 4 == 0){
                count++;
            }
        }
        System.out.println(count + "  Numbers are divible by 4 in the array");
    }    
}
