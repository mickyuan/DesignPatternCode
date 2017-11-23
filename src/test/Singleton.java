package test;

public class Singleton {

	//静态私有的成员变量
	private static Singleton instance = null;

	static {
		System.out.println("good");
	}

	private Singleton() {

		System.out.println("new咯");
	}

	public static Singleton getInstance() {

		if( instance == null ) {
			synchronized( Singleton.class ) {
				if( instance == null )
					instance = new Singleton();
			}
		}
		return instance;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

//				Singleton singleton = Singleton.getInstance();
//				Singleton singleton3 = Singleton.getInstance();
//				Singleton singleton2 = Singleton.getInstance();
		//		Singleton singleton3 = Singleton.getInstance();
		//		Singleton singleton4 = Singleton.getInstance();
		//		System.out.println(singleton == singleton1);
		//		System.out.println(singleton2 == singleton1);
		//		System.out.println(singleton3 == singleton1);
		//		System.out.println(singleton4 == singleton2);
		//		System.out.println(singleton2 == singleton);
		String className = Singleton.class.getName();
		Singleton singleton = (Singleton)Class.forName(className).newInstance();
		Singleton singleton2 = (Singleton)Class.forName(className).newInstance();
		Singleton singleton3 = (Singleton)Class.forName(className).newInstance();

		System.out.println(singleton2 == singleton3);
		System.out.println(singleton == singleton2);
		System.out.println(singleton == singleton3);
	}
}
