import java.util.Arrays;

public class mergetwoarray {
public static void main(String[] args){
    int[] arr= {2,4,78,46};
    
    //int[] merge= new int(arr1.length+ arr2.length);
//for(int i=0; i<arr.length; i++){

    Arrays.sort(arr);
    System.out.println("second largest number: "+ arr[arr.length-1]);
}
  
}


