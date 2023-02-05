/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pricetags.newpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pichau
 */
public class UsedProduct extends Product {
    private Date dataFab; 
    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {
    }

    public UsedProduct(Date dataFab, String name, double price) {
        super(name, price);
        this.dataFab = dataFab;
    }

    public String getDataFab() { 
        return format.format(dataFab);
    }
    

    @Override
    public String priceTag() {
        return(this.getName() + "(used) $ " + this.getPrice() + "(Manufacture Date " + this.getDataFab()+ ")");
    }
    
    
}
