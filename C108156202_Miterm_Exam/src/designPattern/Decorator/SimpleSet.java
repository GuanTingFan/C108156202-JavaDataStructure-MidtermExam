/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Decorator;

/**
 *
 * @author wangh
 */
public class SimpleSet extends Item{
    
    private void addSet(){
        Salad salad = new Salad();
        MainMeal mainMeal = new MainMeal();
        DecoratorDrink drink = new DecoratorDrink();
        mainMeal.decorate(salad);
        drink.decorate(mainMeal);
        super.order = drink;
    }
    
    @Override
    public void Show() {
        addSet();
        super.Show();
    }
}
