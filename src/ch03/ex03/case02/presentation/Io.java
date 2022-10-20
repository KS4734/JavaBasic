package ch03.ex03.case02.presentation;

import ch03.ex03.case02.service.Service;

public class Io {
	
	private Service service;
	
	public Io(Service service) {
		this.service = service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	public void greed() {
		System.out.println(service.greet());
	}
	
}
