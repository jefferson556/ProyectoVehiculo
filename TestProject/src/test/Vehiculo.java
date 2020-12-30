package test;

public class Vehiculo implements Comparable< Vehiculo > {
protected String Marca;
protected String Modelo;
protected Double Precio;
	Vehiculo ( String Marca,String Modelo,Double Precio){
	    this.setMarca(Marca);
	    this.setModelo(Modelo);
	    this.setPrecio(Precio);
	  }
	String getMarca() {
		return Marca;
	}
	void setMarca(String marca) {
		Marca = marca;
	}
	String getModelo() {
		return Modelo;
	}
	void setModelo(String modelo) {
		Modelo = modelo;
	}
	Double getPrecio() {
		return Precio;
	}
	void setPrecio(Double precio) {
		Precio = precio;
	}
	 @Override
	    public int compareTo(Vehiculo o) {
	        return this.getPrecio().compareTo(o.getPrecio());
	    }
}
