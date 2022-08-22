package Assignment_on_OOP_Concepts.Q8;

public class Value {
	int value;
	int setUsed=0;
	int consUsed=0;
	public Value(int element) {
		value=element;
		consUsed++;
	}
	public Value() {}
	public void setVal(int set) {
		value=set;
		setUsed++;
	}
	public boolean wasModified() {
		if(setUsed>1) {
			return true;
		}
		return false;
	}
	public int getVal() {
		if(setUsed>0) {
			return value;
		}else if(consUsed>0) {
			return value;
		} else {
			return 0;
		}
		
	}
	
	
}
