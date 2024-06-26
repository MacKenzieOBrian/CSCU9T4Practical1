/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author saemundur
 */
public class CycleEntryTest {

    public CycleEntryTest() {
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
     * Test of getName method, of class CycleEntry.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class CycleEntry.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "gravel", "moderate");
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class CycleEntry.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "mountain", "fast");
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class CycleEntry.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "gravel", "slow");
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHour method, of class CycleEntry.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "fast");
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMin method, of class CycleEntry.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSec method, of class CycleEntry.
     */
    @Test
    public void testGetSec() {
        System.out.println("getSec");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistance method, of class CycleEntry.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        float expResult = 3.0F;
        float result = instance.getDistance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTerrain method, of class CycleEntry.
     */
    @Test
    public void testGetTerrain() {
        System.out.println("getTerrain");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "asphalt";
        String result = ((CycleEntry) instance).getTerrain();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTempo method, of class CycleEntry.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        TrainingSession instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "moderate";
        String result = ((CycleEntry) instance).getTempo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEntry method, of class CycleEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        CycleEntry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "Alice cycled 3.0 km in 0:16:7 on 1/2/2003 on asphalt at moderate tempo";
        String result = instance.getTrainingSessionDetails();
        assertEquals(expResult, result);
    }

}