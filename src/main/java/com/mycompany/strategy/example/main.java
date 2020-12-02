package com.mycompany.strategy.example;

import com.mycompany.strategy.example.types.InvestmentType;
import com.mycompany.strategy.example.utils.GeneralCalculator;

/**
 *
 * @author ADRIEL
 */
public class main {

    public static void main(String[] args) {
        
        GeneralCalculator calculator = new GeneralCalculator();
        
        double outputValue = calculator.calculate(InvestmentType.FII.getInvestimentStrategy(), 500000);
        
        System.out.println(outputValue);
                
    }
    
}
