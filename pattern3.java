package LogicBuilding;
import java.util.*;

class Pattern3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row : ");
        int row = sc.nextInt();
        char ch = 'A';
        int num = 1;

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=row; j++){
                System.out.print(" " + ch + num + "\t");
                ch++;
                num++;
            }
            System.out.println();
        }
    }
}
