/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Decorator;

/**
 *
 * @author wangh
 */
public class BusinessLunch extends Restaurant  {
    
    private Restaurant restaurant;
    
     public BusinessLunch(Restaurant restaurant){
        this.restaurant = restaurant;
    }
    
     private void salad(){
        System.out.println("一盤沙拉");
    }

    private void mainMeal(){
        System.out.println("一份主餐");
    }

    @Override
    public void order() {
        super.order();
        salad();
        mainMeal();
    }
}
