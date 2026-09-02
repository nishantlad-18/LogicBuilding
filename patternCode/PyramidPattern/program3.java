package LogicBuilding.patternCode.PyramidPattern;
import java.util.*;

class program3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row : ");
        int row = sc.nextInt();
        int cnt = row*2-1;

        for(int i = 1; i <= row; i++){
            int num = 1;
            for(int sp = 1; sp < i; sp++){
                System.out.print("\t");
            }
            for(int j =1; j <=cnt; j++){
                if(j <= cnt/2){
                    System.out.print(num + "\t");
                    num++;
                }else{
                    System.out.print(num + "\t");
                    num--;
                }
            }
            System.out.println();
            cnt-=2;
        }
    }    
}
