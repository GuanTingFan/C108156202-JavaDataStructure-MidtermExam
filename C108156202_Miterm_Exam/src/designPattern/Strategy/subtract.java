/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Strategy;

/**
 *
 * @author wangh
 */
public class subtract implements IStrategy {
    @Override
    public int caculate(int a, int b) {
        return a - b ;
    }
}
