/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pricetags;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import pricetags.newpackage.ImportedProduct;
import pricetags.newpackage.Product;
import pricetags.newpackage.UsedProduct;

/**
 *
 * @author Pichau
 */
public class PriceTags {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Product> listaProd = new ArrayList <Product>();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos deseja adicionar? ");
        int quantProd = leitor.nextInt();
        
        for(int i = 0; i < quantProd; i++){
            System.out.println("Qual a procedencia de produto? ");
            System.out.println("c - Comum");
            System.out.println("i - Importado");
            System.out.println("u - usado");
            char reply = leitor.next().charAt(0);
            if(reply == 'c'){
                System.out.println("Insira o nome do produto: ");
                String title = leitor.next();
                System.out.println("Insira o preço do produto: ");
                double price = leitor.nextDouble();
                listaProd.add(new Product(title, price));
            }
            if(reply == 'i'){
                System.out.println("Insira o nome do produto: ");
                String title = leitor.next();
                System.out.println("Insira o preço do produto: ");
                double price = leitor.nextDouble();
                System.out.println("Insira a taxa de importação: ");
                double royalties = leitor.nextDouble();
                listaProd.add(new ImportedProduct(title, price, royalties));
            }
            if(reply == 'u'){
                 System.out.println("Insira o nome do produto: ");
                String title = leitor.next();
                System.out.println("Insira o preço do produto: ");
                double price = leitor.nextDouble();
                System.out.println("Insira a data de fabricação do produto (dd/mm/yyyy");
                String dateNonParsed = leitor.next();
                try{
                    Date dateParsed = new SimpleDateFormat("dd/MM/yyyy").parse(dateNonParsed);
                    listaProd.add(new UsedProduct(dateParsed,title, price));
                }catch(Exception e){
                    System.out.println("Erro insira algo válido");
                    System.out.println(e.getMessage());
                }
                

            }
        }
        System.out.println("TAGS");
        for(Product x: listaProd){
            System.out.println(x.priceTag());
        }
        
    }
    
}
