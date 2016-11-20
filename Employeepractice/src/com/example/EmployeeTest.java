/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.domain.Employee;

/**
 *
 * 
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee e=new Employee();
    e.setEid(101);
    e.setEname("john smith");
    e.seteSsn("012_34_5678");
    e.setEsal(245_35.27);
    e.getEid();
    System.out.println("Employee id"+e.getEid());
    e.getEname();
    System.out.println("Employee name"+e.getEname());
    e.geteSsn();
    System.out.println("Employee Ssn"+e.geteSsn());
    e.getEsal();
    System.out.println("Employee sal"+e.getEsal());
}
}