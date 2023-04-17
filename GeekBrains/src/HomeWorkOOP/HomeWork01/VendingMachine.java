package HomeWorkOOP.HomeWork01;

import HomeWorkOOP.HomeWork01.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    private int amount;

    public List<Product> getProducts() {
        return products;
    }

    public int getAmount() {
        return amount;
    }
    
    public VendingMachine addProduct(Product product){
        products.add(product);
        return this;
    }
    
    public Product findProduct(String searchWord){
        
        for (Product product: products) {
            if(product.getName().contains(searchWord)){
                return product;
            }
               
        }
        
        return null;
    }
    
    public Product sellProduct(Product product){
        Product found = findProduct(product.getName());
        if (found != null) {
            products.remove(found);
            amount += found.getCost();
        } else {
            System.out.println("Product is not found");
        }
        
        return found;
    }
}
