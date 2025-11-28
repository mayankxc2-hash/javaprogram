import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 3 number: ");
           int a= sc.nextInt();
           int b= sc.nextInt();
           int c= sc.nextInt();
           
           int largest;

        if(a>b && a>c){
            largest= a;
        }else if (b>c && b>a) {
          largest= b;
            
        }
        else{
           largest= c;
        }
        System.out.println("largerst number is " + largest );
    }

}
