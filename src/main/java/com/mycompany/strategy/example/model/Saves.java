/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategy.example.model;

import com.mycompany.strategy.example.types.InvestmentType;

/**
 *
 * @author ADRIEL
 */
public class Saves implements InvestmentStrategy {

    private double value;

    public Saves(double value) {
        this.value = value;
    }

    public Saves() {
    }
    
    @Override
    public double calculateProfits() {
        return value * InvestmentType.SAVES.getPROFIT_PERCENTAGE();
    }

    @Override
    public double calculateTaxes() {
        return 0;
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
