package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservador {

	@Override
	public void chegou(EventoChegadaAniversariante evento) {

		System.out.println("Avisar Convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Surpresa!!!");
		
	}
}
