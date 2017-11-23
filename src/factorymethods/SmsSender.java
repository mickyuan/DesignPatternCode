package factorymethods;

/**
 * Sms发送
 * @author yuanqi
 */
public class SmsSender implements Sender {

	@Override
	public void Send() {

		System.out.println("this is smsSender!");

	}

}
