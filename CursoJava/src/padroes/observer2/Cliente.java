package padroes.observer2;

public class Cliente implements EventoObservador {

	@Override
	public void chegou(EventoAcontece e) {
	System.out.println("Ir buscar pedido");
		
	}
}
