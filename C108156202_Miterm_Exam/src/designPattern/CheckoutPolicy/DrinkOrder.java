/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.CheckoutPolicy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wangh
 */
public class DrinkOrder {
     //放飲料的list
    private List<CheckoutPolicyDrink> drinkList = new ArrayList<CheckoutPolicyDrink>();

    //加入飲料
    public void addDrink(CheckoutPolicyDrink drink){
        drinkList.add(drink);
    }
	//移除飲料
    public void removeDrink(CheckoutPolicyDrink drink){
        drinkList.remove(drink);
    }

    //飲料總價錢（私有方法）
    private double totalPrice(){

        double totalPrice = 0 ;

        for(CheckoutPolicyDrink d:drinkList){
            totalPrice += d.getValue();
        }

        return totalPrice;

    }

    //訂單總價錢
    public double getTotalPrice(IDiscountStrategy discountStrategy){

        double totalPrice = totalPrice();
        return discountStrategy.getValue(totalPrice);

    }
}
