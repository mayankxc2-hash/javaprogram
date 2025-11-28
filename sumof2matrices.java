public class sumof2matrices {
public static void main(String[] args){
    int[][] a = {{1,2,3,4}, {5,6,7,8} };
    int[][] b = { {4,3,2,1}, {8,7,6,5 }};

    int[][] sum= new int[2][4];
    
    for(int i=0; i<2; i++){
        for(int j=0; j<4; j++){
            sum[i][j]= a[i][j] + b[i][j];
        }
    }
    System.out.println("sum of two matrices: ");
   for(int i=0; i<2; i++){
        for(int j=0; j<4; j++){
            System.out.println(sum[i][j]+ " ");
        }
    }
    System.out.println();
}
}
