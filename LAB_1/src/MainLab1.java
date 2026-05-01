package LAB_1.src;

import java.util.Arrays;

/**
 * Executive class for Laboratory Work #1.
 * Handles initialization and output formatting.
 */
public class MainLab1 {
    public static void main(String[] args) {
        Processor processor = new Processor();

        // Sample data: floating-point matrices
        float[][] a = {{10.5f, 5.0f}, {20.1f, 3.2f}};
        float[][] b = {{2.5f, 1.0f}, {15.9f, 2.2f}};

        try {
            // Execution Step 1: XOR Operation
            float[][] c = processor.xorMatrices(a, b);

            // Execution Step 2: Row Averages calculation
            float[] averages = processor.calculateRowAverages(c);

            System.out.println("--- Resulting Matrix C (A XOR B) ---");
            for (float[] row : c) {
                System.out.println(Arrays.toString(row));
            }

            System.out.println("\n--- Row Averages ---");
            for (int i = 0; i < averages.length; i++) {
                System.out.printf("Row %d Average: %.4f%n", i, averages[i]);
            }

        } catch (Exception e) {
            // Requirement: Handling all possible exceptional situations
            System.err.println("Critical error during execution: " + e.getMessage());
        }
    }
}