/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.CheckoutPolicy;

/**
 *
 * @author wangh
 */
public abstract class IDiscountStrategy {
     
    private double discount;
    
    private IDiscountStrategy(){
        
    }
    
    public IDiscountStrategy(double discount){
        this.discount = discount;
    }
    
    public double getDisscount(){
        return this.discount;
    }
    
    abstract public double getValue(double value);
}
