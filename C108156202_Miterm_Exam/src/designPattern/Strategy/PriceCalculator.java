/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Strategy;

/**
 *
 * @author wangh
 */
public class PriceCalculator {
    IStrategy_BusStrategy strategy;

    private PriceCalculator(){
    
    };
    
    public PriceCalculator(IStrategy_BusStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy_BusStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int km){
        return this.calculate(km,strategy);
    }

    private int calculate(int km , IStrategy_BusStrategy strategy){
        this.strategy = strategy;
        return strategy.calculate(km);
    }
}
