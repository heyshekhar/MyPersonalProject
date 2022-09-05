package z_oracle;

public class EntryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		enumExample();

	}

	private static void enumExample() {
		// TODO Auto-generated method stub
		
		EnumExample enumExample = EnumExample.V1;
		
		enumExample.setVal(EnumExample.V2.val);
		
		System.out.println("enum 1 : "+enumExample);
		
		System.out.println("enum value : "+EnumExample.V1.val);
		
		System.out.println("enum value : "+enumExample.val); 
	}

}
