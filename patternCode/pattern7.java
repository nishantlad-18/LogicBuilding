package LogicBuilding.patternCode;
import java.util.*;

class pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }    
}
