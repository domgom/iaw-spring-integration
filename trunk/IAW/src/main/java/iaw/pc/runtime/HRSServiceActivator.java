package iaw.pc.runtime;

import iaw.pc.messages.EmployeeRequest;
import iaw.pc.messages.EmployeeResponse;

import java.util.HashMap;
import java.util.Map;

public class HRSServiceActivator {

	private static Map<String, EmployeeResponse> employees = new HashMap<String, EmployeeResponse>();

	static {
		employees.put("1", new EmployeeResponse("1", "Alberto Calleja",
				"acalleja@us.es", "555123456", "LSI", "A1", Float.valueOf(40),
				"Dr"));
		employees.put("2", new EmployeeResponse("2", "Domingo Gómez",
				"domgom@gmail.com", "5551234195", "MA1", "A4", Float.valueOf(40),
				"Dr"));
		employees.put("3", new EmployeeResponse("3", "José Manuel Lara",
				"joslarsal@us.es", "555123456", "LSI", "A1", Float.valueOf(40),
				"Dr"));
		employees.put("4", new EmployeeResponse("4", "Jesús García",
				"jgarcia@us.es", "555123782", "DTE", "B1", Float.valueOf(20),
				"Dr"));
		employees.put("5", new EmployeeResponse("5", "Rosa Yañez",
				"ryanez@us.es", "555213496", "LSI", "A1", Float.valueOf(40),
				"Dra"));
	}

	public EmployeeResponse queryHRS(EmployeeRequest request) {
		//Employee map simulates a db access
		return employees.get(request.getEmployeeId());
	}
}
