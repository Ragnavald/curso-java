package padroes.observer;

public interface ChegadaAniversarianteObservador {

	//QUEM FIZER PARTE DESSA INTERFACE É OBRIGADO DECLARAR ESSE MÉTODO
	//É NECESSÁRIO QUE EXISTA UM OBJETO DA CLASSE EventoChegadaAniversariante 
	//ESSE É O PADRÃO OBSERVER, É NECESSÁRIO EXISTIR UM EVENTO DE ANTEMÃO
	public void chegou(EventoChegadaAniversariante evento);
	
}
