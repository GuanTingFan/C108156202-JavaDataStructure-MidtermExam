/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Singleton;

/**
 *
 * @author wangh
 */
public class StaticInnerClass {

    private StaticInnerClass() {
        
    }
    
    public static StaticInnerClass getInstance(){
        return StaticInnerClassHolder.instance;
    }
    
    /*
        靜態的內部類別
        確保線程安全，保證物件唯一性，並且延遲實例化
     */
    private static class StaticInnerClassHolder{
        private static StaticInnerClass instance = new StaticInnerClass();
    }
}
