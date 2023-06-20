package padroes.observer2;

public class Portaria {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Porteiro p1 = new Porteiro();
		
		p1.addObservador(c1);
		p1.monitorar();
		
	}
	
}
