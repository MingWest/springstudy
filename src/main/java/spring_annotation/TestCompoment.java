package spring_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("component")
public class TestCompoment {
	
	@Autowired
	private ApplicationContext ctx;

	public ApplicationContext getCtx() {
		return ctx;
	}
	
	private String word;

	public String getWord() {
		return word;
	}
	
	@Required
	public void setWord(String word) {
		this.word = word;
	}
	
	@Autowired
	@Qualifier(value="bar1")
	private Bar bar;

	public Bar getBar() {
		return bar;
	}
	
}
