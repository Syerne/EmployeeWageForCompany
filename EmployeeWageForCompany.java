package com.employee.wage;

public class EmployeeWageForCompany {
    public static final int EMP_IS_FULL_TIME_PRESENT = 1, EMP_IS_PART_TIME_PRESENT = 2;
    public static final int FULL_TIME_WORKING_HR = 8, PART_TIME_WORKING_HR = 4;
    ;


    public static void main(String[] args) {
        EmployeeWageForCompany empWage = new EmployeeWageForCompany();
        empWage.welcomeMessage();
        int workingHrsPerDay = empWage.attendanceCheck();
        empWage.dailyWage(workingHrsPerDay);

    }

    public void welcomeMessage() {
        System.out.println("welcome to the Employee Wage Computation for Company");
    }

    public int attendanceCheck() {
        int workingHrsPerDay;

        int empRandomCheck = (int) (Math.random() * 3);
        if (empRandomCheck == EMP_IS_FULL_TIME_PRESENT) {
            System.out.println("Employee is Present");
            workingHrsPerDay = FULL_TIME_WORKING_HR;
        } else if (empRandomCheck == EMP_IS_PART_TIME_PRESENT) {
            System.out.println("Employee is part time Present");
            workingHrsPerDay = PART_TIME_WORKING_HR;
        } else {
            System.out.println("Employee is Absent");
            workingHrsPerDay = 0;
        }
        return workingHrsPerDay;
    }

    public int dailyWage(int workingHrPerDay) {

        int WAGE_PER_HRS = 20;

        int dailyWage = WAGE_PER_HRS * workingHrPerDay;
        System.out.println("Daily wage: " + dailyWage);

        return dailyWage;
    }
}
