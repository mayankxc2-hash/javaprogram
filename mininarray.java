public class mininarray {
    public static void main(String[] args){
        int[] arr= {23,43,56,65};
        int min= arr[0];

        for(int i=0; i<4; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum array: " + min);
    }

}
