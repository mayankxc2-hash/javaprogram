public class suminarray {
public static void main(String[] args){
    int[] arr= {12,34,45,3,2,36,7,9,47};
   int evensum=0, oddsum=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]%2==0){
            evensum+=arr[i];
        }
        else{
            oddsum+= arr[i];
        }
    }
    System.out.println("sum of even number: "+ evensum);
    System.out.println("sum of odd number: "+ oddsum);
}
}
