package com.employee.wage;

public class EmployeeWageForCompany {
    public static final int EMP_IS_FULL_TIME_PRESENT = 1, EMP_IS_PART_TIME_PRESENT = 2;
    public static final int FULL_TIME_WORKING_HR = 8, PART_TIME_WORKING_HR = 4, WAGE_PER_HRS = 20,
                            WORKING_DAY_FOR_MONTH = 20,  TOTAL_WORKING_HRS = 100;
    ;


    public static void main(String[] args) {
        EmployeeWageForCompany empWage = new EmployeeWageForCompany();
        empWage.welcomeMessage();
        int monthlyWage = empWage.monthlyWage();
        System.out.println("MonthlyWage : " + monthlyWage);

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
    public int switchCase() {

        int workingHrPerDay;
        int rand = (int) (Math.random() * 3);

        switch (rand) {

            case EMP_IS_FULL_TIME_PRESENT:
                System.out.println("Employee is full time Present");
                workingHrPerDay = FULL_TIME_WORKING_HR;
                break;

            case EMP_IS_PART_TIME_PRESENT:
                System.out.println("Employee is part time Present");
                workingHrPerDay = PART_TIME_WORKING_HR;
                break;

            default:
                System.out.println("Employee is absent");
                workingHrPerDay = 0;
        }
        return workingHrPerDay;
    }

    public int dailyWage(int workingHrPerDay) {


        int dailyWage = WAGE_PER_HRS * workingHrPerDay;
        System.out.println("Daily wage: " + dailyWage);

        return dailyWage;
    }
    public int monthlyWage() {
        EmployeeWageForCompany monthlyWageCalculator = new EmployeeWageForCompany();

        int monthlyWage = 0, workingHrsPerMonth = 0;

        for (int i = 1; i <= WORKING_DAY_FOR_MONTH; i++) {
            System.out.println("Day-" + i);
            if (workingHrsPerMonth >= TOTAL_WORKING_HRS)
                break;

            int workingHrsPerDay = monthlyWageCalculator.attendanceCheck();
            int dailyWage = monthlyWageCalculator.dailyWage(workingHrsPerDay);

            workingHrsPerMonth += workingHrsPerDay;
            monthlyWage += dailyWage;
        }
        System.out.println("workingHrsPerMonth : " + workingHrsPerMonth);
        return monthlyWage;
    }

}
