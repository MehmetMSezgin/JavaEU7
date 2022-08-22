package Assignment_on_OOP_Concepts.Q14;

public class ItemTest {

	public static void main(String[] args) {
		
		Item items = new Item("Shoes",20,101,40);
		Item items2 = new Item("Bags",10,103,20);

		OnSaleItem saleItem = new OnSaleItem("Pants", 1, 102, 10, 5);
		OnSaleItem saleItem2 = new OnSaleItem("Jackets", 2, 104, 100, 7);

		System.out.println(items.toString());
		System.out.println(saleItem.toString());
		
		TJMaxx account = new TJMaxx();
		account.addRegularItem(items);
		account.addRegularItem(items2);
		account.addOnSaleItem(saleItem);
		account.addOnSaleItem(saleItem2);
		
		System.out.println("****************************");
		System.out.println(account.getRegularItems());
		System.out.println(account.getOnSaleItems());
		
		System.out.println("****************************");
		System.out.println(account.regularItemsCount());
		System.out.println(account.onSaleItemsCount());
		
		System.out.println("****************************");
		System.out.println(account.getAllItemNames());
		
		System.out.println("****************************");
		System.out.println(account.getItemPrice(102));
		
		try {
		account.removeItem(104);
		} catch (Exception e) {
			System.out.println("---exception---");
		}
		
		System.out.println("****************************");
		System.out.println(account.getAllItemNames());

		
		System.out.println("****************************");
		
		try {
			account.buyItem(102);
		} catch (Exception e) {
			System.out.println("---exception---");
		}
		
		System.out.println("****************************");
		System.out.println(account.getAllItemNames());
		System.out.println(saleItem.toString());

		



		
		

	}

}
