package LogicBuilding.Array;
import java.util.*;

class empAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int emp[] = new int[size];

        System.out.println("enter age of employees : ");
        for(int i = 0; i < emp.length; i++){
            emp[i] = sc.nextInt();
        }

        System.out.println("Age of employees of your office : ");
        for(int i = 0; i < emp.length; i++){
            System.out.println(emp[i]);
        }
    }    
}
