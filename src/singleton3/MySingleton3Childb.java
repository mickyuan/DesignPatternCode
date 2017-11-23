package singleton3;

public class MySingleton3Childb extends MySingleton3 {

	static public MySingleton3Childb getInstance() {

		return (MySingleton3Childb)MySingleton3Childb.getInstance(MySingleton3Childb.class.getName());
	}

	//随便写一个测试的方法  
	public String about() {

		return "---->我是MySingleton3的第二个子类MySingleton3Childb";
	}
}
