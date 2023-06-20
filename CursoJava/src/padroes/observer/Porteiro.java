package padroes.observer;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Porteiro {

	//VAI TER UMA LISTA DE OBSERVADORES QUE SERÃO NOTIFICADOS
	private List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();
	
	public void registrarObservador(ChegadaAniversarianteObservador o) {
		observadores.add(o);
	}
	
	public void monitorar() {
		
		Scanner sc = new Scanner(System.in);
		String valor = "";	
		
		while(!"sair".equals(valor)) {
			
			System.out.println("Aniversariante Chegou?");
			valor = sc.nextLine();
			if ("sim".equalsIgnoreCase(valor)) {
				//NOTIFICAR OBSERVADORES
				observadores.stream().forEach(p ->{
					p.chegou(new EventoChegadaAniversariante(new Date()));
				});
			}else {
				System.out.println("Alarme falso!");
			}
		}
		
		sc.close();
	}
	
}
