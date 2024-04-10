package ar.edu.utn.frba.dds.pepita;

/**
 * La clase Golondrina representa a un ave del tipo golondrina.
 */
public class Golondrina {

  public int energia;

  public Golondrina(int energia) {
    this.energia = energia;
  }

  public void comer(int alpiste) {
    this.energia += alpiste * 3;
  }

  public void volar() {
    this.energia = this.energia - 10;
  }

  public int getEnergia() {
    return energia;
  }
}

