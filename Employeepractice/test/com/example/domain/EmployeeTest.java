/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class EmployeeTest {
    
    public EmployeeTest() {
  Employee Emp = new Employee();
    }
    
   import com.example.domain.Employee;
     *
     */
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 system.out.println("Employee_id:"+Emp.getEmp_id());
 system.out.println("Employee_name:"+Emp.getEmp_name());
 system.out.println("Employee_Ssn#:"+Emp.getEmp_Ssn());
 system.out.println("Employee_Sal:"+Emp.getEmp_Sal());
}
