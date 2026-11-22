// Тэтгэлэг тооцоологчийн хэвийн ажиллагааг шалгах тест

package mn.edu.must.sqat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void testGradeC() {
        assertEquals("C", calculator.letterGrade(75));
    }

    @Test
    void testGradeD() {
        assertEquals("D", calculator.letterGrade(65));
    }

    @Test
    void testGradeF() {
        assertEquals("F", calculator.letterGrade(45));
    }

    @Test
    void testGradeBelowZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.letterGrade(-1));
    }

    @Test
    void testGradeAbove100() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.letterGrade(101));
    }

    @Test
    void testGpaOtherGrades() {
        assertEquals(1.0,
                calculator.gpa(new double[]{75, 65, 45}), 0.001);
    }

    @Test
    void testGpaNull() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gpa(null));
    }

    @Test
    void testGpaEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gpa(new double[]{}));
    }

    @Test
    void testScholarshipInvalidGpaLow() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.scholarship(-1, 15, false));
    }

    @Test
    void testScholarshipInvalidGpaHigh() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.scholarship(4.1, 15, false));
    }

    @Test
    void testScholarshipInvalidCredits() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.scholarship(3.5, -1, false));
    }

    @Test
    void testScholarshipViolation() {
        assertEquals(0,
                calculator.scholarship(3.9, 16, true));
    }

    @Test
    void testScholarshipLessCredits() {
        assertEquals(70,
                calculator.scholarship(3.9, 14, false));
    }

    @Test
    void testScholarshipHalf() {
        assertEquals(50,
                calculator.scholarship(3.5, 11, false));
    }

    @Test
    void testScholarshipNone() {
        assertEquals(0,
                calculator.scholarship(2.5, 15, false));
    }

    @Test
    void testGpaSingleScore() {
        assertEquals(4.0,
                calculator.gpa(new double[]{95}), 0.001);
    }

    @Test
    void testGpaMultipleScores() {
        assertEquals(2.5,
                calculator.gpa(new double[]{95, 85, 75, 65}), 0.001);
    }
}