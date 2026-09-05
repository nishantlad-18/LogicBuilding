package LogicBuilding.patternCode.PyramidPattern;
import java.util.*;

class Program6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        int r = row;
        int num = 64 + row;
        for(int i = 1; i <= row; i++){
            num = (65 + row)-i;
            for(int sp = 1; sp < i; sp++){
                System.out.print("\t");
            }
            for(int j =1; j <= r; j++){
                System.out.print((char)num + "\t");
                num--;
            }
            r--;
            System.out.println();
        }
    }
}