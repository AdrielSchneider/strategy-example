package com.mycompany.strategy.example.model;

import com.mycompany.strategy.example.types.InvestmentType;

/**
 *
 * @author ADRIEL
 */
public class FII implements InvestmentStrategy {
    
    private double value;

    public FII(double value) {
        this.value = value;
    }

    public FII() {
    }
    
    @Override
    public double calculateProfits() {
        return value * InvestmentType.FII.getPROFIT_PERCENTAGE();
    }

    @Override
    public double calculateTaxes() {
        return calculateProfits() * InvestmentType.FII.getTAX_PERCENTAGE();
    }
    
    @Override
    public double calculateLiquid() {
        return calculateProfits() - calculateTaxes();        
    }
    
    @Override
    public void setInitialValue(double inputValue) {
        this.value = inputValue;
    }

    @Override
    public double calculateTotal() {
        return value + calculateLiquid();
    }
    
}
