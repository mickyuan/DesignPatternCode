package Singleton;

public class Singleton {

	private static Singleton instance = null;

	/*
	 * 私有构造方法，防止被实例化 
	 */
	private Singleton() {

	}

	private static synchronized void syncInit() {

		if( instance == null ) {
			instance = new Singleton();
		}
	}

	/*
	 * 获取实例
	 */
	public static Singleton getInstance() {

		if( instance == null ) {
			syncInit();
		}
		return instance;
	}

	public Object readResolve() {

		return getInstance();
	}

}
