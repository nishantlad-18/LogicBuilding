package LogicBuilding.patternCode;
import java.util.*;

class pattern8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row : ");
        int row = sc.nextInt();
        int num = 64 + row;

        for(int i = 1; i <= row; i++){
            num = 64+row;
            for(int j = 1; j <= row; j++){
                System.out.print((char)num + "\t");
                num--;
            }
            System.out.println();
        }
    }    
}
