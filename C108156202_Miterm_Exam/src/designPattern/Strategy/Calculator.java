/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Strategy;

/**
 *
 * @author wangh
 */
public class Calculator {
    private IStrategy strategy;
    public int execute(int a , int b){
        return strategy.caculate(a,b);
    }
    
    public void setStrategy(DoType doType) {
        switch (doType){
            case ADD:
                this.strategy = new Algorithm.add();
                break;
            case SuBTRACT:
               this.strategy = new Algorithm.subtract();
                break;
            case DIVIDE:
                this.strategy = new Algorithm.divide();
                break;
            case MULTYPLY:
               this.strategy = new Algorithm.multyply();
                break;
        }
    }
    
    //列舉
    public enum DoType{
        ADD , SuBTRACT , DIVIDE , MULTYPLY
    }
}
