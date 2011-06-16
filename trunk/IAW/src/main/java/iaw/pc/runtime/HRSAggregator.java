/*
 * Copyright 2002-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package iaw.pc.runtime;

import iaw.pc.messages.Caller;
import iaw.pc.messages.EmployeeResponse;
import iaw.pc.messages.PhoneCall;

import java.util.List;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.Aggregator;


public class HRSAggregator {

	@Aggregator
	public PhoneCall aggregate(List<Message<?>> messages) throws Exception {
		
		if(messages!=null && messages.size()==2 ){
			Object message0 = messages.get(0).getPayload();
			Object message1 = messages.get(1).getPayload();
			
			if(message0 instanceof PhoneCall){
				((PhoneCall) message0).setCaller(transformEmployeeResponseToCaller((EmployeeResponse) message1, ((PhoneCall) message0).getCaller()));
				return (PhoneCall) message0;
			}else if(message1 instanceof PhoneCall){
				((PhoneCall) message1).setCaller(transformEmployeeResponseToCaller((EmployeeResponse) message0, ((PhoneCall) message1).getCaller()));
				return (PhoneCall)message1;
			}else{
				throw new Exception("Invalid Class in correlation");
			}
		}
		return null;
	}

	private Caller transformEmployeeResponseToCaller(EmployeeResponse employeeResponse, Caller caller) {
		caller.setName(employeeResponse.getName());
		caller.setEmail(employeeResponse.getEmail());
		caller.setPhone(employeeResponse.getPhone());
		caller.setDepartment(employeeResponse.getDepartment());
		return caller;
	}
}
