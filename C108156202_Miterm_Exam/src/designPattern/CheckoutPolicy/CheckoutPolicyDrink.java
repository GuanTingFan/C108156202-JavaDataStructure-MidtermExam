/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.CheckoutPolicy;

/**
 *
 * @author wangh
 */
public class CheckoutPolicyDrink {
    private IDiscountStrategy discountStrategy = new NoneDiscount(1);
    
    private double value;
    
     private CheckoutPolicyDrink(){
         
     }
     
     public CheckoutPolicyDrink(double value){
         this.value = value;
     }
     
     public CheckoutPolicyDrink(double value,IDiscountStrategy discountStrategy){
         this.value = value;
         this.discountStrategy = discountStrategy;
     }
     
     public double getValue() {
        return discountStrategy.getValue(value) ;
    }
}



