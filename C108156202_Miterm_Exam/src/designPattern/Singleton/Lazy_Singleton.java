/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.Singleton;

/**
 *
 * @author wangh
 */
public class Lazy_Singleton {
    private static Lazy_Singleton instance;
    
    private Lazy_Singleton(){
        
    }
   
    /*
        synchronized在多線程下確保物件唯一性
    */
    public static synchronized Lazy_Singleton GetInstance(){
        /*
            分兩次判斷並初始化 避免不必要的同步產生
        */
        if (instance == null)
        {
            synchronized (Lazy_Singleton.class){
                if (instance == null){
                    /*
                        給Singleton的實例分配記憶體；
                        呼叫Singleton的建構函數，初始化成員欄位；
                        將instance物件指向分配的記憶體空間(此時instance不是null)。
                    
                        Java編譯器允許失序執行所以後兩者無法保證順序 如果先完成最後步驟
                        另一條線呈來拿instance 不會是null所以會報錯
                    */
                    instance = new Lazy_Singleton();
                }
            }  
        }
        
       
        return instance;
    }
}
