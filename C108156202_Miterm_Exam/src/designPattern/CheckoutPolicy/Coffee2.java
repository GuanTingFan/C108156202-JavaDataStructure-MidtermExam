/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.CheckoutPolicy;

/**
 *
 * @author wangh
 */
public class Coffee2 extends CheckoutPolicyDrink {
    public Coffee2(double value) {
        super(value);
    }

    public Coffee2(double value, IDiscountStrategy discountStrategy) {
        super(value, discountStrategy);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
