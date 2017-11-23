package singleton2;

public class Singleton2 {

	/* 私有构造方法，防止被实例化 */
	private Singleton2() {
		System.out.println("11");
	}

	/* 此处使用一个内部类来维护单例 */
	private static class SingletonFactory {

		private static Singleton2 instance = new Singleton2();
	}

	/* 获取实例 */
	public static Singleton2 getInstance() {

		return SingletonFactory.instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {

		return getInstance();
	}
	
	public static void main(String[] args) {
		Singleton2 s2 = Singleton2.getInstance();
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		
	}
}
