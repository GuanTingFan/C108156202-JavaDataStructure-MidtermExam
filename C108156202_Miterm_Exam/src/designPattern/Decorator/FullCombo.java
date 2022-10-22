/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Decorator;

/**
 *
 * @author wangh
 */
public class FullCombo extends SimpleCombo{
    
    public FullCombo(Restaurant restaurant) {
        super(restaurant);
    }
    
    private void sweet(){
        System.out.println("一份甜品");
    }
    
    @Override
    public void order() {
        super.order();
        sweet();
    }
}
