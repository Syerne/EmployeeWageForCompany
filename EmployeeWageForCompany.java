package com.employee.wage;

public class EmployeeWageForCompany {
    public static final int EMP_IS_PRESENT = 1;
    public static final int FULL_TIME_WORKING_HR = 8;


    public static void main(String[] args) {
        EmployeeWageForCompany empwage = new EmployeeWageForCompany();
        empwage.welcomeMessage();
        int workingHrsPerDay = empwage.attendanceCheck();
        empwage.dailyWage(workingHrsPerDay);

    }

    public void welcomeMessage() {
        System.out.println("welcome to the Employee Wage Computation for Company");
    }

    public int attendanceCheck() {
int workingHrsPerDay;
        int empRandomCheck = (int) (Math.random() * 2);
        if (empRandomCheck == EMP_IS_PRESENT) {
            System.out.println("Employee is Present");
            workingHrsPerDay = FULL_TIME_WORKING_HR;
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
