/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.domain.Employee;
import static java.time.Clock.system;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SONY
 */
public class EmployeeTestTest {

    public Employee getEmp() {
        return Emp;
    }

    public void setEmp(Employee Emp) {
        this.Emp = Emp;
    }
    Employee Emp=new Employee();
    
    emp.setEmp_id(101);
    emp.setEmp_name("jane smith");
    emp.setEmp_ssn(012-34-456);
    emp.setEmp_sal(120_345.27);
 
    public EmployeeTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class EmployeeTest.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EmployeeTest.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    system.out.println("Employee id"+emp.getEmp_id());
    system.out.println("Employee name"+emp.getEmp_name());
    system.out.println("Employee Ssn"+emp.getEmp_Ssn());
    system.out.println("Employee Salary+emp.getEmp_Sal());
}