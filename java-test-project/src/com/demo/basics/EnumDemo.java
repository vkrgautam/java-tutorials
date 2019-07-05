package com.demo.basics;

enum TrafficSignal {
	RED("Wait"), GREEN("Go"), YELLOW("Slow Down");

	private String action;

	TrafficSignal(String action) {
		this.action = action;
	}

	public String getAction() {
		return this.action;
	}
}

public class EnumDemo {
	
	public static void main(String args[]) {
		
		TrafficSignal[] signals = TrafficSignal.values();
		for (TrafficSignal signal : signals) {
			System.out.println("Color : " + signal.name() + ", Action: " + signal.getAction());
		}
	}
}
