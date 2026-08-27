package LogicBuilding.patternCode;
import java.util.*;

class Pattern13{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number of row : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = row; j >= i; j--){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
}