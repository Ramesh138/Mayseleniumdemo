package com.seleniumprograms.testng;

import org.testng.annotations.DataProvider;

public class GetData {

	@DataProvider(name = "TC1")
	public Object[][] TC1() {
		return new Object[][] { { "Ponneri", "Ramesh", "Ramesh Ponneri", "Ponneriramesh@gmail.com" },

		};
	}

	@DataProvider(name = "TC2")
	public Object[][] TC2() {
		return new Object[][] { { "Ponneri", "Narasimha", "Narasimha Ponneri", "Narasimhah@gmail.com" },

		};
	}

	@DataProvider(name = "TC3")
	public Object[][] TC3() {
		return new Object[][] { { "Sow", "Bhagya", "Sow Bhagya", "Sowbhagya@gmail.com" }, };
	}
}
