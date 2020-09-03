package br.fatec.combustivel.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.fatec.combustivel.model.Combustivel;

@ManagedBean
@RequestScoped
public class CombustivelBean {
	private Combustivel combustivel = new Combustivel();
	private String melhor;

	public CombustivelBean() {
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public String getMelhor() {
		return melhor;
	}

	public void setMelhor(String melhor) {
		this.melhor = melhor;
	}
	
	public String melhorCombustivel() {
		if (combustivel.getAlcool() / combustivel.getGasolina() > 0.7) {
			melhor = "Gasolina";
		}
		else {
			melhor = "Alcool";
		}
		return null;
	}
	
}
