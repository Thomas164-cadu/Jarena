package br.uffs.cc.jarena;

public class AgenteJunto extends Agente {
    
    public AgenteJunto(Integer x, Integer y, Integer energia) {
		super(x, y, energia);
		setDirecao(geraDirecaoAleatoria());
	}
	
	public void pensa() {
		if(!podeMoverPara(getDirecao())) {
			setDirecao(geraDirecaoAleatoria());
		}
	}
	
	public void recebeuEnergia() {
	}
	
	public void tomouDano(int energiaRestanteInimigo) {
	}
	
	public void ganhouCombate() {
	}
	
	public void recebeuMensagem(String msg) {
	}
	
	public String getEquipe() {
		return "Cadu";
	}
}
