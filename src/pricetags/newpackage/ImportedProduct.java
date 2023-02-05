/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pricetags.newpackage;

/**
 *
 * @author Pichau
 */
public final class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customsFee = customFee;
        this.price += customsFee; 
    }

    public double getCustomsFee() {
        return customsFee;
    }
    
    @Override
    public String priceTag(){
        return (this.getName() + " $ " + this.getPrice() + "(Customs Fee $ "+this.getCustomsFee()+")" );
    }
    
    
}
