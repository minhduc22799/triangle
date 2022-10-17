import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void triangleClassifierNotATriangle() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifierEquilateralTriangle() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;
        String expected = "tam giac deu";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifierIsoscelesTriangle() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
        String expected = "tam giac can";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }

    @Test
    void triangleClassifierNormalTriangle() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        String expected = "tam giac thuong";
        String result = TriangleClassifier.triangleClassifier(sideA, sideB, sideC);
        assertEquals(expected, result);
    }


}