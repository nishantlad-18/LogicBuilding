package LogicBuilding.patternCode.PyramidPattern;
import java.util.*;

class program9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int sp = 1; sp <= row-i; sp++){
                System.out.print("\t");
            }
            for(int j =1; j <= i; j++){
                if(i%2==1){
                    System.out.print("*\t");
                }else{
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }
    }    
}
