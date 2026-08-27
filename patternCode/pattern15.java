package LogicBuilding.patternCode;
import java.util.*;

class pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row : ");
        int row = sc.nextInt();
        int num = 1;

        for(int i = 1; i <= row; i++){
            for(int j = row; j >= i; j--){
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }
}