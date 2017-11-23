package abstractfactory;

import basicinstance.MailSender;
import basicinstance.Sender;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {

		return new MailSender();
	}

}
