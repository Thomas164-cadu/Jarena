package br.uffs.cc.jarena;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Carlos extends Agente {
    
    public Carlos(Integer x, Integer y, Integer energia) {
		super(x, y, energia);
	}
	
	public boolean ganhouBatalha;

	public void pensa() {
		if(getX() == 400 || getY() == 400){
			setDirecao(geraDirecaoAleatoria());
		}

		if(!podeMoverPara(getDirecao())) {
			setDirecao(geraDirecaoAleatoria());
		}
	}
	
	public void recebeuEnergia() {
		enviaMensagem("Para");
	}
	
	public void tomouDano(int energiaRestanteInimigo) {
		if(energiaRestanteInimigo > getEnergia()){
			setDirecao(geraDirecaoAleatoria());
		}
	}

	public void ganhouCombate(){
		if(getEnergia() > 800 && podeDividir()){
			divide();
			setDirecao(geraDirecaoAleatoria());
		}
		ganhouBatalha = true;
	}

	public void recebeuMensagem(String msg){
		if(!podeMoverPara(getDirecao())){
			para();
		}else{
			setDirecao(geraDirecaoAleatoria());
		}
	}

	
	public String getEquipe() {
		return "Cadu";
	}
}
