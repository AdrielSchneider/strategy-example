/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strategy.example.utils;

import com.mycompany.strategy.example.model.InvestmentStrategy;

/**
 *
 * @author ADRIEL
 */
public class GeneralCalculator {

    public double calculate(InvestmentStrategy str, double inputValue) {
        
        str.setInitialValue(inputValue);
        
        return str.calculateTotal();
        
    }
    
}
