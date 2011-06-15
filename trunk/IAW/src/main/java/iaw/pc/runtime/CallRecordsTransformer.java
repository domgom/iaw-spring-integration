package iaw.pc.runtime;

import iaw.pc.messages.CallRecords;
import iaw.pc.messages.Caller;
import iaw.pc.messages.Destination;
import iaw.pc.messages.PhoneCall;

import java.text.ParseException;

import org.springframework.integration.annotation.Transformer;

public class CallRecordsTransformer {

	@Transformer
	public CallRecords transform(byte[] log) throws ParseException {
		String logRecord = new String(log);
		CallRecords callRecords = new CallRecords();

		for (String logLine : logRecord.split("\n")) {

			String[] line = logLine.split(" ");
			PhoneCall call = new PhoneCall(new Caller(line[1], null, null,
					line[3], null, line[5]), new Destination(line[3], line[7],
					Float.parseFloat(line[9]), calculateDuration(line[11])));

			callRecords.getCallRecords().add(call);
		}

		return callRecords;
	}

	private long calculateDuration(String duration) {
		return Long.parseLong(duration.replace("\r", ""))*1000;
	}
}
