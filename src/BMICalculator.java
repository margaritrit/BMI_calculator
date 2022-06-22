package com.hillel.BMIcalculator;

public class BMICalculator {

    public String calculate(double weight, double height) {
        double BMI = weight / (height * height);
        String result = "";

        if (BMI >=9.8 && BMI <=18.4) {
            result = ("underweight, your BMI is "+ BMI);
        } else if (BMI >=18.5 && BMI <=24.9) {
            result = ("normal weight, your BMI is "+ BMI);
        } else if (BMI >=25.0 && BMI <=29.9) {
            result = ("overweight, your BMI is "+ BMI);
        } else if (BMI >=30.0 && BMI <=34.9) {
            result = ("obese, your BMI is "+ BMI);
        } else if (BMI >=35.0 && BMI<=70.0) {
            result = ("extremely obese, your BMI is "+ BMI);
        }
        else  {
            result = "incorrect weight or height value";
        }

        return result;
    }
}


