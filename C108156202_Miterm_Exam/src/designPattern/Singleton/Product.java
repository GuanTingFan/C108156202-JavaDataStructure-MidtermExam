/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Singleton;

/**
 *
 * @author wangh
 */
public abstract class Product {
    public String getName(){
        return this.getClass().getSimpleName();
    }
}