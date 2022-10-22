/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Decorator;

/**
 *
 * @author wangh
 */
public class Salad extends Item{
    private void addSalad(){
        System.out.println("一份沙拉");
    }

    @Override
    public void Show() {
        super.Show();
        addSalad();
    }
}
