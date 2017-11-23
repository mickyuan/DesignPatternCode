package singleton3;

public class myprint3 {

	/** 
	* 登记式单例模式 
	* MySingleton2 
	*/
	public static void myprint3() {

		System.out.println("-----------------登记式单例模式----------------");
		System.out.println("第一次取得实例（登记式）");
		MySingleton3 s1 = MySingleton3.getInstance(null);
		System.out.println(s1);
		System.out.println("第二次取得实例（登记式）");
		MySingleton3Childa s3 = MySingleton3Childa.getInstance();
		System.out.println(s3);
		System.out.println(s3.about());
		System.out.println("第三次取得实例（登记式）");
		MySingleton3Childb s4 = MySingleton3Childb.getInstance();
		System.out.println(s4);
		System.out.println(s4.about());
		System.out.println("第四次取得实例（非正常直接new子类的构造方法）");
		MySingleton3Childb s5 = new MySingleton3Childb();
		System.out.println(s5);
		System.out.println(s5.about());
		System.out.println("输出父类中Map保存的所有单例，可以看出，直接new出来的实例并没有存在Map中");
		System.out.println(s1.getMap());
		System.out.println();
	}

	/** 
	* @param args 
	*/
	public static void main(String[] args) {

		// TODO Auto-generated method stub  
		//懒汉式  
		//myprint();  
		//饿汉式  
		//myprint2();  
		//懒汉式改进  
		//myprint2a();  
		//登记式  
		myprint3();

	}
}
