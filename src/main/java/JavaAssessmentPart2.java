import java.util.ArrayList;
import java.util.List;

public class JavaAssessmentPart2 {

    // =========================================================================
    // CATEGORY 1: STRING VALIDATION & CONDITIONALS
    // =========================================================================

    /**
     * Q1.1 (Easy) - Get Debit Card Type
     * Check if a card number starts with specific digits:
     * - Starts with "4" -> Return "Visa"
     * - Starts with "5" -> Return "Mastercard"
     * - Any other digit -> Return "Unknown"
     */
    public static String getCardType(String cardNumber) {
        // TODO: Implement using String's .startsWith() method
        return "";
    }

    /**
     * Q1.2 (Medium) - Verify SA Bootcamp Documents
     * Validate a student's registration based on age benchmarks:
     * - If age is 18 or older: They only need their ID (hasID == true) to pass.
     * - If age is under 18: They need their ID AND parent consent (hasConsent == true) to pass.
     */
    public static boolean verifySADocuments(int age, boolean hasID, boolean hasConsent) {
        // TODO: Implement compound conditional logic checks
        return false;
    }

    /**
     * Q1.3 (Hard) - Validate South African ID
     * Validate a 13-digit SA ID string:
     * - If length is not exactly 13, or contains non-digits -> Return "Invalid Length or Format"
     * - Extract the gender digits (7th to 10th characters, which is index 6 to 10 in substring).
     * Convert to int: 0000-4999 means "Valid Female ID", 5000-9999 means "Valid Male ID".
     */
    public static String validateSaId(String idNumber) {
        // TODO: Validate length, numeric characters, parse substring, and evaluate gender categories
        return "";
    }


    // =========================================================================
    // CATEGORY 2: MODULO ARITHMETIC LOOPS
    // =========================================================================

    /**
     * Q2.1 (Easy) - Count Tax Leap Years
     * Loop from startYear to endYear (inclusive).
     * - If a year is exactly divisible by 4, print the year and count it.
     * - Return the total count of leap years found.
     */
    public static int countTaxYears(int startYear, int endYear) {
        int leapYearCount = 0;

        // TODO: Write a standard for-loop and counter logic

        return leapYearCount;
    }

    /**
     * Q2.2 (Medium) - Taxi Rank Dispatcher
     * Loop from 1 up to maxCapacity (commuters waiting in line).
     * - For every commuter, print: "Passenger [number] boarded."
     * - Whenever a minibus taxi fills up (multiples of 15), print: "Taxi full! Dispatching taxi."
     */
    public static void taxiRankDispatcher(int maxCapacity) {
        // TODO: Implement standard loop using modulo arithmetic to track capacity intervals
        
    }

    /**
     * Q2.3 (Hard) - Basic Luhn Checksum Digits
     * Break down a positive integer into individual digits from right to left using % 10 and / 10.
     * - Calculate the sum of every *second* digit tracking from right to left.
     * - Return true if the total sum is a multiple of 10, otherwise return false.
     */
    public static boolean luhnChecksumBasic(int number) {
        // TODO: Use a while-loop to extract digits, tracking position intervals mathematically
        return false;
    }


    // =========================================================================
    // CATEGORY 3: ARRAY & LIST COLLECTION FILTERING
    // =========================================================================

    /**
     * Q3.1 (Easy) - Find Freezing Temperatures
     * Filter through an array of recorded morning temperatures.
     * - Return a List containing only values that dropped strictly below 0.0.
     */
    public static List<Double> findFreezingTemperatures(double[] temperatures) {
        List<Double> freezingTemps = new ArrayList<>();

        // TODO: Filter elements into the list using a loop structure

        return freezingTemps;
    }

    /**
     * Q3.2 (Medium) - Filter Valid Active Transactions
     * Scan two parallel arrays of matching size: accounts and balances.
     * - Loop through them simultaneously using indexes.
     * - If a balance at an index is greater than 0, add that index's account number to the list.
     */
    public static List<Integer> filterValidTransactions(int[] accounts, int[] balances) {
        List<Integer> activeAccounts = new ArrayList<>();

        // TODO: Write a loop linking index elements across both parallel structures

        return activeAccounts;
    }

    /**
     * Q3.3 (Hard) - Remove Duplicate Logistics Schedules
     * Filter through an array of route logs (e.g., {10, 10, 22, 10, 35}).
     * - Return a List containing only unique route IDs.
     * - Crucial Rule: Do not use Java 'Set' collections. Check duplicates manually using loops/lists.
     */
    public static List<Integer> removeDuplicateSchedules(int[] routeLog) {
        List<Integer> uniqueRoutes = new ArrayList<>();

        // TODO: Use loops or list contains-checks to cleanly isolate unique numbers manually

        return uniqueRoutes;
    }
}
