import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int row = sc.nextInt();
        
        System.out.println("enter no. of colms");
        int col= sc.nextInt();
        
         int[][] matrix = new int[row][col];
         
         System.out.println("enter elements of the matrix: ");
         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
System.out.println("Transpose of the matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
