package LogicBuilding.patternCode;
import java.util.*;

class pattern19 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a row : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){
            int num =1 ;
            for(int j = 1; j <= row-i; j++){
                System.out.print("\t");
            }
            for(int k = 1; k <= i*2-1; k++){
                if(k < i){
                    System.out.print(num + "\t");
                    num++;
                }else{
                    System.out.print(num + "\t");
                    num--;
                }
            }
            System.out.println();
        }
    }    
}
