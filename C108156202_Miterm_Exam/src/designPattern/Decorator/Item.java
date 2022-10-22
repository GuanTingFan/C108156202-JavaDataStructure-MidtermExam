/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Decorator;

/**
 *
 * @author wangh
 */
public class Item extends DecoratorOrder{
    protected DecoratorOrder order;
    
    public void decorate(DecoratorOrder order){
        this.order = order;
    }
    
    @Override
    public void Show(){
           if (order != null){
               order.Show();
           }
    }
}
