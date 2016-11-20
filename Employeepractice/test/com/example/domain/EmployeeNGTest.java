/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author SONY
 */
public class EmployeeNGTest {
    
    public EmployeeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of setEmp_id method, of class Employee.
     */
    @Test
    public void testSetEmp_id() {
        System.out.println("setEmp_id");
        int Emp_id = 0;
        Employee instance = null;
        instance.setEmp_id(Emp_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmp_name method, of class Employee.
     */
    @Test
    public void testSetEmp_name() {
        System.out.println("setEmp_name");
        String Emp_name = "";
        Employee instance = null;
        instance.setEmp_name(Emp_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmp_Ssn method, of class Employee.
     */
    @Test
    public void testSetEmp_Ssn() {
        System.out.println("setEmp_Ssn");
        String Emp_Ssn = "";
        Employee instance = null;
        instance.setEmp_Ssn(Emp_Ssn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmp_Sal method, of class Employee.
     */
    @Test
    public void testSetEmp_Sal() {
        System.out.println("setEmp_Sal");
        double Emp_Sal = 0.0;
        Employee instance = null;
        instance.setEmp_Sal(Emp_Sal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmp_id method, of class Employee.
     */
    @Test
    public void testGetEmp_id() {
        System.out.println("getEmp_id");
        Employee instance = null;
        int expResult = 0;
        int result = instance.getEmp_id();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmp_name method, of class Employee.
     */
    @Test
    public void testGetEmp_name() {
        System.out.println("getEmp_name");
        Employee instance = null;
        String expResult = "";
        String result = instance.getEmp_name();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmp_Ssn method, of class Employee.
     */
    @Test
    public void testGetEmp_Ssn() {
        System.out.println("getEmp_Ssn");
        Employee instance = null;
        String expResult = "";
        String result = instance.getEmp_Ssn();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmp_Sal method, of class Employee.
     */
    @Test
    public void testGetEmp_Sal() {
        System.out.println("getEmp_Sal");
        Employee instance = null;
        double expResult = 0.0;
        double result = instance.getEmp_Sal();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
