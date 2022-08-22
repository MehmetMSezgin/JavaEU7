package Assignment_on_OOP_Concepts.Q12;

public class CameraPhone extends Phone {
	int imageSize ;
	int memorySize;
	
	public CameraPhone(int img,int memory) {
		imageSize=img;
		memorySize=memory;
	}
	
	public int numPictures() {
		int mb = memorySize*1000;
		int numPic= Math.round((mb/(imageSize*2)));
		return numPic;
	}
	
	public static void main(String[] args) {
		CameraPhone ph = new CameraPhone(24, 4);
		System.out.println(ph.numPictures());
	}
	
}
