package test;
import java.text.DecimalFormat;
public class Impreciones extends Concecionaria{
	DecimalFormat formateador;
	Impreciones(){
		formateador= new DecimalFormat("#,###.00");
	}
	protected void ImprimirVehiculos() {
		for(Vehiculo v:this.listaVehiculos) {
			if(v instanceof Moto)
				System.out.println("Marca:" +v.getMarca()+ "//Modelo:"+v.getModelo()+"//Cilindrada:"+((Moto)v).getCilindrada()+"//Precio:$"+formateador.format (v.getPrecio()));
			else
				System.out.println("Marca:" +v.getMarca()+ "//Modelo:"+v.getModelo()+"//Puertas:"+((Auto)v).getPuertas()+"//Precio:$"+formateador.format (v.getPrecio()));
		}	
	}
	protected void ImprimirMasBarato() {
		Vehiculo v=this.masBarato();		 
		System.out.println("Vehículo más barato:"+"  " +v.getMarca()+ " "+v.getModelo() );
	}
	protected void ImprimirVehiculoContiene() {
		for(Vehiculo v:this. contieneletra('Y')){
			System.out.println("Vehículo que contiene en el modelo la letra ‘Y’:"+v.getMarca()+ " " + v.getModelo()+ "  " +  "$"+formateador.format(v.getPrecio()));
		} 		 
	}
	protected void ImprimirMasCaro() {
		Vehiculo v=this.masCaro();		 
		System.out.println("Vehículo más caro:"+"  " +v.getMarca()+ " "+v.getModelo() );
	}
	protected void ImprimirVehiculoOrdenado() {
		System.out.println("Vehículos ordenados por precio de mayor a menor:\n");
		for(Vehiculo v:this.vehiculosOrdenadoPrecioMayaMenor()){
			System.out.println(v.getMarca()+ " "+v.getModelo());
		}
	}
 
 
 
}
