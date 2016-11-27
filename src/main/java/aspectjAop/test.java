package aspectjAop;

import springtool.SpringUtility;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TargetObject targetObject = SpringUtility.getStaticAopHandle().getBean("TargetObject", TargetObject.class);
		try{
			targetObject.method("targetObject is called", 5);
		}catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
