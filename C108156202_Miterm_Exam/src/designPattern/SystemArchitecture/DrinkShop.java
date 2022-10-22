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
    public Drink order(DrinkType drinktype,Drink.SugarType sugarType, Drink.IceType iceType){
        switch (drinktype){
            case COFFEE:
                return new Coffee(sugarType,iceType);
            case TEA:
                return new Tea(sugarType,iceType);
            default:
                return null;
        }
    }
    
    public enum DrinkType{
        COFFEE,TEA
    }
    
}
