package com.leetcode.crackthecodes.solutions.others;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableTestTest {

    @Test
    public void shouldBeImmutable() {

        ImmutableTest  immutableTest =  new ImmutableTest("abc","xyz",1);

        Employee  employee = new Employee("asgher");

        HashMap<String, Employee> properties = new HashMap<>();
        properties.put("ff",employee);
ImmutableClass immutableClass = new ImmutableClass(1,"ff",properties,"abc",employee);

System.out.print(immutableClass);

Employee  rr = immutableClass.getEmployee();

rr.setFirstName("asdasdas");
        System.out.print(immutableClass);
    }

}