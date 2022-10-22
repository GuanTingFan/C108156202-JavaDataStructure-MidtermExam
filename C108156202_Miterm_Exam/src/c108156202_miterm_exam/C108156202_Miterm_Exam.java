/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c108156202_miterm_exam;

import designPattern.FactoryMethod.*;
import designPattern.Strategy.*;

/**
 *
 * @author wangh
 */
public class C108156202_Miterm_Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        FactoryDesignPattern();
//        Strategy();
    }

    private static void FactoryDesignPattern() {

        FrenchFriesFactory FrenchFriesFactory = new FrenchFriesFactory();
        Product fries = FrenchFriesFactory.productionProduct();

        Product myfries = FrenchFriesFactory.productionProduct(false);

        fries.describe();
        myfries.describe();
    }

    private static void Strategy() {

        Calculator myCalculator = new Calculator();

        Calculator.DoType DoType = Calculator.DoType.ADD;

        myCalculator.setStrategy(DoType.SuBTRACT);
        System.out.println(myCalculator.execute(1, 5));

        MRTStrategy myMRTStartegy = new MRTStrategy();
        PriceCalculator MRTPriceCalculator = new PriceCalculator(myMRTStartegy);
        System.out.println(MRTPriceCalculator.calculate(20));

        BusStrategy myBusStrategy = new BusStrategy();
        PriceCalculator BusPriceCalculator = new PriceCalculator(myBusStrategy);
        System.out.println(BusPriceCalculator.calculate(20));
    }
}
