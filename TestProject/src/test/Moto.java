package test;

public class Moto extends Vehiculo{
	  protected String Cilindrada;
	   Moto (String Marca,String Modelo,Double Precio,String Cilindrada)
	   {
	     super(Marca,Modelo,Precio);
	     this.setCilindrada(Cilindrada);
	   }
	String getCilindrada() {
		return Cilindrada;
	}
	void setCilindrada(String cilindrada) {
		Cilindrada = cilindrada;
	}
	    
}
