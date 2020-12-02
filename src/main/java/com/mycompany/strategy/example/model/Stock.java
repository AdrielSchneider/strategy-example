package com.mycompany.strategy.example.model;

import com.mycompany.strategy.example.types.InvestmentType;

/**
 *
 * @author ADRIEL
 */
public class Stock implements InvestmentStrategy {
    
    private double value;

    public Stock() {
    }
    
    @Override
    public double calculateProfits() {
        return value * InvestmentType.STOCK.getPROFIT_PERCENTAGE();
    }

    @Override
    public double calculateTaxes() {
        return (this.calculateProfits() > 20000 ? this.calculateProfits() * InvestmentType.STOCK.getTAX_PERCENTAGE() : 0);
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
