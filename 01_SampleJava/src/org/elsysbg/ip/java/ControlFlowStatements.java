package org.elsysbg.ip.java;

public class ControlFlowStatements {

	public static void main(String[] args) {

		forExample();
	}

	private static void forExample() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	private static void ifExample() {
		if (true) {
			System.out.println("called");
		}
		if (1>2) {
			System.out.println("not called");
		} else {
			System.out.println("called");
		}
	}

}
