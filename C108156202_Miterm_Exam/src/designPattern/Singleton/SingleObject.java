/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Singleton;

/**
 *
 * @author wangh
 */
public class SingleObject {

    /*
        積極單例模式
     */
    private static SingleObject instance = new SingleObject();

    //設為Private 避免被實例化
    private SingleObject() {

    }

    //獲取唯一對象
    public static SingleObject getInstance() {
        return instance;
    }
}
