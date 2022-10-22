/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.SystemArchitecture;

/**
 *
 * @author wangh
 */
public class DrinkShop {
    public Drink order(String drink,Drink.SugarType sugarType, Drink.IceType iceType){
        drink.toLowerCase();
        switch (drink){
            case "coffee":
                return new Coffee(sugarType,iceType);
            case "tea":
                return new Tea(sugarType,iceType);
            default:
                return null;
        }
    }
}
