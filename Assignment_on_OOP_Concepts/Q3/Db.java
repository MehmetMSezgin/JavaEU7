package Assignment_on_OOP_Concepts.Q3;

public class Db {
	private String data ;
	private int yint ;
	
	public void insertData(String Ldata, int Lyint) {
		this.data = Ldata;
		this.yint = Lyint;
	}
	
	public String getData() {
		return data;
	}
	
	public int getYint() {
		return yint;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void setYint(int yint) {
		this.yint = yint ;
	}
	
	public static void main(String[] args) {
		Db db = new Db();
		db.insertData("aaa", 123);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
		
		db.setData("zzz");
		db.setYint(345);
	}
	
	
	
	
	
	
	
	
}
