package ar.edu.utn.frba.dds.pepita;

public class Golondrina {
	private int energia;

	public Golondrina(int _energia){
		this.energia = _energia;
	}
	public void comer(int alpiste){
		this.energia += alpiste * 3;
	}
	public void volar() {
		this.energia = this.energia - 10;
	}

	public int getEnergia() { return energia; }
}

