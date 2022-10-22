/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Decorator;

/**
 *
 * @author wangh
 */
public class Restaurant {
    
    private void minimumOrder(){
         System.out.println("一杯飲料");
    }
    
    public void order(){
        minimumOrder();
    }
}
