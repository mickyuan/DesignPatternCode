package factorymethods;

/**
 * 工厂实现
 * @author yuanqi
 */
public class SendFactory {

	public static Sender produceMail() {

		return new MailSender();
	}

	public static Sender produceSms() {

		return new SmsSender();
	}

	public static void main(String[] args) {

		Sender sender = SendFactory.produceSms();
		sender.Send();
	}
}
