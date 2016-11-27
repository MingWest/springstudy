package utility;

import java.util.concurrent.ConcurrentHashMap;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingleClassPathXmlApplicationContext {
	private final static ConcurrentHashMap<String, ClassPathXmlApplicationContext> applicationContextMap = new ConcurrentHashMap<String, ClassPathXmlApplicationContext>();

	public static ClassPathXmlApplicationContext getSingleClassPathXmlApplicationContext(String xmlName) {
		if (applicationContextMap.get(xmlName) != null)
			return applicationContextMap.get(xmlName);
		else {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlName);
			applicationContextMap.put(xmlName, context);
			context = null;
			return applicationContextMap.get(xmlName);
		}
	}
}