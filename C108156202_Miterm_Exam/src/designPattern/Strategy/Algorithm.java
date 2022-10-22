/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Strategy;

/**
 *
 * @author wangh
 */
public class Algorithm{
    /*
        嘗試以這種方式撰寫，不確定是否優良，等待查證中。。。
    */
    static class add implements IStrategy {
        @Override
        public int caculate(int a, int b) {
            return a + b;
        }
    }

    static class divide implements IStrategy {
        @Override
        public int caculate(int a, int b) {
            return a / b;
        }
    }

    static class multyply implements IStrategy {
        @Override
        public int caculate(int a, int b) {
            return a * b;
        }
    }

    static class subtract implements IStrategy {
        @Override
        public int caculate(int a, int b) {
            return a - b;
        }
    }
}
