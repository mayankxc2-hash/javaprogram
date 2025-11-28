public class onetoanother {
public static void main(String[] args){
    int[] arr= {23,34,56,7};
    int[] copy= new int[arr.length];

    for(int i=0; i< arr.length; i++){
        copy[i]= arr[i];
    }
    System.out.println("copied array elements: ");
    for(int num: copy){
        System.out.println(num);
    }
}
}
