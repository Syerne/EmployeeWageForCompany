package com.employee.wage;

public class EmployeeWageForCompany {
    public static final int EMP_IS_PRESENT = 1;

    public static void main(String[] args) {
        EmployeeWageForCompany empwage = new EmployeeWageForCompany();
        empwage.welcomeMessage();
        empwage.attendanceCheck();

    }

    public void welcomeMessage() {
        System.out.println("welcome to the Employee Wage Computation for Company");
    }

    public void attendanceCheck() {

        int empRandomCheck = (int) (Math.random() * 2);
        if (empRandomCheck == EMP_IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
