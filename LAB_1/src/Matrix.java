package LAB_1.src;
import java.util.Scanner;
public class Matrix {
    public static void create_matrix(float [][]matrix, Scanner output) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                while (true) {
                    System.out.print("Елемент [" + i + "][" + j + "]: ");

                    try {
                        matrix[i][j] = Float.parseFloat(output.nextLine());
                        break; // якщо все ок — виходимо з циклу
                    } catch (NumberFormatException e) {
                        System.out.println("Помилка! Введіть число (наприклад 3.14)");
                    }
                }

            }
        }

     }
     public static float [][] xor_matrix(float[][] a, float[][] b){
         int rows = a.length;
         int cols = a[0].length;

         float[][] result = new float [rows][cols];
         for(int i = 0; i < rows; i++){
             for(int j = 0; j < cols; j++) {
//
//                int x = Float.floatToIntBits(a[i][j]);
//                int y = Float.floatToIntBits(b[i][j]);
                 int x = (int) (a[i][j] + 0.5);
                 int y = (int) (b[i][j] + 0.5);
                int result_in_bits = x ^ y;
//                 result [i][j] = Float.intBitsToFloat(result_in_bits);
                 result[i][j] = result_in_bits;

             }
         }
        return result;

     }
     public static void print_matrix(float[][] matrix){
         for(int i = 0;i < matrix.length; i++){
             for (int j = 0; j < matrix[i].length; j++){
                 System.out.println(matrix[i][j] + " ");
             }
         }
     }
    public static float print_averages_of_rows(float[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            float sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }

            float average = sum / matrix[i].length;

            System.out.println(average);
        }
        return 0;
    }
}