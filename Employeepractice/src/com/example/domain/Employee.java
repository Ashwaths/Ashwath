/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author SONY
 */
public class Employee {

    int eid;
    String ename;
    String eSsn;
    double esal;

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String geteSsn() {
        return eSsn;
    }

    public double getEsal() {
        return esal;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void seteSsn(String eSsn) {
        this.eSsn = eSsn;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }


}
