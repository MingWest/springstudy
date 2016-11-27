package ioc;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import springtool.SpringUtility;

public class test {

	@SuppressWarnings("unchecked")
	public test() {
		Super super1 = SpringUtility.getIocHandle().getBean("Super123", Super.class);
		super1.callSubMethod();

		
		java.util.List<MytableBean> list = SpringUtility.getIocHandle().getBean("List_MytableBean",
				java.util.ArrayList.class);
		MytableBean mytableBean = SpringUtility.getIocHandle().getBean("MytableBean",MytableBean.class);
		mytableBean.setAaa("aaaa");
		list.add(mytableBean);
		
		MytableBean bbb = list.get(0);
		System.out.println(bbb.getAaa());
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test();
	}

}
