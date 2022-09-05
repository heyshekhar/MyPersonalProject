package normalexample;

public class BitwiseExp {

	public static void main(String[] args) {

		System.out.println("Swapping the Two number using bitwise operator...");	
		
		int x=10,y=5;
		
		//code to swap 'x' (1010) and 'y' (0101)
		x = x^y; // x now becmes 15(1111)
		y = x^y; // y becomes 10(1010)
		x = x^y; // x becomes 5()
		System.out.println(x+"...."+y);
		
		x=100;y=99;
		while(y!=0)
		{
			//Carry now contains common set bits of x and y
			int carry = x&y;
			
			//sum of bits of the bits is not set
			x = x^y;
			
			//carry is shifted by one so that adding it to x gives the required sum
			y=carry<<1;
		}
		
		System.out.println("addition of thwo number is : "+x);
	}

}
