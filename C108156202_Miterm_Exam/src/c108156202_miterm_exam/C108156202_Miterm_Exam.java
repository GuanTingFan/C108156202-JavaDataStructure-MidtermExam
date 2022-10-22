/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c108156202_miterm_exam;

import designPattern.FactoryMethod.*;

/**
 *
 * @author wangh
 */
public class C108156202_Miterm_Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryDesignPattern();
    }

    
    private static void FactoryDesignPattern() {

        FrenchFriesFactory FrenchFriesFactory = new FrenchFriesFactory();
        Product fries = FrenchFriesFactory.productionProduct();

        Product myfries = FrenchFriesFactory.productionProduct(false);
        
         fries.describe();
         myfries.describe();
    }
}