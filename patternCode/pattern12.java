package LogicBuilding.patternCode;
import java.util.*;

class pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row :");
        int row = sc.nextInt();
        for(int i = 1; i <= row; i++){
            int ch1 = 64 + row;
            char ch2 = 'A';
            int num1 = row; 
            int num2 = 1;
            for(int j = 1; j <= row; j++){
                if(i % 2 == 1){
                    if(j % 2 == 1){
                        System.out.print((char)ch1 + "\t");
                    }else{
                        System.out.print(num1 + "\t");
                    }
                    ch1--;
                    num1--;
                }else{
                    if(j % 2 == 1){
                        System.out.print(ch2 + "\t");
                    }else{
                        System.out.print(num2 + "\t");
                    }
                    ch2++;
                    num2++;
                }
            }
            System.out.println();
        }
    }     
}
