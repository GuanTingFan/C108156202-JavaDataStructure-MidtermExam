/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.CheckoutPolicy;

/**
 *
 * @author wangh
 */
public class ReducePricePolicy  extends IDiscountStrategy {

    public ReducePricePolicy(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value - super.getDisscount();
    }

}
