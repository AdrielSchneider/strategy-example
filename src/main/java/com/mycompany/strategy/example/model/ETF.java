package com.mycompany.strategy.example.model;

import com.mycompany.strategy.example.types.InvestmentType;

/**
 *
 * @author ADRIEL
 */
public class ETF implements InvestmentStrategy {

    private double value;

    public ETF(double value) {
        this.value = value;
    }

    public ETF() {
    }
    
    @Override
    public double calculateProfits() {
        return value * InvestmentType.ETF.getPROFIT_PERCENTAGE();
    }

    @Override
    public double calculateTaxes() {
        return calculateProfits() * InvestmentType.ETF.getTAX_PERCENTAGE();
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
