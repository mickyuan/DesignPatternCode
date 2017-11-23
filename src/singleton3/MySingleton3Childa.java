package singleton3;

public class MySingleton3Childa extends MySingleton3 {

	public static MySingleton3Childa getInstance() {

		return (MySingleton3Childa)MySingleton3Childa.getInstance(MySingleton3Childa.class.getName());
	}

	//随便写一个测试的方法  
	public String about() {

		return "---->我是MySingleton3的第一个子类MySingleton3Childa";
	}
}
