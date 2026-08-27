package LogicBuilding.patternCode;
import java.util.*;

class pattern14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of row : ");
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++){
            int num = row;
            for(int j = row; j >= i; j--){
                System.out.print(num + "\t");
                num--;
            }
            System.out.println();
        }
    }    
}
