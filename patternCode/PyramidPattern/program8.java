package LogicBuilding.patternCode.PyramidPattern;
import java.util.*;

class program8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row = sc.nextInt();
        int num = 1;
        
        for(int i = 1; i <= row; i++){
            // for(int sp = 1; sp < i; sp++){
            //     System.out.print("\t");
        
            for(int j = 1; j <= i;j++){
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
    }        
}
