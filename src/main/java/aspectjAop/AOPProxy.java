package aspectjAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPProxy {

	@Pointcut("execution(* aspectjAop.TargetObject.method(..))")
	public void createPointcut() {
	}

	/**
	 * 环绕通知
	 */

	@Around("aspectjAop.AOPProxy.createPointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("TargetObject 环绕通知start stopwatch 方法名：" + pjp.getSignature().getName());

		Object retVal = pjp.proceed();

		System.out.println(
				"TargetObject 环绕通知stop stopwatch 方法名：" + pjp.getSignature().getName() + " return " + retVal.toString());
		
		return retVal;
	}
	
	/**
	 * 抛出后通知
	 */
	@AfterThrowing("aspectjAop.AOPProxy.createPointcut()")
	public void afterThrowAdvice(){
		System.out.println("afterThrowAdvice");
	}

}
