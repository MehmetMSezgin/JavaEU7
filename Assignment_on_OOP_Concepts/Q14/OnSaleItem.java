package Assignment_on_OOP_Concepts.Q14;


public class OnSaleItem extends Item {
    
    private double discount;
   
    
    public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) {
		super(name, quantity, catalogNumber, price);
		this.discount = discount;
	}
   
    public double getDiscount() {
        return discount;
    }
    
    public void setDiscount(double discount) {
       this.discount=discount;
    }

	@Override
	public String toString() {
		return "OnSaleItem [discount=" + discount + ", Name=" + getName() + ", Price=" + getPrice() + ", catalogNumber=" + getCatalogNumber() + ", quantity=" + getQuantity() + "]";
	}
    
    
}
