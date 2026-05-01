package LAB_1.test;

import LAB_1.src.Processor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProcessorTest {
    private final Processor processor = new Processor();

    @Test
    void testXorConsistency() {
        float[][] a = {{1.0f}};
        float[][] result = processor.xorMatrices(a, a);
        assertEquals(0.0f, result[0][0], "XOR of same values should be 0.");
    }

    @Test
    void testCalculateRowAverages() {
        float[][] matrix = {{1.0f, 3.0f}, {10.0f, 20.0f}};
        float[] averages = processor.calculateRowAverages(matrix);
        assertArrayEquals(new float[]{2.0f, 15.0f}, averages, 0.001f);
    }

    @Test
    void testEmptyMatrixThrowsException() {
        // Now this test will pass because we throw IllegalArgumentException in Processor
        assertThrows(IllegalArgumentException.class, () -> {
            processor.calculateRowAverages(new float[0][0]);
        });
    }

    @Test
    void testDimensionMismatch() {
        float[][] a = {{1.0f}};
        float[][] b = {{1.0f, 2.0f}};
        assertThrows(IllegalArgumentException.class, () -> {
            processor.xorMatrices(a, b);
        });
    }
}