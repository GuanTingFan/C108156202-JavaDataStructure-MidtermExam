/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Strategy;

/**
 *
 * @author wangh
 */
public class BusStrategy implements IStrategy_BusStrategy {

    @Override
    public int calculate(int km) {
        
        int count = 0;
        
        if (km <= 10){
            count = 1;
        }else if (km > 0){
            count = 2;
        }
        
        return count * 15 ;
    }
    
}
