package LogicBuilding.patternCode;
import java.util.*;

class Pattern9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entera row : ");
        int row = sc.nextInt();
        int ch = 64 + row;
        int num = row;

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(i % 2 == 1){
                    System.out.print((char)ch + "\t");
                }else{
                    System.out.print(num + "\t");
                }
            }
            System.out.println();
            ch--;
            num--;
        }
    }
}