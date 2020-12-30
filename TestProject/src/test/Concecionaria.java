package test;
import java.util.*;

public class Concecionaria {
	ArrayList<Vehiculo> listaVehiculos=new ArrayList<Vehiculo>();
	
	public void cargarVehiculos()
	{
		listaVehiculos.add(new Auto("Peugeot","206",200000.00,4));
		listaVehiculos.add(new Moto("Honda","Titan",60000.00,"125cc"));
		listaVehiculos.add(new Auto("Peugeot","208",250000.00,5));
		
		listaVehiculos.add(new Moto("Yamaha ","YBR ",80500.50,"160cc"));
	}
	public Vehiculo masBarato() {		 
		 Collections.sort(this.listaVehiculos);
		 return listaVehiculos.get(0);
	} 
    public ArrayList<Vehiculo> vehiculosOrdenadoPrecioMayaMenor() {
    	Collections.sort(this.listaVehiculos,Collections.reverseOrder());   	
    	return this.listaVehiculos;
    }
	public Vehiculo masCaro() {		 
		 Collections.sort(this.listaVehiculos,Collections.reverseOrder());
		 return listaVehiculos.get(0);
	} 
	public ArrayList<Vehiculo> contieneletra(char buscado) {
		ArrayList<Vehiculo>coincidencias=new ArrayList<Vehiculo>();
		for(Vehiculo v:listaVehiculos) {
			int index=v.getModelo().indexOf(buscado);
			if(index>-1) {
				coincidencias.add(v);
			}
		}
	return coincidencias;
	}
	
	 
}
