package test;

public class Auto extends Vehiculo {
	  protected Integer Puertas;
	   Auto (String Marca,String Modelo,Double Precio,Integer Puertas){
	    super(Marca,Modelo,Precio);
	    this.Puertas=Puertas;
	  }
	Integer getPuertas() {
		return Puertas;
	}
	void setPuertas(Integer puertas) {
		Puertas = puertas;
	}
}
