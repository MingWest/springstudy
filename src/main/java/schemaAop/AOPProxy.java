package schemaAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


//@Aspect
public class AOPProxy {

	//@Pointcut("execution(* aspectjAop.TargetObject.method(..))")
	public void createPointcut() {
	}

	/**
	 * 环绕通知
	 */

	//@Around("aspectjAop.AOPProxy.createPointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("TargetObject 环绕通知start stopwatch 方法名：" + pjp.getSignature().getName());

		Object retVal = pjp.proceed();

		System.out.println(
				"TargetObject 环绕通知stop stopwatch 方法名：" + pjp.getSignature().getName() + " return " + retVal.toString());

		return retVal;
	}

	/**
	 * 前置通知
	 */
	//@Before("aspectjAop.AOPProxy.createPointcut() && args(param1,param2)")
	public void beforeAdviceWIthParam(JoinPoint joinPoint, String param1, int param2) {
		System.out.println(
				"beforAdviceWithParam 方法名：" + joinPoint.getSignature().getName() + "参数" + param1 + " " + param2);
	}

	/**
	 * 前置通知
	 */
	//@Before("aspectjAop.AOPProxy.createPointcut()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("beforeAdvice 方法名：" + joinPoint.getSignature().getName());
	}

	/**
	 * 返回时通知
	 */
	//@AfterReturning("aspectjAop.AOPProxy.createPointcut()")
	public void AfterReturningAdvice(JoinPoint joinPoint) {
		System.out.println("AfterReturningAdvice 方法名：" + joinPoint.getSignature().getName());
	}

	/**
	 * 返回时通知
	 */
	//@AfterReturning(pointcut = "aspectjAop.AOPProxy.createPointcut()", returning = "retVal")
	public void afterReturningAdviceWithParam(JoinPoint joinPoint, Object retVal) {
		System.out.println("afterReturningAdviceWithParam 方法名：" + joinPoint.getSignature().getName() + " return "
				+ retVal.toString());
	}

	/**
	 * 返回后通知
	 */
	//@After("aspectjAop.AOPProxy.createPointcut()")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("afterAdvice 方法名：" + joinPoint.getSignature().getName());
	}

	/**
	 * 抛出后通知
	 */
	//@AfterThrowing("aspectjAop.AOPProxy.createPointcut()")
	public void afterThrowAdvice() {
		System.out.println("afterThrowAdvice");
	}

}
