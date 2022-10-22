/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Decorator;

/**
 *
 * @author wangh
 */
public class DecoratorDrink extends Item{
    
    private void addDrink(){
        System.out.println("一份飲料");
    }
    
    @Override
    public void Show() {
        super.Show();
        addDrink();
    }
}
