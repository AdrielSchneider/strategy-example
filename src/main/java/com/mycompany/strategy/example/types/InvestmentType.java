package com.mycompany.strategy.example.types;

import com.mycompany.strategy.example.model.ETF;
import com.mycompany.strategy.example.model.FII;
import com.mycompany.strategy.example.model.InvestmentStrategy;
import com.mycompany.strategy.example.model.Saves;
import com.mycompany.strategy.example.model.Stock;

/**
 *
 * @author ADRIEL
 */
public enum InvestmentType {
    
    STOCK(0.325, 0.15, new Stock()), // Ações OK
    FII(0.1748, 0.20, new FII()),    // Fundos Imobiliários
    ETF(0.1825, 0.20, new ETF()),    // ETFs
    SAVES(0.0045, 0, new Saves());   // Poupança OK
    
    private InvestmentType(double PROFIT_PERCENTAGE, double TAX_PERCENTAGE, InvestmentStrategy investimentStrategy ) {
        this.PROFIT_PERCENTAGE = PROFIT_PERCENTAGE;
        this.TAX_PERCENTAGE = TAX_PERCENTAGE;
        this.investimentStrategy = investimentStrategy;
    }
    
    private double PROFIT_PERCENTAGE;
    private double TAX_PERCENTAGE;
    private InvestmentStrategy investimentStrategy;
    
    public double getTAX_PERCENTAGE() {
        return TAX_PERCENTAGE;
    }

    public void setTAX_PERCENTAGE(double TAX_PERCENTAGE) {
        this.TAX_PERCENTAGE = TAX_PERCENTAGE;
    }

    public double getPROFIT_PERCENTAGE() {
        return PROFIT_PERCENTAGE;
    }

    public void setPROFIT_PERCENTAGE(double PROFIT_PERCENTAGE) {
        this.PROFIT_PERCENTAGE = PROFIT_PERCENTAGE;
    }

    public InvestmentStrategy getInvestimentStrategy() {
        return investimentStrategy;
    }

    public void setInvestimentStrategy(InvestmentStrategy investimentStrategy) {
        this.investimentStrategy = investimentStrategy;
    }
}
