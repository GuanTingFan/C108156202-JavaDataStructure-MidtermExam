/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designPattern.FactoryMethod;

/**
 *
 * @author wangh
 */
public class FrenchFriesFactory implements Factory{

    @Override
    public Product productionProduct() {
        return new FrenchFries();
    }
    
    public Product  productionProduct(boolean isSalt) {
        return new FrenchFries(isSalt);
    }
}
