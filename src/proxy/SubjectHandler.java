package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class SubjectHandler implements InvocationHandler{
	
	private Object subject;
	
	
	public SubjectHandler(Object subject) {
		this.subject=subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		return method.invoke(subject, args);
	}

}
