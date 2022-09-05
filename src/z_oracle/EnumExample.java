/**
 * 
 */
package z_oracle;


/**
 * @author srathore
 *
 */
public enum EnumExample {
	
	V1("1"),
	V2("2");


	EnumExample(String val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
	String val;

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	

}
