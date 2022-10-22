/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.CheckoutPolicy;

import designPattern.CheckoutPolicy.IDiscountStrategy;

/**
 *
 * @author wangh
 */
public class NoneDiscount extends IDiscountStrategy {

    public NoneDiscount(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {

        return value;
    }

}
