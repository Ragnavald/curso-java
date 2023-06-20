package padroes.observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Porteiro {
	
	List<EventoObservador> observadores = new ArrayList<>();
	
	void addObservador(EventoObservador o) {
		observadores.add(o);
	}
	
	void monitorar() {
		
		String valor = "";
		Scanner sc = new Scanner(System.in);
		while (!valor.equalsIgnoreCase("S")) {
			System.out.println("Chegou? ");
			valor = sc.nextLine();
			if (valor.equalsIgnoreCase("S")) {
				chamarObservadores(observadores);
			} else {
				continue;
			}
			
		}
		sc.close();
	}
	
	static void chamarObservadores(List<EventoObservador> list) {
		
		list.stream().forEach(o -> {
			
			o.chegou(new EventoAcontece());
			
		});
		
	}
	
}
