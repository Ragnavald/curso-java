package padroes.observer2;

import java.util.Date;

public class EventoAcontece {

	private Date momento;
	EventoAcontece(){
		momento = new Date();
	}
	void getData(){
		System.out.println(momento);
	}
}
