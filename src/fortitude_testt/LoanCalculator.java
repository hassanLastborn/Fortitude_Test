/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortitude_testt;

import java.util.Scanner;

/**
 *
 * @author Oyebanji Jide Hassan
 * jedia4real@yahoo.com
 */
public class LoanCalculator {
    public int amountBorrowed = 500000;
    public double percentile = 100;
    public double loanPercent = (double)90/100;
    public int numberOfYears = (30*12);
    public int loanPeriod = 30;
    
    
    public double ratePerYear(double rate){
        return (rate/12);
    }
    
    public double rateToPercent(double rate){
        double ratePercentValue = ((rate/100));
        return ratePerYear(ratePercentValue);
   
    }
    
    
    public double calculateAmount(double rate){
        
        double pValue = loanPercent * amountBorrowed;
        //double payAble = (loanPercent * amountBorrowed) * ((rateToPercent(rate) * Math.pow((1+(rateToPercent(rate))),(numberOfYears))    ));
        double rValue = rateToPercent(rate);
        double numeratorValue = (rValue) * (Math.pow((1 + rateToPercent(rate)),numberOfYears));
        double denominatorValue = ((Math.pow((1 + rateToPercent(rate)),numberOfYears))) -1 ;
        return (pValue * (numeratorValue / denominatorValue));
    }
    
            
    public static void main(String[] args) {
        
        LoanCalculator ft = new LoanCalculator();
        Scanner input = new Scanner(System.in);        
        
        System.out.println("Welcome to Fort Housing Loan\nPlease note that loan provided is for a period of 30 years");
        System.out.println("What is the current Rate?");
        double rate = (input.nextDouble());
        
        
        double monthlyPayment = ft.calculateAmount(rate);
        System.out.printf("Monthly payment rate is: %.2f", monthlyPayment);
        System.out.println();
        
    }
    
}
