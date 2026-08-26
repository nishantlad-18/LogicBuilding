package LogicBuilding.patternCode;
import java.util.*;

class pattern10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row : ");
        int row = sc.nextInt();
        int num = 64;
        char ch = 'A';
        for(int i = 1; i <= row; i++){
                num = 64 + row;
                ch = 'A';
                for(int j = 1; j <= row; j++){
                if(i % 2 == 1){
                    System.out.print((char)num + "\t");
                    num--;
                }else{
                    System.out.print(ch + "\t");
                    ch++;
                }
            }
            System.out.println();
        }
    }    
}
