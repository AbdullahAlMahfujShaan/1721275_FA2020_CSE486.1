package com.mahfujshaan.cse486.debugging;

public class Calculator {

    public enum Operator {ADD, SUB, DIV, MUL}


    public double addition(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }


    public double subtraction(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double division(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    public double multiplication(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
}