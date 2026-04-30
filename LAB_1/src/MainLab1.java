package LAB_1.src;
import java.util.Scanner;

public class MainLab1 {
    static void main (String [] args) {
        Scanner output = new Scanner(System.in);

        int rows = 0;
        int cols = 0;

        while (true) {
            System.out.print("Введіть кількість рядків: ");
            try {
                rows = Integer.parseInt(output.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введіть ціле число.");
            }
        }
        while (true) {
            System.out.println("Введіть кількість стовпців: ");
            try {
                cols = Integer.parseInt(output.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введіть ціле число.");
            }
        }
        float[][] matrix_A = new float[rows][cols];
        float[][] matrix_B = new float[rows][cols];
        float[][] result;
        System.out.println("Введіть дані для матриці А: ");
        Matrix.create_matrix(matrix_A, output);

        System.out.println("Введіть дані для матриці B: ");
        Matrix.create_matrix(matrix_B, output);

        if (matrix_A.length != matrix_B.length ||
                matrix_A[0].length != matrix_B[0].length) {

            System.out.println("Матриці мають різні розміри!");
        }

        result = Matrix.xor_matrix(matrix_A, matrix_B);

        System.out.println("Результат XOR:");
        Matrix.print_matrix(result);

        System.out.println("Середнє значення рядків:");
        Matrix.print_averages_of_rows(matrix_A);
        Matrix.print_averages_of_rows(matrix_B);
    }
}
