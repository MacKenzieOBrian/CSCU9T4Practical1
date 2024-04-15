package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *
 * @author saemundur
 */
public class TrainingRecordTest {
    public TrainingRecordTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addTrainingSession method, of class TrainingRecord.
     * You might want to extend this test when you implement the other
     * TrainingSession types
     */
    @Test
    public void testAddTrainingSession() {
        System.out.println("addTrainingSession");
        TrainingSession a = new TrainingSession("Alice", 1, 2, 2003, 0, 16, 7, 3);
        TrainingRecord instance = new TrainingRecord();
        instance.addTrainingSession(a);
        assertEquals(instance.getNumberOfTrainingSessions(), 1);
    }

    /**
     * Test of addTrainingSession with a repeat
     * Adding another training session for the same person on the same day should fail
     */
    @Test
    public void testAddTrainingSessionUnique() {
        System.out.println("addTrainingSession -- fail");
        TrainingSession a = new TrainingSession("Alice", 1, 2, 2003, 0, 16, 7, 3);
        TrainingSession b = new TrainingSession("Alice", 1, 2, 2003, 0, 16, 7, 3);
        TrainingRecord instance = new TrainingRecord();
        instance.addTrainingSession(a);
        instance.addTrainingSession(b);
        assertEquals(instance.getNumberOfTrainingSessions(), 1);
        // You might also consider using assertThrows() and let
        // TrainingRecord instance take care of when you're trying to add
        // a none-unique training session
    }

    /**
     * Test of lookupTrainingSession method, of class TrainingRecord.
     */
    @Test
    public void testLookupTrainingSession() {
        System.out.println("lookupTrainingSession");
        TrainingRecord instance = new TrainingRecord();
        TrainingSession a = new TrainingSession("Alice", 1, 2, 2003, 0, 16, 7, 3);
        TrainingSession b = new TrainingSession("Bob", 1, 2, 2003, 0, 14, 15, 3);
        TrainingSession c1 = new TrainingSession("Claire", 7, 3, 2010, 0, 26, 20, 7);
        TrainingSession c2 = new TrainingSession("Claire", 11, 3, 2010, 0, 24, 55, 7);

        // Adding the same training session twice
        instance.addTrainingSession(a);
        instance.addTrainingSession(a);

        instance.addTrainingSession(b);
        instance.addTrainingSession(c1);
        instance.addTrainingSession(c2);

        int d = 7;
        int m = 3;
        int y = 2010;
        String resultSuccess = instance.lookupTrainingSession(d, m, y);
        assertNotEquals("No training sessions found", resultSuccess, "expecting to find the entry");
        resultSuccess = instance.lookupTrainingSession(1, 2, 2003);
        assertEquals("Alice - Running 2.0 km, Swimming 7.0 km", resultSuccess);
        resultSuccess = instance.lookupTrainingSession(1, 2, 2010);
        assertEquals("Claire - Running 15.0 km, Cycling 55.0 km", resultSuccess);
        int x = 3;
        int z = 4;
        String resultFail = instance.lookupTrainingSession(x, m, y);
        assertEquals("No training sessions found", resultFail, "expecting not to find the entry");
    }
}