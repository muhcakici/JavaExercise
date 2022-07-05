import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix=new int[2][2];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=scan.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
        scan.close();

    }
}
