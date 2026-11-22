// Тэтгэлэг тооцоологчийн хэвийн ажиллагааг шалгах тест

package mn.edu.must.sqat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ScholarshipCalculatorTest {

    ScholarshipCalculator calculator = new ScholarshipCalculator();

    @Test
    void testGradeA() {
        assertEquals("A", calculator.letterGrade(95));
    }

    @Test
    void testGradeB() {
        assertEquals("B", calculator.letterGrade(85));
    }

    @Test
    void testGpa() {
        assertEquals(3.5, calculator.gpa(new double[]{95, 85}), 0.001);
    }

    @Test
    void testFullScholarship() {
        assertEquals(100, calculator.scholarship(3.9, 16, false));
    }

    @Test
    void testPartialScholarship() {
        assertEquals(70, calculator.scholarship(3.5, 12, false));
    }
}