
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class Storehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stock;
    
    public Storehouse(){
        this.products = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }
    
    
    public void addProduct(String product, int price, int stock){
        this.products.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        for(String key : this.products.keySet()){
            if(key.equals(product)){
                return this.products.get(key);
            }
        }
        
        return -99;
    }
    
    public int stock(String product){
        for(String key : this.stock.keySet()){
            if(key.equals(product)){
                return this.stock.get(key);
            }
        }
        
        return 0;
    }
    
    public boolean take(String product){
        for(String key : this.stock.keySet()){
            if(key.equals(product)){
                int currentStockLevel = this.stock.get(key);
                if(currentStockLevel > 0){
                    this.stock.replace(key, currentStockLevel - 1);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public Set<String> products(){
        return this.products.keySet();
    }
}
