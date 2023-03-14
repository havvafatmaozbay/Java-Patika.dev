import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void transposeMatrix(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transpose = new int[column][row];

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length ; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose matrix :"+ Arrays.deepToString(transpose));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row number of matrix:");
        int row = scanner.nextInt();
        System.out.println("Enter the column number of matrix");
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        for(int i= 0; i < matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                System.out.println("Enter the next element of the matrix");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix :"+ Arrays.deepToString(matrix));
        transposeMatrix(matrix);
    }
}