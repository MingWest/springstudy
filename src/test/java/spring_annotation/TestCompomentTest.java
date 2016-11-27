package spring_annotation;


import org.junit.Test;

import junit.framework.Assert;
import springtool.SpringUtility;

public class TestCompomentTest {

	@Test
	public void test() {
		TestCompoment compoment = SpringUtility.getAnnotationHandle().getBean("component", TestCompoment.class);
		
		Assert.assertNotNull(compoment.getCtx());
		
		Assert.assertNotNull(compoment.getWord());
		
		Bar bar = compoment.getBar();
		Assert.assertNotNull(bar.getMsg(),"msg1");
	}

}
