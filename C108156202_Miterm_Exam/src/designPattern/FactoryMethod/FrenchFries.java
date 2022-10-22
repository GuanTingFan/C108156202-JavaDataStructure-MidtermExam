/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.FactoryMethod;

/**
 *
 * @author wangh
 */
public class FrenchFries implements Product{
    
    boolean isSalt;
    
    FrenchFries(){
       isSalt = true;
    }
    
    FrenchFries(boolean isSalt){
       isSalt = isSalt;
    }
        
    @Override
    public void describe() {   
        if (this.isSalt){
             System.out.println("我是有鹽薯條");
        }else{
            System.out.println("我是無鹽薯條");
        } 
    }
}
