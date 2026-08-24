package LogicBuilding.Array.MultidimensionalArray;

class hashcode {
    public static void main(String[] args){

        int arr[][] = new int[][]{{10,20,30},{40,50,60},{70,80,90}};

        System.out.println(arr);  //Hashcode of whole 2D array
        System.out.println(arr[0]);  //Hashcode of first 1D array
        System.out.println(arr[1]);  //Hashcode of second 1D array
        System.out.println(arr[2]);  //Hashcode of third 1D array
        System.out.println(arr[1][2]);  //Actual data in the multi dimensional array
        
    }    
}
