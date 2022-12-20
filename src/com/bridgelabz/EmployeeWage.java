package com.bridgelabz;

public class EmployeeWage {
    static int days = 0;
    static double value = Math.floor(Math.random() * 10) % 2;

    public static void main(String[] args) {
        Uc1.Present();


    }
    static void Present(){
        if (value == days  ){
            System.out.println("Wage is Present " );
        }
        else {
            System.out.println("Employee is Absent");
        }
    }

}
