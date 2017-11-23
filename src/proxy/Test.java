package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Test {
	
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		InvocationHandler h = new SubjectHandler(subject);
		Subject subjecth = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(), new Class[]{Subject.class}, h);
		subjecth.method();
	}
	
}
