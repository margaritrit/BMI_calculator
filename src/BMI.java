package com.hillel.BMIcalculator;

public class BMI {
    public static void main(String [] args) {
        double weight= 85;
        double height= 1.85;

        BMICalculator calculator = new BMICalculator();
        String result = calculator.calculate(weight, height);
        System.out.println(result);



}
    }

