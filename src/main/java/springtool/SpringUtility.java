package springtool;

import org.springframework.context.ApplicationContext;

import utility.SingleClassPathXmlApplicationContext;

public class SpringUtility {

	/**
	 * 得到ioc句柄
	 */

	public static ApplicationContext getIocHandle() {
		return SingleClassPathXmlApplicationContext.getSingleClassPathXmlApplicationContext("ioc.xml");
	}

	/**
	 * 得到注解句柄
	 */
	public static ApplicationContext getAnnotationHandle() {
		return SingleClassPathXmlApplicationContext.getSingleClassPathXmlApplicationContext("spring_annotation.xml");
	}
	
	/**
	 * 得到静态切面句柄
	 */
	public static ApplicationContext getStaticAopHandle() {
		return SingleClassPathXmlApplicationContext.getSingleClassPathXmlApplicationContext("aspectjAop.xml");
	}
	
	/**
	 * 得到schema切面句柄
	 */
	public static ApplicationContext getSchemaAopHandle() {
		return SingleClassPathXmlApplicationContext.getSingleClassPathXmlApplicationContext("schemaAop.xml");
	}
	
	/**
	 * 得到动态切面句柄
	 */
	public static ApplicationContext getDynamicAopHandle() {
		return SingleClassPathXmlApplicationContext.getSingleClassPathXmlApplicationContext("dynamicAop.xml");
	}
}
