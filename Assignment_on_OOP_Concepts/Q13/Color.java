package Assignment_on_OOP_Concepts.Q13;

import java.util.*;

public class Color {
    
    private int[] rgb = new int[3];
    
    
    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};
    
    public Color(int r, int g, int b){
        rgb[0]= r ;
        rgb[1]= g ;
        rgb[2]= b ;
     }
    
    public Color() {
        this.rgb=WHITE;
        ArrayList <int[]> array = new ArrayList<>();
        array.add(WHITE);
        array.add(LIGHT_GRAY);
        array.add(GRAY);
        array.add(DARK_GRAY);
        array.add(BLACK);
        array.add(RED);
        array.add(ORANGE);
        array.add(YELLOW);
        array.add(GREEN);
        array.add(MAGENTA);
        array.add(CYAN);
        array.add(BLUE); 
    }
    
	public Color(int[] rgb) {
		super();
		this.rgb = rgb;
	}

	@Override
	public String toString() {
		if(Arrays.equals(rgb, WHITE)) {
			return "white";
		}else if (Arrays.equals(rgb, BLUE)) {
			return "blue" ;
		}else if (Arrays.equals(rgb, LIGHT_GRAY)) {
			return "LIGHT_GRAY" ;
		}else if (Arrays.equals(rgb, GRAY)) {
			return "GRAY" ;
		}else if (Arrays.equals(rgb, BLACK)) {
			return "BLACK" ;
		}else if (Arrays.equals(rgb, RED)) {
			return "RED" ;
		}else if (Arrays.equals(rgb, ORANGE)) {
			return "ORANGE" ;
		}
		return "N/A";
	}

	//************************************************//
    public static void main(String[] args) {
    	Color color = new Color();
        System.out.println(color.toString() ) ; // prints "white"
        
        Color color4 = new Color(192, 192, 192); 
        System.out.println(color4 ) ; // prints "light gray"
        
        
    
	}
    
}
