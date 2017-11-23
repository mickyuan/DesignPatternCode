package abstractfactory;

import basicinstance.Sender;
import basicinstance.SmsSender;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {

		return new SmsSender();
	}

}
