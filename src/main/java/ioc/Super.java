package ioc;

public class Super {
	
	private Sub sub;

	public Sub getSub() {
		return sub;
	}

	public void setSub(Sub sub) {
		this.sub = sub;
	}
	
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void callSubMethod(){
		System.out.println(sub.doSubMethod() + getStr());
	}
}
