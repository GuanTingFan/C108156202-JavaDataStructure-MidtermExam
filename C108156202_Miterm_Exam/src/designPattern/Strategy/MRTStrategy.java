/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Strategy;

/**
 *
 * @author wangh
 */
public class MRTStrategy implements IStrategy_BusStrategy {
    @Override
    public int calculate(int km) {

        int totalPrice = 0 ;
        if(km <= 0) return  totalPrice ;

        if(km <= 10) {
            totalPrice = 20 ;
        }

        if(km > 10){
            int count = (( km - 10 ) / 5 ) + 1 ;
            totalPrice = 20 + 5 * count ;
        }

        return totalPrice;

    }
}
