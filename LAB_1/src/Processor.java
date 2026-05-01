package LAB_1.src;

/**
 * Utility class for matrix operations including bitwise XOR and row averaging.
 * Designed for float type elements.
 */
public class Processor {

    /**
     * Performs a bitwise XOR operation between two float matrices.
     * Uses Float.floatToRawIntBits to manipulate float values at the bit level.
     *
     * @param a The first matrix.
     * @param b The second matrix.
     * @return Resulting matrix C = A XOR B.
     * @throws IllegalArgumentException if matrices are null or have different dimensions.
     */
    public float[][] xorMatrices(float[][] a, float[][] b) {
        if (a == null || b == null || a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must be non-null and share identical dimensions.");
        }

        int rows = a.length;
        int cols = a[0].length;
        float[][] result = new float[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Requirement C5 = 3 (Bitwise XOR)
                int bitsA = Float.floatToRawIntBits(a[i][j]);
                int bitsB = Float.floatToRawIntBits(b[i][j]);
                result[i][j] = Float.intBitsToFloat(bitsA ^ bitsB);
            }
        }
        return result;
    }

    /**
     * Calculates the arithmetic average of elements for each row of the matrix.
     *
     * @param matrix The input matrix.
     * @return Array of row averages.
     * @throws IllegalArgumentException if the matrix is null or empty.
     */
    public float[] calculateRowAverages(float[][] matrix) {
        // Fix for the previous test failure: Explicitly check for empty input
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Matrix cannot be empty or null.");
        }

        float[] averages = new float[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            float sum = 0;
            for (float value : matrix[i]) {
                sum += value;
            }
            // Requirement C11 = 8 (Average per row)
            averages[i] = sum / matrix[i].length;
        }
        return averages;
    }
}