
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
//        if(basket.isEmpty()){
//            basket.put(product, new Purchase(product, 1, price));
//        }else{
//          
//          for(String item : this.basket.keySet()){
//                if(item.contains(product)){
//                    this.basket.get(item).increaseAmount();
//                    break;
//                }  
//            }
//          
//           if(!this.basket.keySet().contains(product)){
//                    basket.put(product, new Purchase(product, 1, price));
//            }
//
//        }

        Purchase purchase = this.basket.get(product);
        if(purchase == null){
            purchase = new Purchase(product, 0, price);
        }
        
        purchase.increaseAmount();
        
        this.basket.put(product, purchase);
    
       
    }
    
    public int price(){
        int total = 0;
        for(Purchase purchase : this.basket.values()){
            total += purchase.price();
        }
        
       return total;
    }
    
    public void print(){

        for(Purchase purchase : this.basket.values()){
            System.out.println(purchase);
        }
    }
}
