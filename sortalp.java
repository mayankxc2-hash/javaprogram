import java.util.Arrays;

public class sortalp {
public static void main(String[] args){
    String name= "mayank";
    char[] arr= name.toCharArray();
    Arrays.sort(arr);

    System.out.println("sorted: " + new String(arr));

}
}
