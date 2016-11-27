package ioc;

import java.io.Serializable;

public class MytableBean implements Serializable {

	private static final long serialVersionUID = 19761210;
	
	
	public MytableBean(){super();}
	
	private String aaa="";


	public String getAaa() {
		return aaa;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}
	
}
