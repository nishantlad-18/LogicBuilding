package LogicBuilding;
import java.util.*;

class Pattern2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Row : ");
        int row = sc.nextInt();
        int num = 0;

        for(int i = 1; i <= row; i++){
            num = i;
            for(int j = 1; j <= row; j++){
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }

    }
}