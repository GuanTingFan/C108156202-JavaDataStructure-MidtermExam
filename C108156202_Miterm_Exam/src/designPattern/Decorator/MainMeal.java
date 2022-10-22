/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Decorator;

/**
 *
 * @author wangh
 */
public class MainMeal extends Item{
    private void addMeal(){
        System.out.println("加一份主餐");
    }

    @Override
    public void Show() {
        super.Show();
        addMeal();
    }
}
