package chainofresponsibility;

public class Test {

	public static void main(String[] args) {

		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");

		/*
		 * 同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。
		 * 就像这里set是一个set一个而不是set很多个 
		 */
		h1.setHandler(h2);
		h2.setHandler(h3);
		h1.operator();

	}
}
