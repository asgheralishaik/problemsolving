package com.leetcode.crackthecodes.solutions.others;

public class Employee implements Cloneable {
    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;

    public Employee clone() throws CloneNotSupportedException {

        Employee e = (Employee) super.clone();
        return e;

    }

}
