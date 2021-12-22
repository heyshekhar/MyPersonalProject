package serializationExample;

import java.io.Serializable;

public class SerializableExample implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2047942854129289682L;
	public int a;
    public String b;
    transient public int c;
    public static int d;
    
    // Default constructor
    public SerializableExample(int a, String b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c= c;
        this.d =d;
    }

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public static int getD() {
		return d;
	}

	public static void setD(int d) {
		SerializableExample.d = d;
	}
    
    
    
}
