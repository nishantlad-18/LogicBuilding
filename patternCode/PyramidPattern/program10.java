package LogicBuilding.patternCode.PyramidPattern;
import java.util.*;

class program10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row = sc.nextInt();
        int ch = 65;

        for(int i = 1; i <= row; i++){
            ch = 65;
            for(int sp = 1; sp <= row-i; sp++){
                System.out.print("\t");
            }
            for(int j=1; j <= i*2; j++){
                if(j <= i) {
                    System.out.print((char)(ch + i - j) + "\t");
                }
                else {
                    System.out.print((char)(ch + j - i) + "\t");
                }
            }
            System.out.println();
        }
    }    
}
