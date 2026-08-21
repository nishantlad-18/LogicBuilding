package LogicBuilding.Array;

class array1 {
    public static void main(String[] args){

        int arr[] = new int[]{10,20,30,54,57,43};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }    
}
