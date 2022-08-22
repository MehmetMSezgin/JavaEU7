package Assignment_on_OOP_Concepts.Q14;

import java.util.*;
import java.util.List;

public class TJMaxx {
    
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;
    
    
    public TJMaxx() {
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }
    
    public void addRegularItem(Item item) {
       regularItems.add(item);
    }
    
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);
    }
   
    public List<Item> getRegularItems() { 
        return regularItems;
    }
    
    public List<OnSaleItem> getOnSaleItems() {
        return onSaleItems;
    }
    
    public int regularItemsCount() {
    	int size = regularItems.size();
        return size;
    }
    
    public int onSaleItemsCount() {
        return onSaleItems.size();
    }
   
    public List<String> getAllItemNames() {
    	List<String> itemString = new ArrayList<>() ;
    	for (Item elements : regularItems) {
    		itemString.add(elements.getName());
    	}
    	
    	for (OnSaleItem item : onSaleItems) {
    		itemString.add(item.getName());
    	}
       return itemString;
    }
    
    public double getItemPrice(int catalogNumber){
       double itemPrice = 0.0;
       
       
       for(Item item : regularItems) {
    	   int CatNum = item.getCatalogNumber();
    	   if(CatNum == catalogNumber) {
    		   itemPrice = item.getPrice();
    		   return itemPrice;
    	   }
       }
       
       for(OnSaleItem item : onSaleItems) {
    	   int CatNum = item.getCatalogNumber();
    	   if(CatNum == catalogNumber) {
    		   itemPrice = item.getPrice();
    		   return itemPrice;
    	   }
       }
       
        return itemPrice;
    }
    
    public OnSaleItem getOnSaleItem(String name){
        for (OnSaleItem item : onSaleItems) {
        	if (item.getName().equalsIgnoreCase(name)) {
        		return item;
        	}
        }
        
        return null;
    }     
    
   
    public void removeItem(int catalogNumber) {
        for (Item element : regularItems) {
        	if (element.getCatalogNumber() == catalogNumber) {
        		regularItems.remove(element);
        	}
        }
        
        for (OnSaleItem element  : onSaleItems) {
        	if (element.getCatalogNumber() == catalogNumber) {
        		onSaleItems.remove(element);
        	}
        }
    }
    
    public void buyItem(int catalogNumber) {
       for(Item element : regularItems) {
    	   if (element.getCatalogNumber()== catalogNumber) {
    		   int newQuantity = element.getQuantity()-1;
    		   element.setQuantity(newQuantity);
    		   if (element.getQuantity()==0) {
    			   regularItems.remove(element);
    		   }
    	   }
       }
       
       for(OnSaleItem element : onSaleItems) {
    	   if (element.getCatalogNumber()== catalogNumber) {
    		   int newQuantity = element.getQuantity()-1;
    		   element.setQuantity(newQuantity);
    		   if (element.getQuantity()==0) {
    			   onSaleItems.remove(element);
    		   }
    	   }
       }
       
       
       
    }
}
