package com.mycompany.strategy.example.model;

/**
 *
 * @author ADRIEL
 */
public interface InvestmentStrategy {
    
    // Input the invested value
    void setInitialValue(double inputValue);
    
    // Calculate the profit value
    double calculateProfits();
    
    // Calculate the taxes value
    double calculateTaxes();
    
    // profits - taxes
    double calculateLiquid();
    
    // value + (profit - taxes)
    double calculateTotal();
    
}
