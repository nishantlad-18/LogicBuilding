package LogicBuilding.patternCode.PyramidPattern;
import java.util.*;

class program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row :");
        int row = sc.nextInt();
        int cnt = row*2-1;

        for(int i = 1; i <= row; i++){
            for(int sp = 1; sp < i; sp++){
                System.out.print("\t");
            }
            for(int j = 1; j <=cnt; j++){
                System.out.print("*\t");
            }
            System.out.println();
            cnt -= 2;
        }
    }    
}
