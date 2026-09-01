package LogicBuilding.patternCode;
import java.util.*;

class pattern17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            int num = 1;
            for(int j = 1; j <= row - i; j++){
                System.out.print("\t");
            }
            for(int k = 1; k <= i*2-1; k++){
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }    
}
