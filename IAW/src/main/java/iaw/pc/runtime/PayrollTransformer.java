package iaw.pc.runtime;

import org.springframework.integration.annotation.Transformer;

import iaw.pc.messages.Debit;
import iaw.pc.messages.PhoneCall;

public class PayrollTransformer {

	@Transformer
	public Debit transform(PhoneCall call) {
		return new Debit(call.getCaller().getEmployeeId(), call
				.getDestination().getCost(), createDescription(call));

	}

	private String createDescription(PhoneCall call) {
		return "Phone call made to: "+ call.getDestination().getNumber() + " ("+ call.getDestination()
		.getDuration() + ")";
	}

}
