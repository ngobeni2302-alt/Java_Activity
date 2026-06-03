import org.junit.jupiter.api.Test;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class JavaAssessmentPart2Test {

    // =========================================================================
    // CATEGORY 1 TESTS
    // =========================================================================
    @Test
    public void testGetCardType() {
        assertEquals("Visa", JavaAssessmentPart2.getCardType("4123456789"));
        assertEquals("Mastercard", JavaAssessmentPart2.getCardType("5123456789"));
        assertEquals("Unknown", JavaAssessmentPart2.getCardType("3123456789"));
    }

    @Test
    public void testVerifySADocuments() {
        assertTrue(JavaAssessmentPart2.verifySADocuments(20, true, false));
        assertFalse(JavaAssessmentPart2.verifySADocuments(20, false, false));
        assertTrue(JavaAssessmentPart2.verifySADocuments(16, true, true));
        assertFalse(JavaAssessmentPart2.verifySADocuments(16, true, false));
    }

    @Test
    public void testValidateSaId() {
        assertEquals("Invalid Length or Format", JavaAssessmentPart2.validateSaId("99010150"));
        assertEquals("Invalid Length or Format", JavaAssessmentPart2.validateSaId("990101500008A"));
        assertEquals("Valid Female ID", JavaAssessmentPart2.validateSaId("9901010234087"));
        assertEquals("Valid Male ID", JavaAssessmentPart2.validateSaId("9901015234087"));
    }

    // =========================================================================
    // CATEGORY 2 TESTS
    // =========================================================================
    @Test
    public void testCountTaxYears() {
        assertEquals(2, JavaAssessmentPart2.countTaxYears(2020, 2025));
        assertEquals(1, JavaAssessmentPart2.countTaxYears(2023, 2025));
    }

    @Test
    public void testTaxiRankDispatcher() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        JavaAssessmentPart2.taxiRankDispatcher(16);

        System.setOut(originalOut);
        String output = outContent.toString();
        
        assertTrue(output.contains("Passenger 1 boarded."));
        assertTrue(output.contains("Passenger 15 boarded."));
        assertTrue(output.contains("Taxi full! Dispatching taxi."));
        assertTrue(output.contains("Passenger 16 boarded."));
    }

    @Test
    public void testLuhnChecksumBasic() {
        assertTrue(JavaAssessmentPart2.luhnChecksumBasic(49927398716L == false ? 0 : 79927398713L)); 
        // Simple assertion targets
        assertTrue(JavaAssessmentPart2.luhnChecksumBasic(18)); // (8) -> 2nd digit is 1. Not multiple of 10 example loop setup
    }

    // =========================================================================
    // CATEGORY 3 TESTS
    // =========================================================================
    @Test
    public void testFindFreezingTemperatures() {
        double[] temps = {2.5, -1.0, 0.0, -4.5, 12.3};
        List<Double> result = JavaAssessmentPart2.findFreezingTemperatures(temps);
        assertEquals(2, result.size());
        assertEquals(-1.0, result.get(0));
        assertEquals(-4.5, result.get(1));
    }

    @Test
    public void testFilterValidTransactions() {
        int[] accounts = {1001, 1002, 1003};
        int[] balances = {500, -20, 10};
        List<Integer> result = JavaAssessmentPart2.filterValidTransactions(accounts, balances);
        assertEquals(2, result.size());
        assertEquals(1001, result.get(0));
        assertEquals(1003, result.get(1));
    }

    @Test
    public void testRemoveDuplicateSchedules() {
        int[] log = {10, 10, 22, 10, 35, 22};
        List<Integer> result = JavaAssessmentPart2.removeDuplicateSchedules(log);
        assertEquals(3, result.size());
        assertEquals(10, result.get(0));
        assertEquals(22, result.get(1));
        assertEquals(35, result.get(2));
    }
}
