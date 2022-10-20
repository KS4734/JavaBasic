package ch03.ex03.case02;

import ch03.ex03.case02.presentation.Io;
import ch03.ex03.case02.service.Service;
import ch03.ex03.case02.service.ServiceEng;
import ch03.ex03.case02.service.ServiceKor;

public class Main {
	public static void main(String[] args) {

		Service serviceKor = new ServiceKor();
		Service serviceEng = new ServiceEng();
		
		Io io = new Io(serviceKor);
		io.greed();
		
		io.setService(serviceEng);
		io.greed();
	}

}
