/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Decorator;

/**
 *
 * @author wangh
 */
public class SimpleCombo extends BusinessLunch {
    
    public SimpleCombo(Restaurant restaurant) {
        super(restaurant);
    }
 
    private void soup(){
        System.out.println("一道湯品");
    }
    
    @Override
    public void order(){
        super.order();
        soup();
    }
}
