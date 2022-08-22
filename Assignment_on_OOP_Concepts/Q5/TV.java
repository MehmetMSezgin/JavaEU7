package Assignment_on_OOP_Concepts.Q5;

public class TV {
	int channel = 1 ;
	int volumeLevel = 1;
	boolean on = false ;
	String brand = "undefined";
	
	public TV() {
		super();
		System.out.println("Creating TV object using no Args- constructor");
	}
	
	public TV(String brand) {
		this.brand= brand ;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(this.channel>120 || this.channel<0) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
		this.channel = channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (this.volumeLevel>7 || this.volumeLevel<1) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
		this.volumeLevel = volumeLevel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void channelUp() {
		if(this.channel>120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		} else {
			channel++ ;
		}
	}
	
	public void channelDown() {
		if(this.channel<0) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else {
			channel-- ;
		}
	}
	
	public void VolumeUp() {
		
		if (on==true) {
			if (this.volumeLevel>7) {
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
			}else {
				volumeLevel++;
			}
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
		
		
	}
	
	public void VolumeDown() {
		if (on==true) {
			if (this.volumeLevel<1) {
				System.out.println("ERROR: TV is either OFF or invalid Volume level");
			}else {
				volumeLevel--;
			}
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}	
	}
	
	public void isOn() {
		if(on==false) {
			System.out.println("TV is already OFF");
		}else if (on==true) {
			System.out.println("TV is already ON");
		}
	}
	
	public void turnOn() {
		if (on==true) {
			isOn();
		}else {
			on = true;
		}
	}
	
	public void turnOff() {
		if (on==false) {
			isOn();
		}else {
			on = false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
